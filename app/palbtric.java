package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbtric extends GXProcedure
{
   public palbtric( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbtric.class ), "" );
   }

   public palbtric( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      palbtric.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 )
   {
      palbtric.this.AV12EmprCod = aP0[0];
      this.aP0 = aP0;
      palbtric.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      palbtric.this.AV11barCodReo = aP2[0];
      this.aP2 = aP2;
      palbtric.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      palbtric.this.AV8AlbProCod = aP4[0];
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
      this.aP0[0] = palbtric.this.AV12EmprCod;
      this.aP1[0] = palbtric.this.AV9BarCod;
      this.aP2[0] = palbtric.this.AV11barCodReo;
      this.aP3[0] = palbtric.this.AV10BarCodPar;
      this.aP4[0] = palbtric.this.AV8AlbProCod;
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

   private byte AV11barCodReo ;
   private short Gx_err ;
   private int AV9BarCod ;
   private long AV8AlbProCod ;
   private String AV12EmprCod ;
   private String AV10BarCodPar ;
   private long[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
}

