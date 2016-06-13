package com.natura.service.function;

import java.util.ArrayList;
import java.util.List;

import com.natura.service.dto.ProdutoDto;
import com.natura.service.model.Produto;

/**
 * Created by Murillo on 12/06/2016.
 */
public class ProdutoEntityToDto {

    public List<ProdutoDto> apply(List<Produto> produtos) {
        List<ProdutoDto> produtosDto = new ArrayList<ProdutoDto>();
        for(Produto p : produtos) {
        	produtosDto.add(apply(p));
        }
        return produtosDto;
    }
    
    public ProdutoDto apply(Produto produto) {
    	ProdutoDto pDto = new ProdutoDto();
    	pDto.setId(produto.getId());
    	pDto.setNome(produto.getNome());
    	pDto.setValor(produto.getValor());
    	return pDto;
    }
}
