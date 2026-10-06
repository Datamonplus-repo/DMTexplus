package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarsua extends GXProcedure
{
   public pbarsua( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarsua.class ), "" );
   }

   public pbarsua( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           java.util.Date[] aP1 ,
                           java.util.Date[] aP2 ,
                           java.util.Date[] aP3 ,
                           long[] aP4 ,
                           long[] aP5 ,
                           java.util.Date[] aP6 ,
                           byte[] aP7 ,
                           byte[] aP8 )
   {
      pbarsua.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        long[] aP4 ,
                        long[] aP5 ,
                        java.util.Date[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             long[] aP4 ,
                             long[] aP5 ,
                             java.util.Date[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 )
   {
      pbarsua.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarsua.this.AV27Fec1 = aP1[0];
      this.aP1 = aP1;
      pbarsua.this.AV28Fec2 = aP2[0];
      this.aP2 = aP2;
      pbarsua.this.AV29FacFch = aP3[0];
      this.aP3 = aP3;
      pbarsua.this.AV30FacCodi = aP4[0];
      this.aP4 = aP4;
      pbarsua.this.AV31FacCodf = aP5[0];
      this.aP5 = aP5;
      pbarsua.this.AV32FacHor = aP6[0];
      this.aP6 = aP6;
      pbarsua.this.AV33Tablas = aP7[0];
      this.aP7 = aP7;
      pbarsua.this.AV34Opcion = aP8[0];
      this.aP8 = aP8;
      pbarsua.this.AV35NoCont = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Procesado Firma Digital...", "") );
      if ( AV33Tablas == 1 )
      {
         /* Using cursor P005G2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV27Fec1, Long.valueOf(AV30FacCodi), Long.valueOf(AV31FacCodf), AV28Fec2});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A34AlbProfch = P005G2_A34AlbProfch[0] ;
            A30AlbProCod = P005G2_A30AlbProCod[0] ;
            A39AlbProPri = P005G2_A39AlbProPri[0] ;
            Gx_msg = httpContext.getMessage( "Voy a PpFIRMA.AlbProcod=", "") + GXutil.str( A30AlbProCod, 8, 0) ;
            System.out.println( Gx_msg );
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A30AlbProCod ;
            GXv_date3[0] = AV29FacFch ;
            GXv_dtime4[0] = AV32FacHor ;
            GXv_int5[0] = AV33Tablas ;
            GXv_int6[0] = AV34Opcion ;
            GXv_int7[0] = AV35NoCont ;
            new app.pdelprb(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_date3, GXv_dtime4, GXv_int5, GXv_int6, GXv_int7) ;
            pbarsua.this.A396EmprCod = GXv_char1[0] ;
            pbarsua.this.A30AlbProCod = GXv_int2[0] ;
            pbarsua.this.AV29FacFch = GXv_date3[0] ;
            pbarsua.this.AV32FacHor = GXv_dtime4[0] ;
            pbarsua.this.AV33Tablas = GXv_int5[0] ;
            pbarsua.this.AV34Opcion = GXv_int6[0] ;
            pbarsua.this.AV35NoCont = GXv_int7[0] ;
            Gx_msg = httpContext.getMessage( "Firmada ALbProcod=", "") + GXutil.str( A30AlbProCod, 8, 0) ;
            System.out.println( Gx_msg );
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P005G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV27Fec1, Long.valueOf(AV30FacCodi), Long.valueOf(AV31FacCodf), AV28Fec2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A17AlbComFch = P005G3_A17AlbComFch[0] ;
            A14AlbComCod = P005G3_A14AlbComCod[0] ;
            A4829AlbComHor = P005G3_A4829AlbComHor[0] ;
            A22AlbComPri = P005G3_A22AlbComPri[0] ;
            Gx_msg = httpContext.getMessage( "Voy a PpFIRMA.Albcomcod=", "") + GXutil.str( A14AlbComCod, 8, 0) ;
            System.out.println( Gx_msg );
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A14AlbComCod ;
            GXv_date3[0] = AV29FacFch ;
            GXv_dtime4[0] = A4829AlbComHor ;
            GXv_int7[0] = AV33Tablas ;
            GXv_int6[0] = AV34Opcion ;
            GXv_int5[0] = AV35NoCont ;
            new app.pdelprb(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_date3, GXv_dtime4, GXv_int7, GXv_int6, GXv_int5) ;
            pbarsua.this.A396EmprCod = GXv_char1[0] ;
            pbarsua.this.A14AlbComCod = (int)((int)(GXv_int2[0])) ;
            pbarsua.this.AV29FacFch = GXv_date3[0] ;
            pbarsua.this.A4829AlbComHor = GXv_dtime4[0] ;
            pbarsua.this.AV33Tablas = GXv_int7[0] ;
            pbarsua.this.AV34Opcion = GXv_int6[0] ;
            pbarsua.this.AV35NoCont = GXv_int5[0] ;
            Gx_msg = httpContext.getMessage( "Firmada ALbcomcod=", "") + GXutil.str( A14AlbComCod, 8, 0) ;
            System.out.println( Gx_msg );
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarsua.this.A396EmprCod;
      this.aP1[0] = pbarsua.this.AV27Fec1;
      this.aP2[0] = pbarsua.this.AV28Fec2;
      this.aP3[0] = pbarsua.this.AV29FacFch;
      this.aP4[0] = pbarsua.this.AV30FacCodi;
      this.aP5[0] = pbarsua.this.AV31FacCodf;
      this.aP6[0] = pbarsua.this.AV32FacHor;
      this.aP7[0] = pbarsua.this.AV33Tablas;
      this.aP8[0] = pbarsua.this.AV34Opcion;
      this.aP9[0] = pbarsua.this.AV35NoCont;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P005G2_A396EmprCod = new String[] {""} ;
      P005G2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P005G2_A30AlbProCod = new long[1] ;
      P005G2_A39AlbProPri = new String[] {""} ;
      A34AlbProfch = GXutil.nullDate() ;
      A39AlbProPri = "" ;
      Gx_msg = "" ;
      P005G3_A396EmprCod = new String[] {""} ;
      P005G3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P005G3_A14AlbComCod = new int[1] ;
      P005G3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P005G3_A22AlbComPri = new String[] {""} ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A22AlbComPri = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_dtime4 = new java.util.Date[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarsua__default(),
         new Object[] {
             new Object[] {
            P005G2_A396EmprCod, P005G2_A34AlbProfch, P005G2_A30AlbProCod, P005G2_A39AlbProPri
            }
            , new Object[] {
            P005G3_A396EmprCod, P005G3_A17AlbComFch, P005G3_A14AlbComCod, P005G3_A4829AlbComHor, P005G3_A22AlbComPri
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33Tablas ;
   private byte AV34Opcion ;
   private byte AV35NoCont ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private long AV30FacCodi ;
   private long AV31FacCodf ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String Gx_msg ;
   private String A22AlbComPri ;
   private String GXv_char1[] ;
   private java.util.Date AV32FacHor ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date GXv_dtime4[] ;
   private java.util.Date AV27Fec1 ;
   private java.util.Date AV28Fec2 ;
   private java.util.Date AV29FacFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date GXv_date3[] ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private long[] aP4 ;
   private long[] aP5 ;
   private java.util.Date[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P005G2_A396EmprCod ;
   private java.util.Date[] P005G2_A34AlbProfch ;
   private long[] P005G2_A30AlbProCod ;
   private String[] P005G2_A39AlbProPri ;
   private String[] P005G3_A396EmprCod ;
   private java.util.Date[] P005G3_A17AlbComFch ;
   private int[] P005G3_A14AlbComCod ;
   private java.util.Date[] P005G3_A4829AlbComHor ;
   private String[] P005G3_A22AlbComPri ;
}

final  class pbarsua__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005G2", "SELECT EmprCod, AlbProfch, AlbProCod, AlbProPri FROM TXPCALPRD WHERE (EmprCod = ? and AlbProfch >= ?) AND (AlbProCod >= ?) AND (AlbProCod <= ?) AND (AlbProfch <= ?) ORDER BY EmprCod, AlbProfch, AlbProPri, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P005G3", "SELECT EmprCod, AlbComFch, AlbComCod, AlbComHor, AlbComPri FROM TXPCALCOM WHERE (EmprCod = ? and AlbComFch >= ?) AND (AlbComCod >= ?) AND (AlbComCod <= ?) AND (AlbComFch <= ?) ORDER BY EmprCod, AlbComFch, AlbComPri, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
      }
   }

}

