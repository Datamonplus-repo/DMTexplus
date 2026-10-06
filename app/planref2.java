package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class planref2 extends GXProcedure
{
   public planref2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( planref2.class ), "" );
   }

   public planref2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      planref2.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      planref2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      planref2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      planref2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      planref2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      planref2.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      planref2.this.AV93Imp_r = aP5[0];
      this.aP5 = aP5;
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
      this.aP0[0] = planref2.this.A396EmprCod;
      this.aP1[0] = planref2.this.A129BarCod;
      this.aP2[0] = planref2.this.A132BarCodReo;
      this.aP3[0] = planref2.this.A130BarCodPar;
      this.aP4[0] = planref2.this.A2804RecLinMaq;
      this.aP5[0] = planref2.this.AV93Imp_r;
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
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV93Imp_r ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
}

