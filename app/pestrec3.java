package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestrec3 extends GXProcedure
{
   public pestrec3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestrec3.class ), "" );
   }

   public pestrec3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      pestrec3.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pestrec3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestrec3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pestrec3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pestrec3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pestrec3.this.A2524DisComLin = aP4[0];
      this.aP4 = aP4;
      pestrec3.this.A1056DisComCod = aP5[0];
      this.aP5 = aP5;
      pestrec3.this.A1032FonCod = aP6[0];
      this.aP6 = aP6;
      pestrec3.this.A2126RecMolLin = aP7[0];
      this.aP7 = aP7;
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
      this.aP0[0] = pestrec3.this.A396EmprCod;
      this.aP1[0] = pestrec3.this.A129BarCod;
      this.aP2[0] = pestrec3.this.A132BarCodReo;
      this.aP3[0] = pestrec3.this.A130BarCodPar;
      this.aP4[0] = pestrec3.this.A2524DisComLin;
      this.aP5[0] = pestrec3.this.A1056DisComCod;
      this.aP6[0] = pestrec3.this.A1032FonCod;
      this.aP7[0] = pestrec3.this.A2126RecMolLin;
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
   private byte A2524DisComLin ;
   private byte A2126RecMolLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
}

