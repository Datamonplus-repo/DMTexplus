package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpolfunproc extends GXProcedure
{
   public pccpolfunproc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpolfunproc.class ), "" );
   }

   public pccpolfunproc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[][] executeUdp( String[] aP0 ,
                                 long[] aP1 ,
                                 String[][] AV21Funcion ,
                                 String[][] AV22ParNom )
   {
      AV23ParTpo = new String[200][4] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 4 )
         {
            AV23ParTpo[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, AV21Funcion, AV22ParNom, AV23ParTpo);
      return AV23ParTpo;
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[][] AV21Funcion ,
                        String[][] AV22ParNom ,
                        String[][] AV23ParTpo )
   {
      execute_int(aP0, aP1, AV21Funcion, AV22ParNom, AV23ParTpo);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[][] AV21Funcion ,
                             String[][] AV22ParNom ,
                             String[][] AV23ParTpo )
   {
      pccpolfunproc.this.AV19Txt = aP0[0];
      this.aP0 = aP0;
      pccpolfunproc.this.AV20Pos = aP1[0];
      this.aP1 = aP1;
      pccpolfunproc.this.AV21Funcion = AV21Funcion;
      pccpolfunproc.this.AV22ParNom = AV22ParNom;
      pccpolfunproc.this.AV23ParTpo = AV23ParTpo;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Pos = 1 ;
      while ( new app.core.at(remoteHandle, context).executeUdp( "[%", AV19Txt, (short)(AV20Pos)) > 0 )
      {
         if ( AV20Pos > 200 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Tope 200", ""));
            if (true) break;
         }
         GXt_int1 = (short)(AV24Ini) ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.at(remoteHandle, context).execute( "[%", AV19Txt, (short)(AV20Pos), GXv_int2) ;
         pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
         AV24Ini = GXt_int1 ;
         GXt_int1 = (short)(AV25Fin) ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.at(remoteHandle, context).execute( "%]", AV19Txt, (short)(AV20Pos), GXv_int2) ;
         pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
         AV25Fin = (long)(GXt_int1+2) ;
         AV28Len = (long)(AV25Fin-AV24Ini) ;
         AV21Funcion[(int)(AV20Pos)-1][2-1] = GXutil.substring( AV19Txt, (int)(AV24Ini), (int)(AV28Len)) ;
         GXt_int1 = (short)(AV24Ini) ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.at(remoteHandle, context).execute( "(", AV21Funcion[(int)(AV20Pos)-1][2-1], (short)(1), GXv_int2) ;
         pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
         AV24Ini = GXt_int1 ;
         AV28Len = (long)(AV24Ini-3) ;
         AV21Funcion[(int)(AV20Pos)-1][1-1] = GXutil.substring( AV21Funcion[(int)(AV20Pos)-1][2-1], 3, (int)(AV28Len)) ;
         GXt_int1 = (short)(AV25Fin) ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.at(remoteHandle, context).execute( ")", AV21Funcion[(int)(AV20Pos)-1][2-1], (short)(1), GXv_int2) ;
         pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
         AV25Fin = GXt_int1 ;
         AV24Ini = (long)(AV24Ini+3) ;
         AV28Len = (long)(AV25Fin-AV24Ini) ;
         AV26Par = GXutil.substring( AV21Funcion[(int)(AV20Pos)-1][2-1], (int)(AV24Ini), (int)(AV28Len)) ;
         if ( GXutil.len( AV26Par) == 0 )
         {
            AV21Funcion[(int)(AV20Pos)-1][3-1] = "" ;
         }
         else
         {
            AV27ParCont = 1 ;
            while ( 1 == 1 )
            {
               if ( AV27ParCont == 1 )
               {
                  AV24Ini = 1 ;
               }
               else
               {
                  GXt_int1 = (short)(AV24Ini) ;
                  GXv_int2[0] = GXt_int1 ;
                  new app.core.at(remoteHandle, context).execute( ",", AV26Par, (short)(AV27ParCont-1), GXv_int2) ;
                  pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
                  AV24Ini = (long)(GXt_int1+1) ;
                  if ( AV24Ini == 1 )
                  {
                     if (true) break;
                  }
               }
               GXt_int1 = (short)(AV25Fin) ;
               GXv_int2[0] = GXt_int1 ;
               new app.core.at(remoteHandle, context).execute( "(", AV26Par, (short)(AV27ParCont), GXv_int2) ;
               pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
               AV25Fin = GXt_int1 ;
               AV28Len = (long)(AV25Fin-AV24Ini) ;
               AV23ParTpo[(int)(AV20Pos)-1][(int)(AV27ParCont)-1] = GXutil.substring( AV26Par, (int)(AV24Ini), (int)(AV28Len)) ;
               GXt_int1 = (short)(AV24Ini) ;
               GXv_int2[0] = GXt_int1 ;
               new app.core.at(remoteHandle, context).execute( "(", AV26Par, (short)(AV27ParCont), GXv_int2) ;
               pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
               AV24Ini = (long)(GXt_int1+1) ;
               GXt_int1 = (short)(AV25Fin) ;
               GXv_int2[0] = GXt_int1 ;
               new app.core.at(remoteHandle, context).execute( ")", AV26Par, (short)(AV27ParCont), GXv_int2) ;
               pccpolfunproc.this.GXt_int1 = GXv_int2[0] ;
               AV25Fin = GXt_int1 ;
               AV28Len = (long)(AV25Fin-AV24Ini) ;
               AV22ParNom[(int)(AV20Pos)-1][(int)(AV27ParCont)-1] = GXutil.substring( AV26Par, (int)(AV24Ini), (int)(AV28Len)) ;
               if ( new app.core.at(remoteHandle, context).executeUdp( "'", AV22ParNom[(int)(AV20Pos)-1][(int)(AV27ParCont)-1], (short)(1)) == 1 )
               {
                  Cond_result = true ;
               }
               else
               {
                  Cond_result = false ;
               }
               if ( Cond_result )
               {
                  AV24Ini = 2 ;
                  AV28Len = (long)(GXutil.len( AV22ParNom[(int)(AV20Pos)-1][(int)(AV27ParCont)-1])-2) ;
                  AV22ParNom[(int)(AV20Pos)-1][(int)(AV27ParCont)-1] = GXutil.substring( AV22ParNom[(int)(AV20Pos)-1][(int)(AV27ParCont)-1], (int)(AV24Ini), (int)(AV28Len)) ;
               }
               else
               {
               }
               AV27ParCont = (long)(AV27ParCont+1) ;
            }
            AV21Funcion[(int)(AV20Pos)-1][3-1] = GXutil.str( AV27ParCont-1, 10, 0) ;
         }
         AV20Pos = (long)(AV20Pos+1) ;
      }
      AV20Pos = (long)(AV20Pos-1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccpolfunproc.this.AV19Txt;
      this.aP1[0] = pccpolfunproc.this.AV20Pos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26Par = "" ;
      GXv_int2 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXt_int1 ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private long AV20Pos ;
   private long AV24Ini ;
   private long AV25Fin ;
   private long AV28Len ;
   private long AV27ParCont ;
   private String AV21Funcion[][] ;
   private String AV22ParNom[][] ;
   private String AV26Par ;
   private boolean Cond_result ;
   private String AV19Txt ;
   private String[][] AV23ParTpo ;
   private String[] aP0 ;
   private long[] aP1 ;
}

