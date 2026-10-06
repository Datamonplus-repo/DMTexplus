package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexiprd extends GXProcedure
{
   public pexiprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexiprd.class ), "" );
   }

   public pexiprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 )
   {
      pexiprd.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pexiprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexiprd.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pexiprd.this.AV8PrvNum = aP2[0];
      this.aP2 = aP2;
      pexiprd.this.AV9FlagExi = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV10ProPrv ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int2) ;
      pexiprd.this.GXt_int1 = GXv_int2[0] ;
      AV10ProPrv = GXt_int1 ;
      if ( AV10ProPrv == 0 )
      {
         AV13GXLvl4 = (byte)(0) ;
         /* Using cursor P01092 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(AV8PrvNum)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A795PrvNum = P01092_A795PrvNum[0] ;
            AV13GXLvl4 = (byte)(1) ;
            AV9FlagExi = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV13GXLvl4 == 0 )
         {
            AV9FlagExi = (byte)(1) ;
         }
      }
      else
      {
         AV9FlagExi = (byte)(1) ;
         AV14GXLvl12 = (byte)(0) ;
         /* Using cursor P01093 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(AV8PrvNum)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6158PrdPrv = P01093_A6158PrdPrv[0] ;
            AV14GXLvl12 = (byte)(1) ;
            AV9FlagExi = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV14GXLvl12 == 0 )
         {
            AV9FlagExi = (byte)(1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexiprd.this.A396EmprCod;
      this.aP1[0] = pexiprd.this.A719PrdNum;
      this.aP2[0] = pexiprd.this.AV8PrvNum;
      this.aP3[0] = pexiprd.this.AV9FlagExi;
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
      scmdbuf = "" ;
      P01092_A396EmprCod = new String[] {""} ;
      P01092_A719PrdNum = new String[] {""} ;
      P01092_A795PrvNum = new int[1] ;
      P01093_A396EmprCod = new String[] {""} ;
      P01093_A719PrdNum = new String[] {""} ;
      P01093_A6158PrdPrv = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexiprd__default(),
         new Object[] {
             new Object[] {
            P01092_A396EmprCod, P01092_A719PrdNum, P01092_A795PrvNum
            }
            , new Object[] {
            P01093_A396EmprCod, P01093_A719PrdNum, P01093_A6158PrdPrv
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9FlagExi ;
   private byte AV10ProPrv ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV13GXLvl4 ;
   private byte AV14GXLvl12 ;
   private short Gx_err ;
   private int AV8PrvNum ;
   private int A795PrvNum ;
   private int A6158PrdPrv ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01092_A396EmprCod ;
   private String[] P01092_A719PrdNum ;
   private int[] P01092_A795PrvNum ;
   private String[] P01093_A396EmprCod ;
   private String[] P01093_A719PrdNum ;
   private int[] P01093_A6158PrdPrv ;
}

final  class pexiprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01092", "SELECT EmprCod, PrdNum, PrvNum FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (PrvNum = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01093", "SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ? ORDER BY EmprCod, PrdNum, PrdPrv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

