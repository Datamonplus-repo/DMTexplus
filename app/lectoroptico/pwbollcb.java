package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwbollcb extends GXProcedure
{
   public pwbollcb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwbollcb.class ), "" );
   }

   public pwbollcb( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 )
   {
      pwbollcb.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pwbollcb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwbollcb.this.AV18Maqcod = aP1[0];
      this.aP1 = aP1;
      pwbollcb.this.AV8Hisprofec = aP2[0];
      this.aP2 = aP2;
      pwbollcb.this.AV19Station = aP3[0];
      this.aP3 = aP3;
      pwbollcb.this.AV20Usurcod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Lhipro = (byte)(0) ;
      AV21Texto_i = "" ;
      /* Using cursor P03L92 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV18Maqcod, AV8Hisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A558HisProFec = P03L92_A558HisProFec[0] ;
         A602MaqCod = P03L92_A602MaqCod[0] ;
         A567HisProULin = P03L92_A567HisProULin[0] ;
         n567HisProULin = P03L92_n567HisProULin[0] ;
         AV22Lhipro = (byte)(0) ;
         /* Using cursor P03L93 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A561HisProLin = P03L93_A561HisProLin[0] ;
            AV22Lhipro = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV22Lhipro == 0 )
         {
            /* Using cursor P03L94 */
            pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
            AV21Texto_i = httpContext.getMessage( "Elimino CABECERA, no hay LINEAS en LHIPRO", "") + httpContext.getMessage( " Usuario=", "") + AV20Usurcod + httpContext.getMessage( " Terminal=", "") + AV19Station ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV21Texto_i, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV20Usurcod, AV19Station, AV21Texto_i, 99999999, (byte)(0), "@") ;
      }
      if ( AV22Lhipro == 0 )
      {
         AV21Texto_i = "" ;
         /* Using cursor P03L95 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV18Maqcod, AV8Hisprofec});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1174LecFec = P03L95_A1174LecFec[0] ;
            n1174LecFec = P03L95_n1174LecFec[0] ;
            A1166LecMaqCod = P03L95_A1166LecMaqCod[0] ;
            AV21Texto_i = httpContext.getMessage( "Elimino TABLA LECTOR", "") + httpContext.getMessage( " Usuario=", "") + AV20Usurcod + httpContext.getMessage( " Terminal=", "") + AV19Station ;
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = A1166LecMaqCod ;
            new app.plecdelt(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
            pwbollcb.this.A396EmprCod = GXv_char1[0] ;
            pwbollcb.this.A1166LecMaqCod = GXv_char2[0] ;
            /* Using cursor P03L96 */
            pr_default.execute(4, new Object[] {A396EmprCod, A1166LecMaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( GXutil.strcmp(AV21Texto_i, " ") != 0 )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV20Usurcod, AV19Station, AV21Texto_i, 99999999, (byte)(0), "@") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwbollcb.this.A396EmprCod;
      this.aP1[0] = pwbollcb.this.AV18Maqcod;
      this.aP2[0] = pwbollcb.this.AV8Hisprofec;
      this.aP3[0] = pwbollcb.this.AV19Station;
      this.aP4[0] = pwbollcb.this.AV20Usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "lectoroptico.pwbollcb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Texto_i = "" ;
      scmdbuf = "" ;
      P03L92_A396EmprCod = new String[] {""} ;
      P03L92_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03L92_A602MaqCod = new String[] {""} ;
      P03L92_A567HisProULin = new int[1] ;
      P03L92_n567HisProULin = new boolean[] {false} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      P03L93_A396EmprCod = new String[] {""} ;
      P03L93_A602MaqCod = new String[] {""} ;
      P03L93_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03L93_A561HisProLin = new int[1] ;
      AV27Pgmname = "" ;
      P03L95_A396EmprCod = new String[] {""} ;
      P03L95_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03L95_n1174LecFec = new boolean[] {false} ;
      P03L95_A1166LecMaqCod = new String[] {""} ;
      A1174LecFec = GXutil.nullDate() ;
      A1166LecMaqCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.pwbollcb__default(),
         new Object[] {
             new Object[] {
            P03L92_A396EmprCod, P03L92_A558HisProFec, P03L92_A602MaqCod, P03L92_A567HisProULin, P03L92_n567HisProULin
            }
            , new Object[] {
            P03L93_A396EmprCod, P03L93_A602MaqCod, P03L93_A558HisProFec, P03L93_A561HisProLin
            }
            , new Object[] {
            }
            , new Object[] {
            P03L95_A396EmprCod, P03L95_A1174LecFec, P03L95_n1174LecFec, P03L95_A1166LecMaqCod
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "LectorOptico.PWBOLLcb" ;
      /* GeneXus formulas. */
      AV27Pgmname = "LectorOptico.PWBOLLcb" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22Lhipro ;
   private short Gx_err ;
   private int A567HisProULin ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String AV18Maqcod ;
   private String AV19Station ;
   private String AV20Usurcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV27Pgmname ;
   private String A1166LecMaqCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private java.util.Date AV8Hisprofec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A1174LecFec ;
   private boolean n567HisProULin ;
   private boolean n1174LecFec ;
   private String AV21Texto_i ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03L92_A396EmprCod ;
   private java.util.Date[] P03L92_A558HisProFec ;
   private String[] P03L92_A602MaqCod ;
   private int[] P03L92_A567HisProULin ;
   private boolean[] P03L92_n567HisProULin ;
   private String[] P03L93_A396EmprCod ;
   private String[] P03L93_A602MaqCod ;
   private java.util.Date[] P03L93_A558HisProFec ;
   private int[] P03L93_A561HisProLin ;
   private String[] P03L95_A396EmprCod ;
   private java.util.Date[] P03L95_A1174LecFec ;
   private boolean[] P03L95_n1174LecFec ;
   private String[] P03L95_A1166LecMaqCod ;
}

final  class pwbollcb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03L92", "SELECT EmprCod, HisProFec, MaqCod, HisProULin FROM TXPCHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03L93", "SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03L94", "DELETE FROM TXPCHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCHIPRO")
         ,new ForEachCursor("P03L95", "SELECT EmprCod, LecFec, LecMaqCod FROM TXPLECTOR WHERE (EmprCod = ? and LecMaqCod = ?) AND (LecFec = ?) ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03L96", "DELETE FROM TXPLECTOR  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

