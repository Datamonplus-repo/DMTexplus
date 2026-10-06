package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pedirep extends GXProcedure
{
   public pedirep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedirep.class ), "" );
   }

   public pedirep( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      pedirep.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 )
   {
      pedirep.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pedirep.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pedirep.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pedirep.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pedirep.this.AV18DisComLin = aP4[0];
      this.aP4 = aP4;
      pedirep.this.AV19DisComCod = aP5[0];
      this.aP5 = aP5;
      pedirep.this.AV20FonCod = aP6[0];
      this.aP6 = aP6;
      pedirep.this.AV21BarCodLan = aP7[0];
      this.aP7 = aP7;
      pedirep.this.AV51filename = aP8[0];
      this.aP8 = aP8;
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
      this.aP0[0] = pedirep.this.A396EmprCod;
      this.aP1[0] = pedirep.this.AV15BarCod;
      this.aP2[0] = pedirep.this.AV16BarCodReo;
      this.aP3[0] = pedirep.this.AV17BarCodPar;
      this.aP4[0] = pedirep.this.AV18DisComLin;
      this.aP5[0] = pedirep.this.AV19DisComCod;
      this.aP6[0] = pedirep.this.AV20FonCod;
      this.aP7[0] = pedirep.this.AV21BarCodLan;
      this.aP8[0] = pedirep.this.AV51filename;
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

   private byte AV16BarCodReo ;
   private byte AV18DisComLin ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV21BarCodLan ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV19DisComCod ;
   private String AV20FonCod ;
   private String AV51filename ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
}

