package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prepobs extends GXProcedure
{
   public prepobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prepobs.class ), "" );
   }

   public prepobs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      prepobs.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      prepobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prepobs.this.AV9AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13AlbPObsCon = (byte)(0) ;
      AV14OkAlbaran = (byte)(0) ;
      AV12Contador = (byte)(0) ;
      AV10AlbProCodA = AV9AlbProCod ;
      while ( AV12Contador == 0 )
      {
         AV10AlbProCodA = (long)(AV10AlbProCodA-1) ;
         /* Using cursor P018T2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV10AlbProCodA)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A915AlbPObsLin = P018T2_A915AlbPObsLin[0] ;
            A30AlbProCod = P018T2_A30AlbProCod[0] ;
            A916AlbPObs = P018T2_A916AlbPObs[0] ;
            W30AlbProCod = A30AlbProCod ;
            AV11AlbPObsLin = A915AlbPObsLin ;
            /*
               INSERT RECORD ON TABLE TXPOBSALB

            */
            W30AlbProCod = A30AlbProCod ;
            W915AlbPObsLin = A915AlbPObsLin ;
            A30AlbProCod = AV9AlbProCod ;
            A915AlbPObsLin = AV11AlbPObsLin ;
            /* Using cursor P018T3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin), A916AlbPObs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
            A30AlbProCod = W30AlbProCod ;
            A915AlbPObsLin = W915AlbPObsLin ;
            /* End Insert */
            if ( AV13AlbPObsCon < AV11AlbPObsLin )
            {
               AV13AlbPObsCon = AV11AlbPObsLin ;
            }
            AV14OkAlbaran = (byte)(1) ;
            A30AlbProCod = W30AlbProCod ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV14OkAlbaran == 1 )
         {
            if (true) break;
         }
      }
      /* Optimized UPDATE. */
      /* Using cursor P018T4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV13AlbPObsCon), A396EmprCod, Long.valueOf(AV9AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prepobs.this.A396EmprCod;
      this.aP1[0] = prepobs.this.AV9AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "prepobs");
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
      P018T2_A396EmprCod = new String[] {""} ;
      P018T2_A915AlbPObsLin = new byte[1] ;
      P018T2_A30AlbProCod = new long[1] ;
      P018T2_A916AlbPObs = new String[] {""} ;
      A916AlbPObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prepobs__default(),
         new Object[] {
             new Object[] {
            P018T2_A396EmprCod, P018T2_A915AlbPObsLin, P018T2_A30AlbProCod, P018T2_A916AlbPObs
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

   private byte AV13AlbPObsCon ;
   private byte AV14OkAlbaran ;
   private byte AV12Contador ;
   private byte A915AlbPObsLin ;
   private byte AV11AlbPObsLin ;
   private byte W915AlbPObsLin ;
   private byte A914AlbPObsCon ;
   private short Gx_err ;
   private int GX_INS121 ;
   private long AV9AlbProCod ;
   private long AV10AlbProCodA ;
   private long A30AlbProCod ;
   private long W30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A916AlbPObs ;
   private String Gx_emsg ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P018T2_A396EmprCod ;
   private byte[] P018T2_A915AlbPObsLin ;
   private long[] P018T2_A30AlbProCod ;
   private String[] P018T2_A916AlbPObs ;
}

final  class prepobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018T2", "SELECT EmprCod, AlbPObsLin, AlbProCod, AlbPObs FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P018T3", "INSERT INTO TXPOBSALB(EmprCod, AlbProCod, AlbPObsLin, AlbPObs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P018T4", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 50);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

