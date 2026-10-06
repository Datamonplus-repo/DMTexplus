package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcabped extends GXProcedure
{
   public pcabped( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcabped.class ), "" );
   }

   public pcabped( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 ,
                                     int[] aP2 ,
                                     String[] aP3 )
   {
      pcabped.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 )
   {
      pcabped.this.A396EmprCod = aP0;
      pcabped.this.A795PrvNum = aP1;
      pcabped.this.AV15PedCod = aP2[0];
      this.aP2 = aP2;
      pcabped.this.AV16Prior = aP3[0];
      this.aP3 = aP3;
      pcabped.this.AV17FecEnt = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV18Rontaltex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int2) ;
      pcabped.this.GXt_int1 = GXv_int2[0] ;
      AV18Rontaltex = GXt_int1 ;
      GXt_char3 = AV20Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pcabped.this.GXt_char3 = GXv_char4[0] ;
      AV20Station = GXt_char3 ;
      GXv_char4[0] = "" ;
      GXv_char5[0] = "" ;
      GXv_char6[0] = AV19Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char4, GXv_char5, GXv_char6) ;
      pcabped.this.AV19Usurcod = GXv_char6[0] ;
      GXv_int7[0] = AV15PedCod ;
      new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "010500", GXv_int7) ;
      pcabped.this.AV15PedCod = GXv_int7[0] ;
      /* Using cursor P001F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3143PrvDivCo = P001F2_A3143PrvDivCo[0] ;
         A8160PrvDtoPP = P001F2_A8160PrvDtoPP[0] ;
         n8160PrvDtoPP = P001F2_n8160PrvDtoPP[0] ;
         W396EmprCod = A396EmprCod ;
         W795PrvNum = A795PrvNum ;
         /*
            INSERT RECORD ON TABLE TXPCPEDID

         */
         W396EmprCod = A396EmprCod ;
         W795PrvNum = A795PrvNum ;
         A658PedCod = AV15PedCod ;
         A661PedFec = GXutil.today( ) ;
         A667PedSit = httpContext.getMessage( "N", "") ;
         A666PedPri = AV16Prior ;
         A662PedFecEnt = AV17FecEnt ;
         A3113PedCDivCod = A3143PrvDivCo ;
         if ( AV18Rontaltex == 1 )
         {
            A6160PedCodExt = AV19Usurcod ;
         }
         A8153PedPrvDPP = A8160PrvDtoPP ;
         /* Using cursor P001F3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), Integer.valueOf(A795PrvNum), A661PedFec, A662PedFecEnt, A667PedSit, A666PedPri, Byte.valueOf(A3113PedCDivCod), A6160PedCodExt, A8153PedPrvDPP});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A795PrvNum = W795PrvNum ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A795PrvNum = W795PrvNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pcabped.this.AV15PedCod;
      this.aP3[0] = pcabped.this.AV16Prior;
      this.aP4[0] = pcabped.this.AV17FecEnt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcabped");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV20Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      AV19Usurcod = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      scmdbuf = "" ;
      P001F2_A396EmprCod = new String[] {""} ;
      P001F2_A795PrvNum = new int[1] ;
      P001F2_A3143PrvDivCo = new byte[1] ;
      P001F2_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001F2_n8160PrvDtoPP = new boolean[] {false} ;
      A8160PrvDtoPP = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      A661PedFec = GXutil.nullDate() ;
      A667PedSit = "" ;
      A666PedPri = "" ;
      A662PedFecEnt = GXutil.nullDate() ;
      A6160PedCodExt = "" ;
      A8153PedPrvDPP = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcabped__default(),
         new Object[] {
             new Object[] {
            P001F2_A396EmprCod, P001F2_A795PrvNum, P001F2_A3143PrvDivCo, P001F2_A8160PrvDtoPP, P001F2_n8160PrvDtoPP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Rontaltex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3143PrvDivCo ;
   private byte A3113PedCDivCod ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int AV15PedCod ;
   private int GXv_int7[] ;
   private int W795PrvNum ;
   private int GX_INS76 ;
   private int A658PedCod ;
   private java.math.BigDecimal A8160PrvDtoPP ;
   private java.math.BigDecimal A8153PedPrvDPP ;
   private String A396EmprCod ;
   private String AV16Prior ;
   private String AV20Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String AV19Usurcod ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String A667PedSit ;
   private String A666PedPri ;
   private String Gx_emsg ;
   private java.util.Date AV17FecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private boolean n8160PrvDtoPP ;
   private String A6160PedCodExt ;
   private java.util.Date[] aP4 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P001F2_A396EmprCod ;
   private int[] P001F2_A795PrvNum ;
   private byte[] P001F2_A3143PrvDivCo ;
   private java.math.BigDecimal[] P001F2_A8160PrvDtoPP ;
   private boolean[] P001F2_n8160PrvDtoPP ;
}

final  class pcabped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001F2", "SELECT EmprCod, PrvNum, PrvDivCo, PrvDtoPP FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001F3", "INSERT INTO TXPCPEDID(EmprCod, PedCod, PrvNum, PedFec, PedFecEnt, PedSit, PedPri, PedCDivCod, PedCodExt, PedPrvDPP, PedObsUL, PedEnv, PedPerDes, PedPerPet, PedAlmc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               return;
      }
   }

}

