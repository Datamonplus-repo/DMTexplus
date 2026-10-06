package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcthashexterio extends GXProcedure
{
   public pcthashexterio( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcthashexterio.class ), "" );
   }

   public pcthashexterio( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pcthashexterio.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pcthashexterio.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcthashexterio.this.AV9Msg_control = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17Noaplicar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOHAAN", ""), GXv_int2) ;
      pcthashexterio.this.GXt_int1 = GXv_int2[0] ;
      AV17Noaplicar = GXt_int1 ;
      AV9Msg_control = " " ;
      if ( AV17Noaplicar == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char3 = AV10ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      pcthashexterio.this.GXt_char3 = GXv_char4[0] ;
      AV10ddmmaaaa = GXt_char3 ;
      AV10ddmmaaaa = ((GXutil.strcmp(AV10ddmmaaaa, " ")==0) ? "02/04/12" : AV10ddmmaaaa) ;
      AV11Fecha = localUtil.ctod( AV10ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV12ContCod = httpContext.getMessage( "EXTHDR", "") ;
      GXv_int5[0] = AV14ContVal ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, AV12ContCod, GXv_int5) ;
      pcthashexterio.this.AV14ContVal = GXv_int5[0] ;
      AV9Msg_control = " " ;
      AV13AlbFmd = " " ;
      AV9Msg_control = " " ;
      AV13AlbFmd = " " ;
      AV16CEXTSA = (byte)(0) ;
      /* Using cursor P05XV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14ContVal)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2253SalExtAlb = P05XV2_A2253SalExtAlb[0] ;
         A10077SalFmd = P05XV2_A10077SalFmd[0] ;
         AV13AlbFmd = A10077SalFmd ;
         AV16CEXTSA = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV13AlbFmd, " ") == 0 ) && ( AV16CEXTSA == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV14ContVal, 8, 0) + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Você NÃO criou o HASH", "") + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Para criar um novo guia, o HASH do Guia anterior deve ser gerado.", "") + GXutil.newLine( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcthashexterio.this.A396EmprCod;
      this.aP1[0] = pcthashexterio.this.AV9Msg_control;
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
      AV10ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV11Fecha = GXutil.nullDate() ;
      AV12ContCod = "" ;
      GXv_int5 = new int[1] ;
      AV13AlbFmd = "" ;
      scmdbuf = "" ;
      P05XV2_A396EmprCod = new String[] {""} ;
      P05XV2_A2253SalExtAlb = new int[1] ;
      P05XV2_A10077SalFmd = new String[] {""} ;
      A10077SalFmd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcthashexterio__default(),
         new Object[] {
             new Object[] {
            P05XV2_A396EmprCod, P05XV2_A2253SalExtAlb, P05XV2_A10077SalFmd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Noaplicar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV16CEXTSA ;
   private short Gx_err ;
   private int AV14ContVal ;
   private int GXv_int5[] ;
   private int A2253SalExtAlb ;
   private String A396EmprCod ;
   private String AV10ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV12ContCod ;
   private String scmdbuf ;
   private String A10077SalFmd ;
   private java.util.Date AV11Fecha ;
   private boolean returnInSub ;
   private String AV9Msg_control ;
   private String AV13AlbFmd ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05XV2_A396EmprCod ;
   private int[] P05XV2_A2253SalExtAlb ;
   private String[] P05XV2_A10077SalFmd ;
}

final  class pcthashexterio__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05XV2", "SELECT EmprCod, SalExtAlb, SalFmd FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
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
      }
   }

}

