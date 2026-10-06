package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class planzar extends GXProcedure
{
   public planzar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( planzar.class ), "" );
   }

   public planzar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      planzar.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      planzar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      planzar.this.A2792TermiCod = aP1[0];
      this.aP1 = aP1;
      planzar.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      planzar.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      planzar.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      planzar.this.AV75Flagope = aP5[0];
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
      this.aP0[0] = planzar.this.A396EmprCod;
      this.aP1[0] = planzar.this.A2792TermiCod;
      this.aP2[0] = planzar.this.A129BarCod;
      this.aP3[0] = planzar.this.A132BarCodReo;
      this.aP4[0] = planzar.this.A130BarCodPar;
      this.aP5[0] = planzar.this.AV75Flagope;
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
   private String A2792TermiCod ;
   private String A130BarCodPar ;
   private String AV75Flagope ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
}

