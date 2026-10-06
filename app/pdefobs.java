package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdefobs extends GXProcedure
{
   public pdefobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdefobs.class ), "" );
   }

   public pdefobs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pdefobs.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pdefobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdefobs.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdefobs.this.AV15ContVal = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A319DefPor = P004W2_A319DefPor[0] ;
         A833TipDefCod = P004W2_A833TipDefCod[0] ;
         A14359DefResp = P004W2_A14359DefResp[0] ;
         n14359DefResp = P004W2_n14359DefResp[0] ;
         A14358DefCausa = P004W2_A14358DefCausa[0] ;
         n14358DefCausa = P004W2_n14358DefCausa[0] ;
         A14357DefMaqcod = P004W2_A14357DefMaqcod[0] ;
         n14357DefMaqcod = P004W2_n14357DefMaqcod[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         AV16TipDefCod = A833TipDefCod ;
         AV17DefPor = A319DefPor ;
         /*
            INSERT RECORD ON TABLE TXPDISDEF

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W833TipDefCod = A833TipDefCod ;
         W319DefPor = A319DefPor ;
         A361DisCod = AV15ContVal ;
         A833TipDefCod = AV16TipDefCod ;
         A319DefPor = AV17DefPor ;
         /* Using cursor P004W3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Short.valueOf(A833TipDefCod), Short.valueOf(A319DefPor), Boolean.valueOf(n14357DefMaqcod), A14357DefMaqcod, Boolean.valueOf(n14358DefCausa), Short.valueOf(A14358DefCausa), Boolean.valueOf(n14359DefResp), Short.valueOf(A14359DefResp)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
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
         A361DisCod = W361DisCod ;
         A833TipDefCod = W833TipDefCod ;
         A319DefPor = W319DefPor ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P004W4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A376DisObsLin = P004W4_A376DisObsLin[0] ;
         A377DisObsTxt = P004W4_A377DisObsTxt[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         AV18DisObsLin = A376DisObsLin ;
         /*
            INSERT RECORD ON TABLE TXPOBSERV

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W376DisObsLin = A376DisObsLin ;
         A361DisCod = AV15ContVal ;
         A376DisObsLin = AV18DisObsLin ;
         /* Using cursor P004W5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         if ( (pr_default.getStatus(3) == 1) )
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
         A361DisCod = W361DisCod ;
         A376DisObsLin = W376DisObsLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdefobs.this.A396EmprCod;
      this.aP1[0] = pdefobs.this.A361DisCod;
      this.aP2[0] = pdefobs.this.AV15ContVal;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdefobs");
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
      P004W2_A396EmprCod = new String[] {""} ;
      P004W2_A361DisCod = new int[1] ;
      P004W2_A319DefPor = new short[1] ;
      P004W2_A833TipDefCod = new short[1] ;
      P004W2_A14359DefResp = new short[1] ;
      P004W2_n14359DefResp = new boolean[] {false} ;
      P004W2_A14358DefCausa = new short[1] ;
      P004W2_n14358DefCausa = new boolean[] {false} ;
      P004W2_A14357DefMaqcod = new String[] {""} ;
      P004W2_n14357DefMaqcod = new boolean[] {false} ;
      A14357DefMaqcod = "" ;
      W396EmprCod = "" ;
      Gx_emsg = "" ;
      P004W4_A396EmprCod = new String[] {""} ;
      P004W4_A361DisCod = new int[1] ;
      P004W4_A376DisObsLin = new byte[1] ;
      P004W4_A377DisObsTxt = new String[] {""} ;
      A377DisObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdefobs__default(),
         new Object[] {
             new Object[] {
            P004W2_A396EmprCod, P004W2_A361DisCod, P004W2_A319DefPor, P004W2_A833TipDefCod, P004W2_A14359DefResp, P004W2_n14359DefResp, P004W2_A14358DefCausa, P004W2_n14358DefCausa, P004W2_A14357DefMaqcod, P004W2_n14357DefMaqcod
            }
            , new Object[] {
            }
            , new Object[] {
            P004W4_A396EmprCod, P004W4_A361DisCod, P004W4_A376DisObsLin, P004W4_A377DisObsTxt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A376DisObsLin ;
   private byte AV18DisObsLin ;
   private byte W376DisObsLin ;
   private short A319DefPor ;
   private short A833TipDefCod ;
   private short A14359DefResp ;
   private short A14358DefCausa ;
   private short AV16TipDefCod ;
   private short AV17DefPor ;
   private short W833TipDefCod ;
   private short W319DefPor ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV15ContVal ;
   private int W361DisCod ;
   private int GX_INS37 ;
   private int GX_INS40 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A14357DefMaqcod ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private String A377DisObsTxt ;
   private boolean n14359DefResp ;
   private boolean n14358DefCausa ;
   private boolean n14357DefMaqcod ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P004W2_A396EmprCod ;
   private int[] P004W2_A361DisCod ;
   private short[] P004W2_A319DefPor ;
   private short[] P004W2_A833TipDefCod ;
   private short[] P004W2_A14359DefResp ;
   private boolean[] P004W2_n14359DefResp ;
   private short[] P004W2_A14358DefCausa ;
   private boolean[] P004W2_n14358DefCausa ;
   private String[] P004W2_A14357DefMaqcod ;
   private boolean[] P004W2_n14357DefMaqcod ;
   private String[] P004W4_A396EmprCod ;
   private int[] P004W4_A361DisCod ;
   private byte[] P004W4_A376DisObsLin ;
   private String[] P004W4_A377DisObsTxt ;
}

final  class pdefobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004W2", "SELECT EmprCod, DisCod, DefPor, TipDefCod, DefResp, DefCausa, DefMaqcod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004W3", "INSERT INTO TXPDISDEF(EmprCod, DisCod, TipDefCod, DefPor, DefMaqcod, DefCausa, DefResp) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new ForEachCursor("P004W4", "SELECT EmprCod, DisCod, DisObsLin, DisObsTxt FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004W5", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
      }
   }

}

