package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rhdrjbm extends GXProcedure
{
   public rhdrjbm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrjbm.class ), "" );
   }

   public rhdrjbm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      rhdrjbm.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      rhdrjbm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhdrjbm.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rhdrjbm.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rhdrjbm.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rhdrjbm.this.AV114NomImpre = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rhdrjbm.this.A396EmprCod;
      this.aP1[0] = rhdrjbm.this.A129BarCod;
      this.aP2[0] = rhdrjbm.this.A132BarCodReo;
      this.aP3[0] = rhdrjbm.this.A130BarCodPar;
      this.aP4[0] = rhdrjbm.this.AV114NomImpre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV114NomImpre ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
}

