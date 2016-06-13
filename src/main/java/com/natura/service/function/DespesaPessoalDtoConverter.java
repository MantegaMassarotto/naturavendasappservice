package com.natura.service.function;
//package com.cargoservice.function;
//
//import com.natura.service.model.ConversorDto;
//import com.natura.service.model.DespesaPessoal;
//import com.natura.service.model.Produto;
//import com.naturaservice.dto.DespesaPessoalDto;
//
///**
// * Created by Murillo on 22/04/2016.
// */
//public class DespesaPessoalDtoConverter extends ConversorDto<DespesaPessoal, DespesaPessoalDto> {
//
//	@Override
//    public DespesaPessoal applyToEntity(DespesaPessoalDto dto) {
//        DespesaPessoal dp = new DespesaPessoal();
//        dp.setId(dto.getId());
//        dp.setValor(dto.getValor());
//        dp.setLocal(dto.getLocal());
//        dp.setData(dto.getData());
//        dp.setTipoDespesaPessoal(dto.getTipoDespesaPessoal());
//        Produto frete = new Produto();
//        frete.setId(dto.getId());
//        dp.setFrete(frete);
//        return dp;
//    }
//
//	@Override
//	public DespesaPessoalDto applyToDto(DespesaPessoal entidade) {
//		return null;
//	}
//}
