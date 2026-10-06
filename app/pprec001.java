package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprec001 extends GXProcedure
{
   public pprec001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprec001.class ), "" );
   }

   public pprec001( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] AV8AlbRLote )
   {
      pprec001.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, AV8AlbRLote, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] AV8AlbRLote ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, AV8AlbRLote, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] AV8AlbRLote ,
                             short[] aP5 )
   {
      pprec001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprec001.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprec001.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprec001.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprec001.this.AV8AlbRLote = AV8AlbRLote;
      pprec001.this.AV9Lotes = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV8AlbRLote[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV9Lotes = (short)(1) ;
      /* Using cursor P036T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P036T2_A44AlbRecCod[0] ;
         A6463AlbRLote = P036T2_A6463AlbRLote[0] ;
         A200BarPieCod = P036T2_A200BarPieCod[0] ;
         A6463AlbRLote = P036T2_A6463AlbRLote[0] ;
         AV8AlbRLote[AV9Lotes-1] = A6463AlbRLote ;
         if ( AV9Lotes == 5 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprec001.this.A396EmprCod;
      this.aP1[0] = pprec001.this.A129BarCod;
      this.aP2[0] = pprec001.this.A132BarCodReo;
      this.aP3[0] = pprec001.this.A130BarCodPar;
      this.aP5[0] = pprec001.this.AV9Lotes;
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
      P036T2_A44AlbRecCod = new int[1] ;
      P036T2_A396EmprCod = new String[] {""} ;
      P036T2_A129BarCod = new int[1] ;
      P036T2_A132BarCodReo = new byte[1] ;
      P036T2_A130BarCodPar = new String[] {""} ;
      P036T2_A6463AlbRLote = new String[] {""} ;
      P036T2_A200BarPieCod = new String[] {""} ;
      A6463AlbRLote = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprec001__default(),
         new Object[] {
             new Object[] {
            P036T2_A44AlbRecCod, P036T2_A396EmprCod, P036T2_A129BarCod, P036T2_A132BarCodReo, P036T2_A130BarCodPar, P036T2_A6463AlbRLote, P036T2_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV9Lotes ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GX_I ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8AlbRLote[] ;
   private String scmdbuf ;
   private String A6463AlbRLote ;
   private String A200BarPieCod ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P036T2_A44AlbRecCod ;
   private String[] P036T2_A396EmprCod ;
   private int[] P036T2_A129BarCod ;
   private byte[] P036T2_A132BarCodReo ;
   private String[] P036T2_A130BarCodPar ;
   private String[] P036T2_A6463AlbRLote ;
   private String[] P036T2_A200BarPieCod ;
}

final  class pprec001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036T2", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRLote, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

