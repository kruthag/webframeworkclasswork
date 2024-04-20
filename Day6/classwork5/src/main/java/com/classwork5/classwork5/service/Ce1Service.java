package com.classwork5.classwork5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.classwork5.classwork5.model.Ce1Model;
import com.classwork5.classwork5.repository.Ce1Repo;

@Service
public class Ce1Service {
    @Autowired
    public Ce1Repo repo;

    public void saveMethod(Ce1Model cm)
    {
        repo.save(cm);
    }
    public List<Ce1Model> sortedmethod(String f)
    {
        return repo.sorted(f);
    }
    public List<Ce1Model> pagedMethod(int strt, int page)
    {
        Page<Ce1Model> pg=repo.findAll(PageRequest.of(strt, page));
        return pg.getContent();
    }
    public List<Ce1Model> pageMethod(int strt, int page,String field)
    {
        Page<Ce1Model> pg=repo.findAll(PageRequest.of(strt,page,Sort.by(field)));
        
        return pg.getContent();
    }
}
