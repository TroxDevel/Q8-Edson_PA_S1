/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8.pkginterface;

/**
 *
 * @author kevin
 */
interface IFilmes {
    	void filmNOME(String NOME);
	void filmCATEG(String CATEG);
        void filmANO(int ANO);
        
        
        
        public class getMetodo implements IFilmes {

        @Override
        public void filmNOME(String NOME) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void filmCATEG(String CATEG) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void filmANO(int ANO) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double getSaldo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
            
        }
}
