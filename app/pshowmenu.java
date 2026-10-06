package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pshowmenu extends GXProcedure
{
   public pshowmenu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pshowmenu.class ), "" );
   }

   public pshowmenu( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      pshowmenu.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pshowmenu.this.AV8PMnuPgm = aP0[0];
      this.aP0 = aP0;
      pshowmenu.this.AV15MenuAnt = aP1[0];
      this.aP1 = aP1;
      pshowmenu.this.AV17Opcion = aP2[0];
      this.aP2 = aP2;
      pshowmenu.this.AV9UsurCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21idx = 0 ;
      /* Optimized group. */
      /* Using cursor P02042 */
      pr_default.execute(0);
      cV21idx = P02042_AV21idx[0] ;
      pr_default.close(0);
      AV21idx = (long)(AV21idx+cV21idx*1) ;
      /* End optimized group. */
      AV25procesados = DecimalUtil.doubleToDec(0) ;
      AV21idx = 1 ;
      /* Using cursor P02043 */
      pr_default.execute(1, new Object[] {AV8PMnuPgm, Byte.valueOf(AV17Opcion)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A946MnuOp = P02043_A946MnuOp[0] ;
         A945MnuId = P02043_A945MnuId[0] ;
         A947MnuPgm = P02043_A947MnuPgm[0] ;
         A949MnuPgmTxt = P02043_A949MnuPgmTxt[0] ;
         A948MnuPgmTpo = P02043_A948MnuPgmTpo[0] ;
         AV17Opcion = A946MnuOp ;
         AV13MnuOp = A946MnuOp ;
         GXt_char1 = AV10OK ;
         GXv_char2[0] = A945MnuId ;
         GXv_int3[0] = A946MnuOp ;
         GXv_char4[0] = AV9UsurCod ;
         GXv_char5[0] = GXt_char1 ;
         new app.ppermisos(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5) ;
         pshowmenu.this.A945MnuId = GXv_char2[0] ;
         pshowmenu.this.A946MnuOp = GXv_int3[0] ;
         pshowmenu.this.AV9UsurCod = GXv_char4[0] ;
         pshowmenu.this.GXt_char1 = GXv_char5[0] ;
         AV10OK = GXt_char1 ;
         if ( GXutil.strcmp(AV10OK, httpContext.getMessage( "S", "")) == 0 )
         {
            AV11MnuPgm = A947MnuPgm ;
            AV12MnuPgmTxt = A949MnuPgmTxt ;
            if ( GXutil.strcmp(A948MnuPgmTpo, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(A945MnuId, httpContext.getMessage( "MPRINCIP", "")) == 0 )
               {
               }
               else
               {
               }
               GXv_char5[0] = AV11MnuPgm ;
               GXv_char4[0] = AV8PMnuPgm ;
               GXv_int3[0] = (byte)(0) ;
               GXv_char2[0] = AV9UsurCod ;
               GXv_int6[0] = AV21idx ;
               new app.pshowmn1(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int3, GXv_char2, AV24Array, GXv_int6) ;
               pshowmenu.this.AV11MnuPgm = GXv_char5[0] ;
               pshowmenu.this.AV8PMnuPgm = GXv_char4[0] ;
               pshowmenu.this.AV9UsurCod = GXv_char2[0] ;
               pshowmenu.this.AV21idx = GXv_int6[0] ;
            }
            else
            {
               if ( GXutil.strcmp(A945MnuId, httpContext.getMessage( "MPRINCIP", "")) == 0 )
               {
               }
               else
               {
               }
            }
         }
         AV25procesados = AV25procesados.add(DecimalUtil.doubleToDec(20)) ;
         AV23aux = httpContext.getMessage( "Menú : ", "") + AV8PMnuPgm + httpContext.getMessage( ", Opcion : ", "") + GXutil.trim( GXutil.str( AV17Opcion, 10, 0)) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV22i = 1 ;
      while ( AV22i < AV21idx )
      {
         AV17Opcion = (byte)(GXutil.lval( AV24Array[(int)(AV22i)-1][3-1])) ;
         GXv_char5[0] = AV24Array[(int)(AV22i)-1][1-1] ;
         GXv_char4[0] = AV24Array[(int)(AV22i)-1][2-1] ;
         GXv_int3[0] = AV17Opcion ;
         GXv_char2[0] = AV24Array[(int)(AV22i)-1][4-1] ;
         GXv_int6[0] = 1 ;
         new app.pshowmn1(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int3, GXv_char2, AV20Array0, GXv_int6) ;
         pshowmenu.this.AV24Array[(int)(AV22i)-1][1-1] = GXv_char5[0] ;
         pshowmenu.this.AV24Array[(int)(AV22i)-1][2-1] = GXv_char4[0] ;
         pshowmenu.this.AV17Opcion = GXv_int3[0] ;
         pshowmenu.this.AV24Array[(int)(AV22i)-1][4-1] = GXv_char2[0] ;
         AV22i = (long)(AV22i+1) ;
         AV23aux = httpContext.getMessage( "Menú : ", "") + AV24Array[(int)(AV22i)-1][1-1] + httpContext.getMessage( ", Opcion : ", "") + GXutil.trim( GXutil.str( AV17Opcion, 10, 0)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pshowmenu.this.AV8PMnuPgm;
      this.aP1[0] = pshowmenu.this.AV15MenuAnt;
      this.aP2[0] = pshowmenu.this.AV17Opcion;
      this.aP3[0] = pshowmenu.this.AV9UsurCod;
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
      P02042_AV21idx = new long[1] ;
      AV25procesados = DecimalUtil.ZERO ;
      P02043_A946MnuOp = new byte[1] ;
      P02043_A945MnuId = new String[] {""} ;
      P02043_A947MnuPgm = new String[] {""} ;
      P02043_A949MnuPgmTxt = new String[] {""} ;
      P02043_A948MnuPgmTpo = new String[] {""} ;
      A945MnuId = "" ;
      A947MnuPgm = "" ;
      A949MnuPgmTxt = "" ;
      A948MnuPgmTpo = "" ;
      AV10OK = "" ;
      GXt_char1 = "" ;
      AV11MnuPgm = "" ;
      AV12MnuPgmTxt = "" ;
      AV24Array = new String[1000][5] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         GX_J = 1 ;
         while ( GX_J <= 5 )
         {
            AV24Array[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV23aux = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV20Array0 = new String[1000][5] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         GX_J = 1 ;
         while ( GX_J <= 5 )
         {
            AV20Array0[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int6 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pshowmenu__default(),
         new Object[] {
             new Object[] {
            P02042_AV21idx
            }
            , new Object[] {
            P02043_A946MnuOp, P02043_A945MnuId, P02043_A947MnuPgm, P02043_A949MnuPgmTxt, P02043_A948MnuPgmTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Opcion ;
   private byte A946MnuOp ;
   private byte AV13MnuOp ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private long AV21idx ;
   private long cV21idx ;
   private long AV22i ;
   private long GXv_int6[] ;
   private java.math.BigDecimal AV25procesados ;
   private String AV8PMnuPgm ;
   private String AV15MenuAnt ;
   private String AV9UsurCod ;
   private String scmdbuf ;
   private String A945MnuId ;
   private String A947MnuPgm ;
   private String A949MnuPgmTxt ;
   private String A948MnuPgmTpo ;
   private String AV10OK ;
   private String GXt_char1 ;
   private String AV11MnuPgm ;
   private String AV12MnuPgmTxt ;
   private String AV24Array[][] ;
   private String AV23aux ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV20Array0[][] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P02042_AV21idx ;
   private byte[] P02043_A946MnuOp ;
   private String[] P02043_A945MnuId ;
   private String[] P02043_A947MnuPgm ;
   private String[] P02043_A949MnuPgmTxt ;
   private String[] P02043_A948MnuPgmTpo ;
}

final  class pshowmenu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02042", "SELECT COUNT(*) FROM TXPMNUOP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02043", "SELECT MnuOp, MnuId, MnuPgm, MnuPgmTxt, MnuPgmTpo FROM TXPMNUOP WHERE MnuId = ? and MnuOp > ? ORDER BY MnuId, MnuOp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

