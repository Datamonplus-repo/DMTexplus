package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apartfasfct extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apartfasfct pgm = new apartfasfct (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apartfasfct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apartfasfct.class ), "" );
   }

   public apartfasfct( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apartfasfct.this.AV10EmprCod = GXv_char1[0] ;
      apartfasfct.this.AV11EmprNom = GXv_char2[0] ;
      apartfasfct.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P05D02 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8560ArtFasFac = P05D02_A8560ArtFasFac[0] ;
         A396EmprCod = P05D02_A396EmprCod[0] ;
         A252CliCod = P05D02_A252CliCod[0] ;
         A65ArtCod = P05D02_A65ArtCod[0] ;
         A758ProCod = P05D02_A758ProCod[0] ;
         A457FasCod = P05D02_A457FasCod[0] ;
         AV12Clicod = A252CliCod ;
         AV13ARtcod = A65ArtCod ;
         AV14Procod = A758ProCod ;
         AV15fascod = A457FasCod ;
         AV16ArtFasFac = A8560ArtFasFac ;
         /* Execute user subroutine: 'CAPFMP' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CAPFMP' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPCAPFMP

      */
      A396EmprCod = AV10EmprCod ;
      A252CliCod = AV12Clicod ;
      A65ArtCod = AV13ARtcod ;
      A758ProCod = AV14Procod ;
      A9836FasCodM = AV15fascod ;
      A12647ArtFasFct = AV16ArtFasFac ;
      n12647ArtFasFct = false ;
      AV17Control = httpContext.getMessage( " Actualizando Datos= ", "") + GXutil.str( A252CliCod, 6, 0) + " " + A65ArtCod + " " + A758ProCod + " " + A9836FasCodM + " " + GXutil.str( A12647ArtFasFct, 6, 2) ;
      /* Using cursor P05D03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, Boolean.valueOf(n12647ArtFasFct), A12647ArtFasFct});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFMP");
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

   public static Object refClasses( )
   {
      GXutil.refClasses(partfasfct.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apartfasfct");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05D02_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05D02_A396EmprCod = new String[] {""} ;
      P05D02_A252CliCod = new int[1] ;
      P05D02_A65ArtCod = new String[] {""} ;
      P05D02_A758ProCod = new String[] {""} ;
      P05D02_A457FasCod = new String[] {""} ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      AV13ARtcod = "" ;
      AV14Procod = "" ;
      AV15fascod = "" ;
      AV16ArtFasFac = DecimalUtil.ZERO ;
      A9836FasCodM = "" ;
      A12647ArtFasFct = DecimalUtil.ZERO ;
      AV17Control = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apartfasfct__default(),
         new Object[] {
             new Object[] {
            P05D02_A8560ArtFasFac, P05D02_A396EmprCod, P05D02_A252CliCod, P05D02_A65ArtCod, P05D02_A758ProCod, P05D02_A457FasCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV12Clicod ;
   private int GX_INS1293 ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private java.math.BigDecimal AV16ArtFasFac ;
   private java.math.BigDecimal A12647ArtFasFct ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV13ARtcod ;
   private String AV14Procod ;
   private String AV15fascod ;
   private String A9836FasCodM ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n12647ArtFasFct ;
   private String AV17Control ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P05D02_A8560ArtFasFac ;
   private String[] P05D02_A396EmprCod ;
   private int[] P05D02_A252CliCod ;
   private String[] P05D02_A65ArtCod ;
   private String[] P05D02_A758ProCod ;
   private String[] P05D02_A457FasCod ;
}

final  class apartfasfct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05D02", "SELECT ArtFasFac, EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE (EmprCod = ?) AND (ArtFasFac > 0) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05D03", "INSERT INTO TXPCAPFMP(EmprCod, CliCod, ArtCod, ProCod, FasCodM, ArtFasFct) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFMP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               return;
      }
   }

}

