package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmdispar extends GXProcedure
{
   public pmdispar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmdispar.class ), "" );
   }

   public pmdispar( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 )
   {
      pmdispar.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pmdispar.this.A396EmprCod = aP0;
      pmdispar.this.A361DisCod = aP1;
      pmdispar.this.A758ProCod = aP2;
      pmdispar.this.A368DisFasLin = aP3;
      pmdispar.this.AV15FasCod = aP4[0];
      this.aP4 = aP4;
      pmdispar.this.AV16CliCod = aP5[0];
      this.aP5 = aP5;
      pmdispar.this.AV17DisartCod = aP6[0];
      this.aP6 = aP6;
      pmdispar.this.Gx_mode = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         /* Execute user subroutine: 'ALTA' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Execute user subroutine: 'BAJA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DL2", "")) == 0 )
      {
         /* Execute user subroutine: 'BAJA2' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BAJA' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P01HU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
      /* End optimized DELETE. */
   }

   public void S121( )
   {
      /* 'BAJA2' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'BAJA' */
      S111 ();
      if (returnInSub) return;
      /* Optimized DELETE. */
      /* Using cursor P01HU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
      /* End optimized DELETE. */
   }

   public void S131( )
   {
      /* 'ALTA' Routine */
      returnInSub = false ;
      /* Using cursor P01HU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV17DisartCod, A758ProCod, AV15FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1668ParFasVal = P01HU4_A1668ParFasVal[0] ;
         A1673ParFasObs = P01HU4_A1673ParFasObs[0] ;
         A1664ParFasCod = P01HU4_A1664ParFasCod[0] ;
         A457FasCod = P01HU4_A457FasCod[0] ;
         A65ArtCod = P01HU4_A65ArtCod[0] ;
         A252CliCod = P01HU4_A252CliCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPDISPAR

         */
         A3685DisParVal = A1668ParFasVal ;
         A3686DisParObs = A1673ParFasObs ;
         /* Using cursor P01HU5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
         if ( (pr_default.getStatus(3) == 1) )
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
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP4[0] = pmdispar.this.AV15FasCod;
      this.aP5[0] = pmdispar.this.AV16CliCod;
      this.aP6[0] = pmdispar.this.AV17DisartCod;
      this.aP7[0] = pmdispar.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmdispar");
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
      P01HU4_A396EmprCod = new String[] {""} ;
      P01HU4_A758ProCod = new String[] {""} ;
      P01HU4_A1668ParFasVal = new String[] {""} ;
      P01HU4_A1673ParFasObs = new String[] {""} ;
      P01HU4_A1664ParFasCod = new short[1] ;
      P01HU4_A457FasCod = new String[] {""} ;
      P01HU4_A65ArtCod = new String[] {""} ;
      P01HU4_A252CliCod = new int[1] ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A457FasCod = "" ;
      A65ArtCod = "" ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmdispar__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01HU4_A396EmprCod, P01HU4_A758ProCod, P01HU4_A1668ParFasVal, P01HU4_A1673ParFasObs, P01HU4_A1664ParFasCod, P01HU4_A457FasCod, P01HU4_A65ArtCod, P01HU4_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A368DisFasLin ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV16CliCod ;
   private int A252CliCod ;
   private int GX_INS517 ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV15FasCod ;
   private String AV17DisartCod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A457FasCod ;
   private String A65ArtCod ;
   private String A3685DisParVal ;
   private String A3686DisParObs ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String[] aP7 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01HU4_A396EmprCod ;
   private String[] P01HU4_A758ProCod ;
   private String[] P01HU4_A1668ParFasVal ;
   private String[] P01HU4_A1673ParFasObs ;
   private short[] P01HU4_A1664ParFasCod ;
   private String[] P01HU4_A457FasCod ;
   private String[] P01HU4_A65ArtCod ;
   private int[] P01HU4_A252CliCod ;
}

final  class pmdispar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01HU2", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P01HU3", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P01HU4", "SELECT EmprCod, ProCod, ParFasVal, ParFasObs, ParFasCod, FasCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01HU5", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParTxt, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               return;
      }
   }

}

