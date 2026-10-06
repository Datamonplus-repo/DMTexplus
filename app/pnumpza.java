package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpza extends GXProcedure
{
   public pnumpza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpza.class ), "" );
   }

   public pnumpza( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pnumpza.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pnumpza.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpza.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pnumpza.this.A2159AlbRecPie = aP2[0];
      this.aP2 = aP2;
      pnumpza.this.AV22DisPieMet = aP3[0];
      this.aP3 = aP3;
      pnumpza.this.AV19LetOri = aP4[0];
      this.aP4 = aP4;
      pnumpza.this.AV21Opcion = aP5[0];
      this.aP5 = aP5;
      pnumpza.this.AV18LetPza = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Letras = httpContext.getMessage( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "") ;
      if ( AV21Opcion == 1 )
      {
         /* Using cursor P00TI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A3731AlbRecIdPz = P00TI2_A3731AlbRecIdPz[0] ;
            if ( (GXutil.strcmp("", A3731AlbRecIdPz)==0) )
            {
               A3731AlbRecIdPz = httpContext.getMessage( "AA", "") ;
               AV18LetPza = httpContext.getMessage( "AA ", "") ;
            }
            else
            {
               AV17LetraAct = GXutil.substring( A3731AlbRecIdPz, 1, 1) ;
               /* Execute user subroutine: 'SIGLETRA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               A3731AlbRecIdPz = AV20LetSig + httpContext.getMessage( "A", "") ;
               AV18LetPza = AV20LetSig + httpContext.getMessage( "A", "") + " " ;
            }
            /* Using cursor P00TI3 */
            pr_default.execute(1, new Object[] {A3731AlbRecIdPz, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( AV21Opcion == 2 )
      {
         /* Using cursor P00TI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A3731AlbRecIdPz = P00TI4_A3731AlbRecIdPz[0] ;
            AV17LetraAct = GXutil.substring( A3731AlbRecIdPz, 2, 1) ;
            if ( GXutil.strcmp(AV17LetraAct, " ") == 0 )
            {
               AV20LetSig = httpContext.getMessage( "A", "") ;
            }
            else
            {
               /* Execute user subroutine: 'SIGLETRA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            A3731AlbRecIdPz = GXutil.substring( A3731AlbRecIdPz, 1, 1) + AV20LetSig ;
            AV18LetPza = GXutil.substring( AV19LetOri, 1, 1) + AV20LetSig + " " ;
            /* Using cursor P00TI5 */
            pr_default.execute(3, new Object[] {A3731AlbRecIdPz, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SIGLETRA' Routine */
      returnInSub = false ;
      AV16Cont = (byte)(1) ;
      while ( GXutil.strcmp(GXutil.substring( AV15Letras, AV16Cont, 1), AV17LetraAct) != 0 )
      {
         AV16Cont = (byte)(AV16Cont+1) ;
      }
      AV16Cont = (byte)(AV16Cont+1) ;
      AV20LetSig = GXutil.substring( AV15Letras, AV16Cont, 1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpza.this.A396EmprCod;
      this.aP1[0] = pnumpza.this.A44AlbRecCod;
      this.aP2[0] = pnumpza.this.A2159AlbRecPie;
      this.aP3[0] = pnumpza.this.AV22DisPieMet;
      this.aP4[0] = pnumpza.this.AV19LetOri;
      this.aP5[0] = pnumpza.this.AV21Opcion;
      this.aP6[0] = pnumpza.this.AV18LetPza;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumpza");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Letras = "" ;
      scmdbuf = "" ;
      P00TI2_A396EmprCod = new String[] {""} ;
      P00TI2_A44AlbRecCod = new int[1] ;
      P00TI2_A2159AlbRecPie = new String[] {""} ;
      P00TI2_A3731AlbRecIdPz = new String[] {""} ;
      A3731AlbRecIdPz = "" ;
      AV17LetraAct = "" ;
      AV20LetSig = "" ;
      P00TI4_A396EmprCod = new String[] {""} ;
      P00TI4_A44AlbRecCod = new int[1] ;
      P00TI4_A2159AlbRecPie = new String[] {""} ;
      P00TI4_A3731AlbRecIdPz = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpza__default(),
         new Object[] {
             new Object[] {
            P00TI2_A396EmprCod, P00TI2_A44AlbRecCod, P00TI2_A2159AlbRecPie, P00TI2_A3731AlbRecIdPz
            }
            , new Object[] {
            }
            , new Object[] {
            P00TI4_A396EmprCod, P00TI4_A44AlbRecCod, P00TI4_A2159AlbRecPie, P00TI4_A3731AlbRecIdPz
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21Opcion ;
   private byte AV16Cont ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV22DisPieMet ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String AV19LetOri ;
   private String AV18LetPza ;
   private String AV15Letras ;
   private String scmdbuf ;
   private String A3731AlbRecIdPz ;
   private String AV17LetraAct ;
   private String AV20LetSig ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00TI2_A396EmprCod ;
   private int[] P00TI2_A44AlbRecCod ;
   private String[] P00TI2_A2159AlbRecPie ;
   private String[] P00TI2_A3731AlbRecIdPz ;
   private String[] P00TI4_A396EmprCod ;
   private int[] P00TI4_A44AlbRecCod ;
   private String[] P00TI4_A2159AlbRecPie ;
   private String[] P00TI4_A3731AlbRecIdPz ;
}

final  class pnumpza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TI2", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecIdPz FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00TI3", "UPDATE TXPALBDET SET AlbRecIdPz=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new ForEachCursor("P00TI4", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecIdPz FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00TI5", "UPDATE TXPALBDET SET AlbRecIdPz=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 15);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 15);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
      }
   }

}

