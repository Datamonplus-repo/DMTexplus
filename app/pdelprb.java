package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelprb extends GXProcedure
{
   public pdelprb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelprb.class ), "" );
   }

   public pdelprb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 ,
                           java.util.Date[] aP2 ,
                           java.util.Date[] aP3 ,
                           byte[] aP4 ,
                           byte[] aP5 )
   {
      pdelprb.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pdelprb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelprb.this.AV22FacCod = aP1[0];
      this.aP1 = aP1;
      pdelprb.this.AV23FacFch = aP2[0];
      this.aP2 = aP2;
      pdelprb.this.AV24FacHor = aP3[0];
      this.aP3 = aP3;
      pdelprb.this.AV39Tablas = aP4[0];
      this.aP4 = aP4;
      pdelprb.this.AV40Opcion = aP5[0];
      this.aP5 = aP5;
      pdelprb.this.AV43NoCont = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV22FacCod ;
      GXv_date3[0] = AV23FacFch ;
      GXv_dtime4[0] = AV24FacHor ;
      GXv_int5[0] = AV39Tablas ;
      GXv_int6[0] = AV40Opcion ;
      GXv_int7[0] = AV43NoCont ;
      GXv_char8[0] = AV44Msg_dpkey ;
      GXv_char9[0] = "" ;
      new app.pdelprbajustado(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_date3, GXv_dtime4, GXv_int5, GXv_int6, GXv_int7, GXv_char8, GXv_char9) ;
      pdelprb.this.A396EmprCod = GXv_char1[0] ;
      pdelprb.this.AV22FacCod = GXv_int2[0] ;
      pdelprb.this.AV23FacFch = GXv_date3[0] ;
      pdelprb.this.AV24FacHor = GXv_dtime4[0] ;
      pdelprb.this.AV39Tablas = GXv_int5[0] ;
      pdelprb.this.AV40Opcion = GXv_int6[0] ;
      pdelprb.this.AV43NoCont = GXv_int7[0] ;
      pdelprb.this.AV44Msg_dpkey = GXv_char8[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelprb.this.A396EmprCod;
      this.aP1[0] = pdelprb.this.AV22FacCod;
      this.aP2[0] = pdelprb.this.AV23FacFch;
      this.aP3[0] = pdelprb.this.AV24FacHor;
      this.aP4[0] = pdelprb.this.AV39Tablas;
      this.aP5[0] = pdelprb.this.AV40Opcion;
      this.aP6[0] = pdelprb.this.AV43NoCont;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_dtime4 = new java.util.Date[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      AV44Msg_dpkey = "" ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV39Tablas ;
   private byte AV40Opcion ;
   private byte AV43NoCont ;
   private byte GXv_int5[] ;
   private byte GXv_int6[] ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private long AV22FacCod ;
   private long GXv_int2[] ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String AV44Msg_dpkey ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private java.util.Date AV24FacHor ;
   private java.util.Date GXv_dtime4[] ;
   private java.util.Date AV23FacFch ;
   private java.util.Date GXv_date3[] ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
}

