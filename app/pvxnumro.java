package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxnumro extends GXProcedure
{
   public pvxnumro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxnumro.class ), "" );
   }

   public pvxnumro( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      pvxnumro.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      pvxnumro.this.AV20MaqCod = aP0;
      pvxnumro.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Ceros = "000000000" ;
      /* Execute user subroutine: 'BUSCA NUMERO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV13OK, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( AV15VxNuVal < 1000000000L )
         {
            AV8STeLotId = (int)(AV15VxNuVal) ;
         }
         else
         {
            AV14MsgRet = AV24Pgmname + GXutil.newLine( ) + httpContext.getMessage( "Atención: Numerador de lotes revasado. REGULARIZAR", "") + GXutil.newLine( ) + httpContext.getMessage( "(Numer: ROLLONUM de Vertex)", "") ;
            httpContext.GX_msglist.addItem(AV14MsgRet);
            AV13OK = httpContext.getMessage( "N", "") ;
         }
      }
      if ( GXutil.strcmp(AV13OK, httpContext.getMessage( "N", "")) == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV12Car9 = GXutil.trim( GXutil.str( AV8STeLotId, 9, 0)) ;
      AV10len = (byte)(GXutil.len( AV12Car9)) ;
      AV10len = (byte)(9-AV10len) ;
      AV9BarPieCod = GXutil.substring( AV11Ceros, 1, AV10len) + AV12Car9 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCA NUMERO' Routine */
      returnInSub = false ;
      AV19VxNuCod = httpContext.getMessage( "ROLLONUM", "") ;
      GXv_int1[0] = AV17VxParVal ;
      GXv_char2[0] = AV16VxParVChar ;
      GXv_int3[0] = AV18CRet ;
      new app.pvxbuspa(remoteHandle, context).execute( httpContext.getMessage( "RONUM", ""), GXv_int1, GXv_char2, GXv_int3) ;
      pvxnumro.this.AV17VxParVal = GXv_int1[0] ;
      pvxnumro.this.AV16VxParVChar = GXv_char2[0] ;
      pvxnumro.this.AV18CRet = GXv_int3[0] ;
      if ( AV18CRet == 0 )
      {
         AV21Modo = GXutil.trim( AV16VxParVChar) ;
         if ( GXutil.strcmp(AV21Modo, httpContext.getMessage( "UNI", "")) == 0 )
         {
            AV19VxNuCod = httpContext.getMessage( "ROLLONUM", "") ;
         }
         else if ( GXutil.strcmp(AV21Modo, httpContext.getMessage( "MAQ", "")) == 0 )
         {
            if ( ! (GXutil.strcmp("", AV20MaqCod)==0) )
            {
               AV19VxNuCod = httpContext.getMessage( "TP", "") + AV20MaqCod ;
            }
         }
      }
      AV25GXLvl75 = (byte)(0) ;
      /* Using cursor P02BX2 */
      pr_default.execute(0, new Object[] {AV19VxNuCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6681VxNuCod = P02BX2_A6681VxNuCod[0] ;
         A6682VXNuVal = P02BX2_A6682VXNuVal[0] ;
         n6682VXNuVal = P02BX2_n6682VXNuVal[0] ;
         AV25GXLvl75 = (byte)(1) ;
         A6682VXNuVal = (long)(A6682VXNuVal+1) ;
         n6682VXNuVal = false ;
         AV15VxNuVal = A6682VXNuVal ;
         AV13OK = httpContext.getMessage( "S", "") ;
         /* Using cursor P02BX3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n6682VXNuVal), Long.valueOf(A6682VXNuVal), A6681VxNuCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXNUMER");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV25GXLvl75 == 0 )
      {
         Gx_msg = AV24Pgmname + GXutil.newLine( ) + httpContext.getMessage( "Numerador ", "") + GXutil.trim( A6681VxNuCod) + httpContext.getMessage( " no existe en Vertex.", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         AV13OK = httpContext.getMessage( "N", "") ;
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxnumro.this.AV9BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pvxnumro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9BarPieCod = "" ;
      AV11Ceros = "" ;
      AV13OK = "" ;
      AV14MsgRet = "" ;
      AV24Pgmname = "" ;
      AV12Car9 = "" ;
      AV19VxNuCod = "" ;
      GXv_int1 = new long[1] ;
      AV16VxParVChar = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      AV21Modo = "" ;
      scmdbuf = "" ;
      P02BX2_A6681VxNuCod = new String[] {""} ;
      P02BX2_A6682VXNuVal = new long[1] ;
      P02BX2_n6682VXNuVal = new boolean[] {false} ;
      A6681VxNuCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxnumro__default(),
         new Object[] {
             new Object[] {
            P02BX2_A6681VxNuCod, P02BX2_A6682VXNuVal, P02BX2_n6682VXNuVal
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "PVXNumRo" ;
      /* GeneXus formulas. */
      AV24Pgmname = "PVXNumRo" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10len ;
   private byte AV18CRet ;
   private byte GXv_int3[] ;
   private byte AV25GXLvl75 ;
   private short Gx_err ;
   private int AV8STeLotId ;
   private long AV15VxNuVal ;
   private long A6682VXNuVal ;
   private long AV17VxParVal ;
   private long GXv_int1[] ;
   private String AV20MaqCod ;
   private String AV9BarPieCod ;
   private String AV11Ceros ;
   private String AV13OK ;
   private String AV14MsgRet ;
   private String AV24Pgmname ;
   private String AV12Car9 ;
   private String AV19VxNuCod ;
   private String AV16VxParVChar ;
   private String GXv_char2[] ;
   private String AV21Modo ;
   private String scmdbuf ;
   private String A6681VxNuCod ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private boolean n6682VXNuVal ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BX2_A6681VxNuCod ;
   private long[] P02BX2_A6682VXNuVal ;
   private boolean[] P02BX2_n6682VXNuVal ;
}

final  class pvxnumro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BX2", "SELECT NuCod, NuVal FROM VTXNUMER WHERE NuCod = ? ORDER BY NuCod  FOR UPDATE OF NuVal NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BX3", "UPDATE VTXNUMER SET NuVal=?  WHERE NuCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "VTXNUMER")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 8);
               return;
      }
   }

}

