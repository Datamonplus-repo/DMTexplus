package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlguia extends GXProcedure
{
   public pctrlguia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlguia.class ), "" );
   }

   public pctrlguia( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 ,
                          String[] aP2 )
   {
      pctrlguia.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pctrlguia.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlguia.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pctrlguia.this.AV9Albmarca = aP2[0];
      this.aP2 = aP2;
      pctrlguia.this.AV8Lineas = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lineas = 0 ;
      /* Using cursor P04ZS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1243GuiRemCli = P04ZS2_A1243GuiRemCli[0] ;
         A5140AlbMarca = P04ZS2_A5140AlbMarca[0] ;
         AV9Albmarca = A5140AlbMarca ;
         /* Optimized group. */
         /* Using cursor P04ZS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         cV8Lineas = P04ZS3_AV8Lineas[0] ;
         pr_default.close(1);
         AV8Lineas = (int)(AV8Lineas+cV8Lineas*1) ;
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlguia.this.A396EmprCod;
      this.aP1[0] = pctrlguia.this.A30AlbProCod;
      this.aP2[0] = pctrlguia.this.AV9Albmarca;
      this.aP3[0] = pctrlguia.this.AV8Lineas;
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
      P04ZS2_A396EmprCod = new String[] {""} ;
      P04ZS2_A30AlbProCod = new long[1] ;
      P04ZS2_A1243GuiRemCli = new int[1] ;
      P04ZS2_A5140AlbMarca = new String[] {""} ;
      A5140AlbMarca = "" ;
      P04ZS3_AV8Lineas = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlguia__default(),
         new Object[] {
             new Object[] {
            P04ZS2_A396EmprCod, P04ZS2_A30AlbProCod, P04ZS2_A1243GuiRemCli, P04ZS2_A5140AlbMarca
            }
            , new Object[] {
            P04ZS3_AV8Lineas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Lineas ;
   private int A1243GuiRemCli ;
   private int cV8Lineas ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV9Albmarca ;
   private String scmdbuf ;
   private String A5140AlbMarca ;
   private int[] aP3 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZS2_A396EmprCod ;
   private long[] P04ZS2_A30AlbProCod ;
   private int[] P04ZS2_A1243GuiRemCli ;
   private String[] P04ZS2_A5140AlbMarca ;
   private int[] P04ZS3_AV8Lineas ;
}

final  class pctrlguia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZS2", "SELECT EmprCod, AlbProCod, GuiRemCli, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04ZS3", "SELECT COUNT(*) FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               return;
      }
   }

}

