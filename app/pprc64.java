package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc64 extends GXProcedure
{
   public pprc64( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc64.class ), "" );
   }

   public pprc64( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long[] executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      AV17tab_ndoc = new long[10000] ;
      execute_int(aP0, aP1, aP2, AV17tab_ndoc);
      return AV17tab_ndoc;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        long[] AV17tab_ndoc )
   {
      execute_int(aP0, aP1, aP2, AV17tab_ndoc);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             long[] AV17tab_ndoc )
   {
      pprc64.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc64.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pprc64.this.AV16PRIO = aP2[0];
      this.aP2 = aP2;
      pprc64.this.AV17tab_ndoc = AV17tab_ndoc;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19i = 1 ;
      while ( AV19i <= 10000 )
      {
         if ( AV17tab_ndoc[AV19i-1] == 0 )
         {
            if (true) break;
         }
         AV18AlbProcod = AV17tab_ndoc[AV19i-1] ;
         AV20Num_alb = 0 ;
         /* Using cursor P05FO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV18AlbProcod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A30AlbProCod = P05FO2_A30AlbProCod[0] ;
            A1782AlbProEso = P05FO2_A1782AlbProEso[0] ;
            A1243GuiRemCli = P05FO2_A1243GuiRemCli[0] ;
            AV20Num_alb = (int)(AV20Num_alb+1) ;
            Gx_msg = httpContext.getMessage( "2º Paso.Actualizo solo Documentos procesados, ", "") + GXutil.str( A30AlbProCod, 10, 0) + httpContext.getMessage( " Cliente ", "") + GXutil.str( A1243GuiRemCli, 6, 0) + httpContext.getMessage( " Estado =", "") + GXutil.str( A1782AlbProEso, 1, 0) ;
            System.out.println( Gx_msg );
            A1782AlbProEso = (byte)(((A1782AlbProEso==7)||(A1782AlbProEso==1) ? 2 : A1782AlbProEso)) ;
            /* Using cursor P05FO3 */
            pr_default.execute(1, new Object[] {Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV19i = (int)(AV19i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc64.this.A396EmprCod;
      this.aP1[0] = pprc64.this.AV15CliCod;
      this.aP2[0] = pprc64.this.AV16PRIO;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc64");
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
      P05FO2_A396EmprCod = new String[] {""} ;
      P05FO2_A30AlbProCod = new long[1] ;
      P05FO2_A1782AlbProEso = new byte[1] ;
      P05FO2_A1243GuiRemCli = new int[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc64__default(),
         new Object[] {
             new Object[] {
            P05FO2_A396EmprCod, P05FO2_A30AlbProCod, P05FO2_A1782AlbProEso, P05FO2_A1243GuiRemCli
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1782AlbProEso ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV19i ;
   private int AV20Num_alb ;
   private int A1243GuiRemCli ;
   private long AV18AlbProcod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV16PRIO ;
   private String scmdbuf ;
   private String Gx_msg ;
   private long[] AV17tab_ndoc ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05FO2_A396EmprCod ;
   private long[] P05FO2_A30AlbProCod ;
   private byte[] P05FO2_A1782AlbProEso ;
   private int[] P05FO2_A1243GuiRemCli ;
}

final  class pprc64__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05FO2", "SELECT EmprCod, AlbProCod, AlbProEso, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05FO3", "UPDATE TXPCALPRD SET AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

