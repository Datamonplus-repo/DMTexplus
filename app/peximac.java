package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peximac extends GXProcedure
{
   public peximac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peximac.class ), "" );
   }

   public peximac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      peximac.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      peximac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peximac.this.AV10Macprocod = aP1[0];
      this.aP1 = aP1;
      peximac.this.AV8ExiMac = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV9Cotexsur ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COTEXS", ""), GXv_int2) ;
      peximac.this.GXt_int1 = GXv_int2[0] ;
      AV9Cotexsur = GXt_int1 ;
      AV8ExiMac = (byte)(0) ;
      if ( AV9Cotexsur == 0 )
      {
         /* Using cursor P01F22 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV10Macprocod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1514MacProCod = P01F22_A1514MacProCod[0] ;
            AV8ExiMac = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         if ( GXutil.strcmp(AV10Macprocod, " ") != 0 )
         {
            AV11Prg_cod = (int)(GXutil.lval( AV10Macprocod)) ;
            /* Using cursor P01F23 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11Prg_cod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A8877Prg_Cod = P01F23_A8877Prg_Cod[0] ;
               AV8ExiMac = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peximac.this.A396EmprCod;
      this.aP1[0] = peximac.this.AV10Macprocod;
      this.aP2[0] = peximac.this.AV8ExiMac;
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
      P01F22_A396EmprCod = new String[] {""} ;
      P01F22_A1514MacProCod = new String[] {""} ;
      A1514MacProCod = "" ;
      P01F23_A396EmprCod = new String[] {""} ;
      P01F23_A8877Prg_Cod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peximac__default(),
         new Object[] {
             new Object[] {
            P01F22_A396EmprCod, P01F22_A1514MacProCod
            }
            , new Object[] {
            P01F23_A396EmprCod, P01F23_A8877Prg_Cod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8ExiMac ;
   private byte AV9Cotexsur ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV11Prg_cod ;
   private int A8877Prg_Cod ;
   private String A396EmprCod ;
   private String AV10Macprocod ;
   private String scmdbuf ;
   private String A1514MacProCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01F22_A396EmprCod ;
   private String[] P01F22_A1514MacProCod ;
   private String[] P01F23_A396EmprCod ;
   private int[] P01F23_A8877Prg_Cod ;
}

final  class peximac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01F22", "SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01F23", "SELECT EmprCod, Prg_Cod FROM TXPPROGNo WHERE EmprCod = ? and Prg_Cod = ? ORDER BY EmprCod, Prg_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

