package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmrmtesp extends GXProcedure
{
   public pmrmtesp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmrmtesp.class ), "" );
   }

   public pmrmtesp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pmrmtesp.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pmrmtesp.this.AV12EmprCod = aP0[0];
      this.aP0 = aP0;
      pmrmtesp.this.AV11MovEsp = aP1[0];
      this.aP1 = aP1;
      pmrmtesp.this.AV8MTMovCod = aP2[0];
      this.aP2 = aP2;
      pmrmtesp.this.AV9MTMovNom = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ContCod = httpContext.getMessage( "MRMT", "") + AV11MovEsp ;
      GXt_int1 = AV8MTMovCod ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV10ContCod ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pmrmtesp.this.AV12EmprCod = GXv_char2[0] ;
      pmrmtesp.this.AV10ContCod = GXv_char3[0] ;
      pmrmtesp.this.GXt_int1 = GXv_int4[0] ;
      AV8MTMovCod = GXt_int1 ;
      AV16GXLvl4 = (byte)(0) ;
      /* Using cursor P03MQ2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV8MTMovCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9410MTMovCod = P03MQ2_A9410MTMovCod[0] ;
         A9411MTMovNom = P03MQ2_A9411MTMovNom[0] ;
         n9411MTMovNom = P03MQ2_n9411MTMovNom[0] ;
         A396EmprCod = P03MQ2_A396EmprCod[0] ;
         AV16GXLvl4 = (byte)(1) ;
         AV9MTMovNom = A9411MTMovNom ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV16GXLvl4 == 0 )
      {
         if ( AV8MTMovCod == 0 )
         {
            GXt_int1 = AV8MTMovCod ;
            GXv_int4[0] = GXt_int1 ;
            new app.pnumdoc(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "MNTTMO", ""), GXv_int4) ;
            pmrmtesp.this.GXt_int1 = GXv_int4[0] ;
            AV8MTMovCod = GXt_int1 ;
            /*
               INSERT RECORD ON TABLE TXPEMPLIN

            */
            A396EmprCod = AV12EmprCod ;
            A313ContCod = AV10ContCod ;
            AV13ContDsc = httpContext.getMessage( "Tipo Mov Aut.p/ ", "") + AV11MovEsp ;
            A314ContDsc = GXutil.substring( AV13ContDsc, 1, 20) ;
            A316ContVal = AV8MTMovCod ;
            /* Using cursor P03MQ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A313ContCod, A314ContDsc, Integer.valueOf(A316ContVal)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
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
         /*
            INSERT RECORD ON TABLE TXPMTPOMO

         */
         A396EmprCod = AV12EmprCod ;
         A9410MTMovCod = AV8MTMovCod ;
         A9411MTMovNom = AV9MTMovNom ;
         n9411MTMovNom = false ;
         /* Using cursor P03MQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9410MTMovCod), Boolean.valueOf(n9411MTMovNom), A9411MTMovNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTPOMO");
         if ( (pr_default.getStatus(2) == 1) )
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
      this.aP0[0] = pmrmtesp.this.AV12EmprCod;
      this.aP1[0] = pmrmtesp.this.AV11MovEsp;
      this.aP2[0] = pmrmtesp.this.AV8MTMovCod;
      this.aP3[0] = pmrmtesp.this.AV9MTMovNom;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pmrmtesp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ContCod = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P03MQ2_A9410MTMovCod = new int[1] ;
      P03MQ2_A9411MTMovNom = new String[] {""} ;
      P03MQ2_n9411MTMovNom = new boolean[] {false} ;
      P03MQ2_A396EmprCod = new String[] {""} ;
      A9411MTMovNom = "" ;
      A396EmprCod = "" ;
      GXv_int4 = new int[1] ;
      A313ContCod = "" ;
      AV13ContDsc = "" ;
      A314ContDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmrmtesp__default(),
         new Object[] {
             new Object[] {
            P03MQ2_A9410MTMovCod, P03MQ2_A9411MTMovNom, P03MQ2_n9411MTMovNom, P03MQ2_A396EmprCod
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

   private byte AV16GXLvl4 ;
   private short Gx_err ;
   private int AV8MTMovCod ;
   private int A9410MTMovCod ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int GX_INS41 ;
   private int A316ContVal ;
   private int GX_INS1244 ;
   private String AV12EmprCod ;
   private String AV11MovEsp ;
   private String AV9MTMovNom ;
   private String AV10ContCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A9411MTMovNom ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String AV13ContDsc ;
   private String A314ContDsc ;
   private String Gx_emsg ;
   private boolean n9411MTMovNom ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P03MQ2_A9410MTMovCod ;
   private String[] P03MQ2_A9411MTMovNom ;
   private boolean[] P03MQ2_n9411MTMovNom ;
   private String[] P03MQ2_A396EmprCod ;
}

final  class pmrmtesp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MQ2", "SELECT MTMovCod, MTMovNom, EmprCod FROM TXPMTPOMO WHERE MTMovCod = ? ORDER BY EmprCod, MTMovCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MQ3", "INSERT INTO TXPEMPLIN(EmprCod, ContCod, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContCtrl, ContClaseD, ContFecUti, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContNumIni, ContAplica, ContFecFUt, ContNumlas, ContIdSerL, Contnumcer, Contmedio) VALUES(?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new UpdateCursor("P03MQ4", "INSERT INTO TXPMTPOMO(EmprCod, MTMovCod, MTMovNom) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMTPOMO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 20);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               return;
      }
   }

}

