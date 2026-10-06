package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlhashanterior extends GXProcedure
{
   public pctrlhashanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlhashanterior.class ), "" );
   }

   public pctrlhashanterior( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pctrlhashanterior.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pctrlhashanterior.this.A396EmprCod = aP0;
      pctrlhashanterior.this.AV8ALbProPri = aP1;
      pctrlhashanterior.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16Noaplicar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOHAAN", ""), GXv_int2) ;
      pctrlhashanterior.this.GXt_int1 = GXv_int2[0] ;
      AV16Noaplicar = GXt_int1 ;
      AV9Msg_control = " " ;
      if ( AV16Noaplicar == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char3 = AV10ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      pctrlhashanterior.this.GXt_char3 = GXv_char4[0] ;
      AV10ddmmaaaa = GXt_char3 ;
      AV10ddmmaaaa = ((GXutil.strcmp(AV10ddmmaaaa, " ")==0) ? "02/04/12" : AV10ddmmaaaa) ;
      AV11Fecha = localUtil.ctod( AV10ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV12ContCod = ((GXutil.strcmp(AV8ALbProPri, "0")==0) ? "555555" : "666666") ;
      GXv_int5[0] = AV14ContVal ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, AV12ContCod, GXv_int5) ;
      pctrlhashanterior.this.AV14ContVal = GXv_int5[0] ;
      AV13AlbFmd = " " ;
      AV15calprd = (byte)(0) ;
      /* Using cursor P05XT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14ContVal), AV8ALbProPri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P05XT2_A30AlbProCod[0] ;
         A39AlbProPri = P05XT2_A39AlbProPri[0] ;
         A10017AlbFmd = P05XT2_A10017AlbFmd[0] ;
         n10017AlbFmd = P05XT2_n10017AlbFmd[0] ;
         AV13AlbFmd = A10017AlbFmd ;
         AV15calprd = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV13AlbFmd, " ") == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV14ContVal, 8, 0) + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Você NÃO criou o HASH", "") + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Para criar um novo guia, o HASH do Guia anterior deve ser gerado.", "") + GXutil.newLine( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pctrlhashanterior.this.AV9Msg_control;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Msg_control = "" ;
      GXv_int2 = new byte[1] ;
      AV10ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV11Fecha = GXutil.nullDate() ;
      AV12ContCod = "" ;
      GXv_int5 = new int[1] ;
      AV13AlbFmd = "" ;
      scmdbuf = "" ;
      P05XT2_A396EmprCod = new String[] {""} ;
      P05XT2_A30AlbProCod = new long[1] ;
      P05XT2_A39AlbProPri = new String[] {""} ;
      P05XT2_A10017AlbFmd = new String[] {""} ;
      P05XT2_n10017AlbFmd = new boolean[] {false} ;
      A39AlbProPri = "" ;
      A10017AlbFmd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlhashanterior__default(),
         new Object[] {
             new Object[] {
            P05XT2_A396EmprCod, P05XT2_A30AlbProCod, P05XT2_A39AlbProPri, P05XT2_A10017AlbFmd, P05XT2_n10017AlbFmd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Noaplicar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV15calprd ;
   private short Gx_err ;
   private int AV14ContVal ;
   private int GXv_int5[] ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV8ALbProPri ;
   private String AV10ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV12ContCod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private java.util.Date AV11Fecha ;
   private boolean returnInSub ;
   private boolean n10017AlbFmd ;
   private String AV9Msg_control ;
   private String AV13AlbFmd ;
   private String A10017AlbFmd ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05XT2_A396EmprCod ;
   private long[] P05XT2_A30AlbProCod ;
   private String[] P05XT2_A39AlbProPri ;
   private String[] P05XT2_A10017AlbFmd ;
   private boolean[] P05XT2_n10017AlbFmd ;
}

final  class pctrlhashanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05XT2", "SELECT EmprCod, AlbProCod, AlbProPri, AlbFmd FROM TXPCALPRD WHERE (EmprCod = ? and AlbProCod = ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

