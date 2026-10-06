package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdltthelist extends GXProcedure
{
   public pdltthelist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdltthelist.class ), "" );
   }

   public pdltthelist( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pdltthelist.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pdltthelist.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdltthelist.this.AV14Prdnum = aP1[0];
      this.aP1 = aP1;
      pdltthelist.this.AV13PrdNom = aP2[0];
      this.aP2 = aP2;
      pdltthelist.this.AV12TheList = aP3[0];
      this.aP3 = aP3;
      pdltthelist.this.AV11oldTheList = aP4[0];
      this.aP4 = aP4;
      pdltthelist.this.AV8usurcod = aP5[0];
      this.aP5 = aP5;
      pdltthelist.this.AV9station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV12TheList, AV11oldTheList) != 0 )
      {
         AV10Inc_obs = "" ;
         /* Using cursor P06272 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV14Prdnum, AV11oldTheList});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A13586TheList = P06272_A13586TheList[0] ;
            A719PrdNum = P06272_A719PrdNum[0] ;
            AV10Inc_obs = httpContext.getMessage( "Producto ", "") + AV14Prdnum + " " + GXutil.trim( AV13PrdNom) + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Elimino Categoria ", "") + A13586TheList + GXutil.newLine( ) ;
            /* Using cursor P06273 */
            pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A13575SUSCatDs = P06273_A13575SUSCatDs[0] ;
               n13575SUSCatDs = P06273_n13575SUSCatDs[0] ;
               A13576SUSAlarma = P06273_A13576SUSAlarma[0] ;
               n13576SUSAlarma = P06273_n13576SUSAlarma[0] ;
               A13574SUSCatID = P06273_A13574SUSCatID[0] ;
               A13575SUSCatDs = P06273_A13575SUSCatDs[0] ;
               n13575SUSCatDs = P06273_n13575SUSCatDs[0] ;
               AV10Inc_obs += httpContext.getMessage( "Sustancia ", "") + GXutil.str( A13574SUSCatID, 4, 0) + " " + GXutil.trim( A13575SUSCatDs) + GXutil.newLine( ) ;
               AV10Inc_obs += httpContext.getMessage( "Alarma    ", "") + A13576SUSAlarma + GXutil.newLine( ) ;
               /* Using cursor P06274 */
               pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, A13586TheList, Short.valueOf(A13574SUSCatID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSU1");
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Using cursor P06275 */
            pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSUS");
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV20Pgmname, 1, 10), AV8usurcod, AV9station, AV10Inc_obs, 99999999, (byte)(0), "") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdltthelist.this.A396EmprCod;
      this.aP1[0] = pdltthelist.this.AV14Prdnum;
      this.aP2[0] = pdltthelist.this.AV13PrdNom;
      this.aP3[0] = pdltthelist.this.AV12TheList;
      this.aP4[0] = pdltthelist.this.AV11oldTheList;
      this.aP5[0] = pdltthelist.this.AV8usurcod;
      this.aP6[0] = pdltthelist.this.AV9station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdltthelist");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Inc_obs = "" ;
      scmdbuf = "" ;
      P06272_A396EmprCod = new String[] {""} ;
      P06272_A13586TheList = new String[] {""} ;
      P06272_A719PrdNum = new String[] {""} ;
      A13586TheList = "" ;
      A719PrdNum = "" ;
      P06273_A396EmprCod = new String[] {""} ;
      P06273_A719PrdNum = new String[] {""} ;
      P06273_A13586TheList = new String[] {""} ;
      P06273_A13575SUSCatDs = new String[] {""} ;
      P06273_n13575SUSCatDs = new boolean[] {false} ;
      P06273_A13576SUSAlarma = new String[] {""} ;
      P06273_n13576SUSAlarma = new boolean[] {false} ;
      P06273_A13574SUSCatID = new short[1] ;
      A13575SUSCatDs = "" ;
      A13576SUSAlarma = "" ;
      AV20Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdltthelist__default(),
         new Object[] {
             new Object[] {
            P06272_A396EmprCod, P06272_A13586TheList, P06272_A719PrdNum
            }
            , new Object[] {
            P06273_A396EmprCod, P06273_A719PrdNum, P06273_A13586TheList, P06273_A13575SUSCatDs, P06273_n13575SUSCatDs, P06273_A13576SUSAlarma, P06273_n13576SUSAlarma, P06273_A13574SUSCatID
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PDLTthelist" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PDLTthelist" ;
      Gx_err = (short)(0) ;
   }

   private short A13574SUSCatID ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV14Prdnum ;
   private String AV13PrdNom ;
   private String AV12TheList ;
   private String AV11oldTheList ;
   private String AV8usurcod ;
   private String AV9station ;
   private String scmdbuf ;
   private String A13586TheList ;
   private String A719PrdNum ;
   private String A13575SUSCatDs ;
   private String A13576SUSAlarma ;
   private String AV20Pgmname ;
   private boolean n13575SUSCatDs ;
   private boolean n13576SUSAlarma ;
   private String AV10Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P06272_A396EmprCod ;
   private String[] P06272_A13586TheList ;
   private String[] P06272_A719PrdNum ;
   private String[] P06273_A396EmprCod ;
   private String[] P06273_A719PrdNum ;
   private String[] P06273_A13586TheList ;
   private String[] P06273_A13575SUSCatDs ;
   private boolean[] P06273_n13575SUSCatDs ;
   private String[] P06273_A13576SUSAlarma ;
   private boolean[] P06273_n13576SUSAlarma ;
   private short[] P06273_A13574SUSCatID ;
}

final  class pdltthelist__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06272", "SELECT EmprCod, TheList, PrdNum FROM TXPCATSUS WHERE EmprCod = ? and PrdNum = ? and TheList = ? ORDER BY EmprCod, PrdNum, TheList ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06273", "SELECT T1.EmprCod, T1.PrdNum, T1.TheList, T2.SUSCatDs, T1.SUSAlarma, T1.SUSCatID FROM (TXPCATSU1 T1 INNER JOIN TXPSUSTAN T2 ON T2.EmprCod = T1.EmprCod AND T2.SUSCatID = T1.SUSCatID) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.TheList = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.TheList, T1.SUSCatID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P06274", "DELETE FROM TXPCATSU1  WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? AND SUSCatID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCATSU1")
         ,new UpdateCursor("P06275", "DELETE FROM TXPCATSUS  WHERE EmprCod = ? AND PrdNum = ? AND TheList = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCATSUS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
      }
   }

}

