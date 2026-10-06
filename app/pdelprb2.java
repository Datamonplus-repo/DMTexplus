package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelprb2 extends GXProcedure
{
   public pdelprb2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelprb2.class ), "" );
   }

   public pdelprb2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           java.util.Date[] aP2 ,
                           java.util.Date[] aP3 ,
                           byte[] aP4 )
   {
      pdelprb2.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 )
   {
      pdelprb2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelprb2.this.AV15FacCod = aP1[0];
      this.aP1 = aP1;
      pdelprb2.this.AV19FacFch = aP2[0];
      this.aP2 = aP2;
      pdelprb2.this.AV31FacHor = aP3[0];
      this.aP3 = aP3;
      pdelprb2.this.AV26Opcion = aP4[0];
      this.aP4 = aP4;
      pdelprb2.this.AV18NoCont = aP5[0];
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
      this.aP0[0] = pdelprb2.this.A396EmprCod;
      this.aP1[0] = pdelprb2.this.AV15FacCod;
      this.aP2[0] = pdelprb2.this.AV19FacFch;
      this.aP3[0] = pdelprb2.this.AV31FacHor;
      this.aP4[0] = pdelprb2.this.AV26Opcion;
      this.aP5[0] = pdelprb2.this.AV18NoCont;
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

   private byte AV26Opcion ;
   private byte AV18NoCont ;
   private short Gx_err ;
   private int AV15FacCod ;
   private String A396EmprCod ;
   private java.util.Date AV31FacHor ;
   private java.util.Date AV19FacFch ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private byte[] aP4 ;
}

