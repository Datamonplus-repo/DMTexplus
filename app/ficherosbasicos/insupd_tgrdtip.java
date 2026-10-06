package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insupd_tgrdtip extends GXProcedure
{
   public insupd_tgrdtip( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insupd_tgrdtip.class ), "" );
   }

   public insupd_tgrdtip( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 )
   {
      insupd_tgrdtip.this.A396EmprCod = aP0;
      insupd_tgrdtip.this.A4364GrdTipArt = aP1;
      insupd_tgrdtip.this.AV8TipArtCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P0AMI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(AV8TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = P0AMI2_A829TipArtCod[0] ;
         AV11GXLvl3 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPGRDTI1

         */
         A829TipArtCod = AV8TipArtCod ;
         /* Using cursor P0AMI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A829TipArtCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTI1");
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
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.insupd_tgrdtip");
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
      P0AMI2_A396EmprCod = new String[] {""} ;
      P0AMI2_A4364GrdTipArt = new short[1] ;
      P0AMI2_A829TipArtCod = new short[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.insupd_tgrdtip__default(),
         new Object[] {
             new Object[] {
            P0AMI2_A396EmprCod, P0AMI2_A4364GrdTipArt, P0AMI2_A829TipArtCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short A4364GrdTipArt ;
   private short AV8TipArtCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int GX_INS662 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMI2_A396EmprCod ;
   private short[] P0AMI2_A4364GrdTipArt ;
   private short[] P0AMI2_A829TipArtCod ;
}

final  class insupd_tgrdtip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMI2", "SELECT * FROM (SELECT EmprCod, GrdTipArt, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? and GrdTipArt = ? and TipArtCod = ? ORDER BY EmprCod, GrdTipArt, TipArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AMI3", "INSERT INTO TXPGRDTI1(EmprCod, GrdTipArt, TipArtCod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRDTI1")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

