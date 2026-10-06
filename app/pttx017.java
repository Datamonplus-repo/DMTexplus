package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pttx017 extends GXProcedure
{
   public pttx017( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pttx017.class ), "" );
   }

   public pttx017( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 ,
                                           java.math.BigDecimal[] aP6 )
   {
      pttx017.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pttx017.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pttx017.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pttx017.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pttx017.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pttx017.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pttx017.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pttx017.this.AV11ForPreKgm = aP6[0];
      this.aP6 = aP6;
      pttx017.this.AV12ForPreMtr = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pttx017.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      pttx017.this.A396EmprCod = GXv_char2[0] ;
      pttx017.this.AV14EmprNom = GXv_char3[0] ;
      pttx017.this.AV16Usurcod = GXv_char4[0] ;
      AV19messages.clear();
      /* Using cursor P01702 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A492ForPreKgm = P01702_A492ForPreKgm[0] ;
         n492ForPreKgm = P01702_n492ForPreKgm[0] ;
         A493ForPreMtr = P01702_A493ForPreMtr[0] ;
         n493ForPreMtr = P01702_n493ForPreMtr[0] ;
         A491ForPreDef = P01702_A491ForPreDef[0] ;
         n491ForPreDef = P01702_n491ForPreDef[0] ;
         AV18message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV18message.setgxTv_SdtMessages_Message_Id( "0" );
         AV18message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Actualizo Precio Ficha Color", "") );
         AV18message.setgxTv_SdtMessages_Message_Description( AV18message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Cliente = ", "")+GXutil.str( A252CliCod, 6, 0) );
         AV18message.setgxTv_SdtMessages_Message_Description( AV18message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Articulo= ", "")+A494ForSer );
         AV18message.setgxTv_SdtMessages_Message_Description( AV18message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Color   = ", "")+A482ForColNom );
         AV18message.setgxTv_SdtMessages_Message_Description( AV18message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Numero  = ", "")+GXutil.str( A483ForColNum, 6, 0) );
         AV18message.setgxTv_SdtMessages_Message_Description( AV18message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Tc      = ", "")+GXutil.str( A831TipColCod, 2, 0) );
         AV18message.setgxTv_SdtMessages_Message_Description( AV18message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Kilo = ", "")+GXutil.str( A492ForPreKgm, 12, 5)+" -> "+GXutil.str( AV11ForPreKgm, 12, 5) );
         AV18message.setgxTv_SdtMessages_Message_Description( AV18message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Metro= ", "")+GXutil.str( A493ForPreMtr, 12, 5)+" -> "+GXutil.str( AV12ForPreMtr, 12, 5) );
         AV19messages.add(AV18message, 0);
         if ( AV11ForPreKgm.doubleValue() > 0 )
         {
            A492ForPreKgm = AV11ForPreKgm ;
            n492ForPreKgm = false ;
         }
         if ( AV12ForPreMtr.doubleValue() > 0 )
         {
            A493ForPreMtr = AV12ForPreMtr ;
            n493ForPreMtr = false ;
         }
         if ( ( A492ForPreKgm.doubleValue() > 0 ) || ( A493ForPreMtr.doubleValue() > 0 ) )
         {
            A491ForPreDef = httpContext.getMessage( "S", "") ;
            n491ForPreDef = false ;
         }
         /* Using cursor P01703 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19messages.size() > 0 )
      {
         AV17json = AV19messages.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV16Usurcod, AV13Station, AV17json, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pttx017.this.A396EmprCod;
      this.aP1[0] = pttx017.this.A252CliCod;
      this.aP2[0] = pttx017.this.A494ForSer;
      this.aP3[0] = pttx017.this.A482ForColNom;
      this.aP4[0] = pttx017.this.A483ForColNum;
      this.aP5[0] = pttx017.this.A831TipColCod;
      this.aP6[0] = pttx017.this.AV11ForPreKgm;
      this.aP7[0] = pttx017.this.AV12ForPreMtr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pttx017");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV14EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV19messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P01702_A396EmprCod = new String[] {""} ;
      P01702_A252CliCod = new int[1] ;
      P01702_A494ForSer = new String[] {""} ;
      P01702_A482ForColNom = new String[] {""} ;
      P01702_A483ForColNum = new int[1] ;
      P01702_A831TipColCod = new byte[1] ;
      P01702_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01702_n492ForPreKgm = new boolean[] {false} ;
      P01702_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01702_n493ForPreMtr = new boolean[] {false} ;
      P01702_A491ForPreDef = new String[] {""} ;
      P01702_n491ForPreDef = new boolean[] {false} ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      AV18message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV17json = "" ;
      AV23Pgmname = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pttx017__default(),
         new Object[] {
             new Object[] {
            P01702_A396EmprCod, P01702_A252CliCod, P01702_A494ForSer, P01702_A482ForColNom, P01702_A483ForColNum, P01702_A831TipColCod, P01702_A492ForPreKgm, P01702_n492ForPreKgm, P01702_A493ForPreMtr, P01702_n493ForPreMtr,
            P01702_A491ForPreDef, P01702_n491ForPreDef
            }
            , new Object[] {
            }
         }
      );
      AV23Pgmname = "PTTX017" ;
      /* GeneXus formulas. */
      AV23Pgmname = "PTTX017" ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A129BarCod ;
   private java.math.BigDecimal AV11ForPreKgm ;
   private java.math.BigDecimal AV12ForPreMtr ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A491ForPreDef ;
   private String AV23Pgmname ;
   private String A130BarCodPar ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
   private String AV17json ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01702_A396EmprCod ;
   private int[] P01702_A252CliCod ;
   private String[] P01702_A494ForSer ;
   private String[] P01702_A482ForColNom ;
   private int[] P01702_A483ForColNum ;
   private byte[] P01702_A831TipColCod ;
   private java.math.BigDecimal[] P01702_A492ForPreKgm ;
   private boolean[] P01702_n492ForPreKgm ;
   private java.math.BigDecimal[] P01702_A493ForPreMtr ;
   private boolean[] P01702_n493ForPreMtr ;
   private String[] P01702_A491ForPreDef ;
   private boolean[] P01702_n491ForPreDef ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV19messages ;
   private com.genexus.SdtMessages_Message AV18message ;
}

final  class pttx017__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01702", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForPreKgm, ForPreMtr, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01703", "UPDATE TXPCFORMU SET ForPreKgm=?, ForPreMtr=?, ForPreDef=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setString(7, (String)parms[9], 13);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               return;
      }
   }

}

