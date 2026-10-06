package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrcli extends GXProcedure
{
   public pctrcli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrcli.class ), "" );
   }

   public pctrcli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 )
   {
      pctrcli.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pctrcli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrcli.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pctrcli.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      pctrcli.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV19Artextil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pctrcli.this.GXt_int1 = GXv_int2[0] ;
      AV19Artextil = GXt_int1 ;
      GXt_int1 = AV21CliDif ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLIKKK", ""), GXv_int2) ;
      pctrcli.this.GXt_int1 = GXv_int2[0] ;
      AV21CliDif = GXt_int1 ;
      if ( AV19Artextil == 1 )
      {
         AV20Muestras = (byte)(0) ;
         /* Using cursor P00KB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1211TipEntCod = P00KB2_A1211TipEntCod[0] ;
            n1211TipEntCod = P00KB2_n1211TipEntCod[0] ;
            if ( A1211TipEntCod == 4 )
            {
               AV20Muestras = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV20Muestras == 1 )
         {
            AV18FlagCli = (byte)(0) ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion es una entrada de MUESTRAS ¡¡¡", ""));
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV18FlagCli = (byte)(1) ;
      /* Using cursor P00KB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P00KB3_A252CliCod[0] ;
         if ( ( ( A252CliCod == AV17CliCod ) ) || ( ( A252CliCod == 2000 ) && ( AV19Artextil == 1 ) ) )
         {
            AV18FlagCli = (byte)(0) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV21CliDif == 1 )
      {
         if ( AV18FlagCli == 1 )
         {
            Gx_msg = httpContext.getMessage( "Atencion.Esta activo el parametro CLIKKK", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "que NO controla que el TEJIDO", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "sea del cliente del Pedido ", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "que estamos realizando", "") + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         AV18FlagCli = (byte)(0) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrcli.this.A396EmprCod;
      this.aP1[0] = pctrcli.this.A44AlbRecCod;
      this.aP2[0] = pctrcli.this.AV17CliCod;
      this.aP3[0] = pctrcli.this.AV18FlagCli;
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
      P00KB2_A396EmprCod = new String[] {""} ;
      P00KB2_A44AlbRecCod = new int[1] ;
      P00KB2_A1211TipEntCod = new short[1] ;
      P00KB2_n1211TipEntCod = new boolean[] {false} ;
      P00KB3_A396EmprCod = new String[] {""} ;
      P00KB3_A44AlbRecCod = new int[1] ;
      P00KB3_A252CliCod = new int[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrcli__default(),
         new Object[] {
             new Object[] {
            P00KB2_A396EmprCod, P00KB2_A44AlbRecCod, P00KB2_A1211TipEntCod, P00KB2_n1211TipEntCod
            }
            , new Object[] {
            P00KB3_A396EmprCod, P00KB3_A44AlbRecCod, P00KB3_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18FlagCli ;
   private byte AV19Artextil ;
   private byte AV21CliDif ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV20Muestras ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV17CliCod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String Gx_msg ;
   private boolean n1211TipEntCod ;
   private boolean returnInSub ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00KB2_A396EmprCod ;
   private int[] P00KB2_A44AlbRecCod ;
   private short[] P00KB2_A1211TipEntCod ;
   private boolean[] P00KB2_n1211TipEntCod ;
   private String[] P00KB3_A396EmprCod ;
   private int[] P00KB3_A44AlbRecCod ;
   private int[] P00KB3_A252CliCod ;
}

final  class pctrcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00KB2", "SELECT EmprCod, AlbRecCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00KB3", "SELECT EmprCod, AlbRecCod, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

