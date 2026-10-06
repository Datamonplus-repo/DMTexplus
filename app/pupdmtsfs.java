package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdmtsfs extends GXProcedure
{
   public pupdmtsfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdmtsfs.class ), "" );
   }

   public pupdmtsfs( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pupdmtsfs.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pupdmtsfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdmtsfs.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pupdmtsfs.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pupdmtsfs.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pupdmtsfs.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pupdmtsfs.this.AV9BarAlbKgmE = aP5[0];
      this.aP5 = aP5;
      pupdmtsfs.this.AV8BarAlbMtrE = aP6[0];
      this.aP6 = aP6;
      pupdmtsfs.this.AV12usurcod = aP7[0];
      this.aP7 = aP7;
      pupdmtsfs.this.AV13station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "PMLHDR", "") ;
      GXv_int3[0] = AV11ValPml ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      pupdmtsfs.this.A396EmprCod = GXv_char1[0] ;
      pupdmtsfs.this.AV11ValPml = GXv_int3[0] ;
      AV15Messages.clear();
      /* Using cursor P04ZV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P04ZV2_A457FasCod[0] ;
         A4903FasAcab = P04ZV2_A4903FasAcab[0] ;
         n4903FasAcab = P04ZV2_n4903FasAcab[0] ;
         A1275FasKgm = P04ZV2_A1275FasKgm[0] ;
         A1276FasMtr = P04ZV2_A1276FasMtr[0] ;
         A1240GuiFasLin = P04ZV2_A1240GuiFasLin[0] ;
         A4903FasAcab = P04ZV2_A4903FasAcab[0] ;
         n4903FasAcab = P04ZV2_n4903FasAcab[0] ;
         AV10Pml = (int)(DecimalUtil.decToDouble(((AV8BarAlbMtrE.doubleValue()>0) ? GXutil.roundDecimal( AV9BarAlbKgmE.multiply(DecimalUtil.doubleToDec(1000)).divide(AV8BarAlbMtrE, 18, java.math.RoundingMode.DOWN), 0) : DecimalUtil.doubleToDec(0)))) ;
         if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( ( AV10Pml <= AV11ValPml ) && ( AV11ValPml > 0 ) && ( AV10Pml > 0 ) )
            {
               AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "A", "") );
               AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Fase de Acabado", "")+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Pml   ", "")+GXutil.str( AV10Pml, 8, 0)+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Ctrl  ", "")+GXutil.str( AV11ValPml, 8, 0)+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "N Guia ", "")+GXutil.str( A30AlbProCod, 10, 0)+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Kilos  ", "")+GXutil.str( A1275FasKgm, 9, 2)+httpContext.getMessage( " se cambia por 0", "")+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Metros ", "")+GXutil.str( A1276FasMtr, 9, 2)+httpContext.getMessage( " se cambia por ", "")+GXutil.str( AV8BarAlbMtrE, 9, 2)+GXutil.newLine( ) );
               AV15Messages.add(AV16Message, 0);
               A1275FasKgm = DecimalUtil.doubleToDec(0) ;
               A1276FasMtr = AV8BarAlbMtrE ;
            }
            else
            {
               AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "B", "") );
               AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Fase de Acabado", "")+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Pml   ", "")+GXutil.str( AV10Pml, 8, 0)+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Ctrl  ", "")+GXutil.str( AV11ValPml, 8, 0)+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "N Guia ", "")+GXutil.str( A30AlbProCod, 10, 0)+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Kilos  ", "")+GXutil.str( A1275FasKgm, 9, 2)+httpContext.getMessage( " se cambia por ", "")+GXutil.str( AV9BarAlbKgmE, 9, 2)+GXutil.newLine( ) );
               AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Metros ", "")+GXutil.str( A1276FasMtr, 9, 2)+httpContext.getMessage( " se cambia por 0", "")+GXutil.newLine( ) );
               AV15Messages.add(AV16Message, 0);
               A1275FasKgm = AV9BarAlbKgmE ;
               A1276FasMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         else
         {
            AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "C", "") );
            AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Fase NO Acabado", "")+GXutil.newLine( ) );
            AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "N Guia ", "")+GXutil.str( A30AlbProCod, 10, 0)+GXutil.newLine( ) );
            AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Kilos  ", "")+GXutil.str( A1275FasKgm, 9, 2)+httpContext.getMessage( " se cambia por ", "")+GXutil.str( AV9BarAlbKgmE, 9, 2)+GXutil.newLine( ) );
            AV16Message.setgxTv_SdtMessages_Message_Description( AV16Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Metros ", "")+GXutil.str( A1276FasMtr, 9, 2)+httpContext.getMessage( " se cambia por 0", "")+GXutil.newLine( ) );
            AV15Messages.add(AV16Message, 0);
            A1275FasKgm = AV9BarAlbKgmE ;
            A1276FasMtr = DecimalUtil.doubleToDec(0) ;
         }
         /* Using cursor P04ZV3 */
         pr_default.execute(1, new Object[] {A1275FasKgm, A1276FasMtr, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15Messages.size() != 0 )
      {
         AV14Inc_obs = AV15Messages.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV12usurcod, AV13station, AV14Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdmtsfs.this.A396EmprCod;
      this.aP1[0] = pupdmtsfs.this.A30AlbProCod;
      this.aP2[0] = pupdmtsfs.this.A129BarCod;
      this.aP3[0] = pupdmtsfs.this.A132BarCodReo;
      this.aP4[0] = pupdmtsfs.this.A130BarCodPar;
      this.aP5[0] = pupdmtsfs.this.AV9BarAlbKgmE;
      this.aP6[0] = pupdmtsfs.this.AV8BarAlbMtrE;
      this.aP7[0] = pupdmtsfs.this.AV12usurcod;
      this.aP8[0] = pupdmtsfs.this.AV13station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdmtsfs");
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
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      AV15Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P04ZV2_A457FasCod = new String[] {""} ;
      P04ZV2_A396EmprCod = new String[] {""} ;
      P04ZV2_A30AlbProCod = new long[1] ;
      P04ZV2_A129BarCod = new int[1] ;
      P04ZV2_A132BarCodReo = new byte[1] ;
      P04ZV2_A130BarCodPar = new String[] {""} ;
      P04ZV2_A4903FasAcab = new String[] {""} ;
      P04ZV2_n4903FasAcab = new boolean[] {false} ;
      P04ZV2_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04ZV2_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04ZV2_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A4903FasAcab = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      AV16Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV14Inc_obs = "" ;
      AV20Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdmtsfs__default(),
         new Object[] {
             new Object[] {
            P04ZV2_A457FasCod, P04ZV2_A396EmprCod, P04ZV2_A30AlbProCod, P04ZV2_A129BarCod, P04ZV2_A132BarCodReo, P04ZV2_A130BarCodPar, P04ZV2_A4903FasAcab, P04ZV2_n4903FasAcab, P04ZV2_A1275FasKgm, P04ZV2_A1276FasMtr,
            P04ZV2_A1240GuiFasLin
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PUpdMtsFs" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PUpdMtsFs" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11ValPml ;
   private int GXv_int3[] ;
   private int AV10Pml ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV9BarAlbKgmE ;
   private java.math.BigDecimal AV8BarAlbMtrE ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12usurcod ;
   private String AV13station ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A4903FasAcab ;
   private String AV20Pgmname ;
   private boolean n4903FasAcab ;
   private String AV14Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZV2_A457FasCod ;
   private String[] P04ZV2_A396EmprCod ;
   private long[] P04ZV2_A30AlbProCod ;
   private int[] P04ZV2_A129BarCod ;
   private byte[] P04ZV2_A132BarCodReo ;
   private String[] P04ZV2_A130BarCodPar ;
   private String[] P04ZV2_A4903FasAcab ;
   private boolean[] P04ZV2_n4903FasAcab ;
   private java.math.BigDecimal[] P04ZV2_A1275FasKgm ;
   private java.math.BigDecimal[] P04ZV2_A1276FasMtr ;
   private short[] P04ZV2_A1240GuiFasLin ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV15Messages ;
   private com.genexus.SdtMessages_Message AV16Message ;
}

final  class pupdmtsfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZV2", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasAcab, T1.FasKgm, T1.FasMtr, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04ZV3", "UPDATE TXPALBFAS SET FasKgm=?, FasMtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

