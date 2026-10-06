package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rhdrvin extends GXProcedure
{
   public rhdrvin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrvin.class ), "" );
   }

   public rhdrvin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      rhdrvin.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      rhdrvin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhdrvin.this.AV33BarCod = aP1[0];
      this.aP1 = aP1;
      rhdrvin.this.AV34BarCodReo = aP2[0];
      this.aP2 = aP2;
      rhdrvin.this.AV13BarCodPar = aP3[0];
      this.aP3 = aP3;
      rhdrvin.this.AV71NCopias = aP4[0];
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
      this.aP0[0] = rhdrvin.this.A396EmprCod;
      this.aP1[0] = rhdrvin.this.AV33BarCod;
      this.aP2[0] = rhdrvin.this.AV34BarCodReo;
      this.aP3[0] = rhdrvin.this.AV13BarCodPar;
      this.aP4[0] = rhdrvin.this.AV71NCopias;
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

   private byte AV34BarCodReo ;
   private byte AV71NCopias ;
   private short Gx_err ;
   private int AV33BarCod ;
   private String A396EmprCod ;
   private String AV13BarCodPar ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
}

