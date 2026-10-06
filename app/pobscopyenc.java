package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobscopyenc extends GXProcedure
{
   public pobscopyenc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobscopyenc.class ), "" );
   }

   public pobscopyenc( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pobscopyenc.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pobscopyenc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pobscopyenc.this.AV8Discod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9DiscodAnt = (int)(AV8Discod-1) ;
      /* Using cursor P04GT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9DiscodAnt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P04GT2_A361DisCod[0] ;
         A377DisObsTxt = P04GT2_A377DisObsTxt[0] ;
         A376DisObsLin = P04GT2_A376DisObsLin[0] ;
         A378DisObsULin = P04GT2_A378DisObsULin[0] ;
         A378DisObsULin = P04GT2_A378DisObsULin[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         AV10DisObsULin = A378DisObsULin ;
         /*
            INSERT RECORD ON TABLE TXPOBSERV

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W376DisObsLin = A376DisObsLin ;
         A361DisCod = AV8Discod ;
         /* Using cursor P04GT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
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
         A376DisObsLin = W376DisObsLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P04GT4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV10DisObsULin), A396EmprCod, Integer.valueOf(AV8Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pobscopyenc.this.A396EmprCod;
      this.aP1[0] = pobscopyenc.this.AV8Discod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pobscopyenc");
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
      P04GT2_A396EmprCod = new String[] {""} ;
      P04GT2_A361DisCod = new int[1] ;
      P04GT2_A377DisObsTxt = new String[] {""} ;
      P04GT2_A376DisObsLin = new byte[1] ;
      P04GT2_A378DisObsULin = new byte[1] ;
      A377DisObsTxt = "" ;
      W396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobscopyenc__default(),
         new Object[] {
             new Object[] {
            P04GT2_A396EmprCod, P04GT2_A361DisCod, P04GT2_A377DisObsTxt, P04GT2_A376DisObsLin, P04GT2_A378DisObsULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A376DisObsLin ;
   private byte A378DisObsULin ;
   private byte AV10DisObsULin ;
   private byte W376DisObsLin ;
   private short Gx_err ;
   private int AV8Discod ;
   private int AV9DiscodAnt ;
   private int A361DisCod ;
   private int W361DisCod ;
   private int GX_INS40 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A377DisObsTxt ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04GT2_A396EmprCod ;
   private int[] P04GT2_A361DisCod ;
   private String[] P04GT2_A377DisObsTxt ;
   private byte[] P04GT2_A376DisObsLin ;
   private byte[] P04GT2_A378DisObsULin ;
}

final  class pobscopyenc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04GT2", "SELECT T1.EmprCod, T1.DisCod, T1.DisObsTxt, T1.DisObsLin, T2.DisObsULin FROM (TXPOBSERV T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04GT3", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P04GT4", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

