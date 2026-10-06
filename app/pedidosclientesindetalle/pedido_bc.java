package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pedido_bc extends GXWebPanel implements IGxSilentTrn
{
   public pedido_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pedido_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedido_bc.class ));
   }

   public pedido_bc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1S034( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1S034( ) ;
      standaloneModal( ) ;
      addRow1S034( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            SetMode( "UPD") ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_1S00( )
   {
      beforeValidate1S034( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1S034( ) ;
         }
         else
         {
            checkExtendedTable1S034( ) ;
            if ( AnyError == 0 )
            {
               zm1S034( 36) ;
               zm1S034( 37) ;
               zm1S034( 38) ;
               zm1S034( 39) ;
               zm1S034( 40) ;
               zm1S034( 41) ;
               zm1S034( 42) ;
               zm1S034( 43) ;
               zm1S034( 44) ;
               zm1S034( 45) ;
               zm1S034( 46) ;
               zm1S034( 47) ;
            }
            closeExtendedTableCursors1S034( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1S01812( ) ;
         if ( AnyError == 0 )
         {
            confirm_1S035( ) ;
            if ( AnyError == 0 )
            {
               confirm_1S037( ) ;
               if ( AnyError == 0 )
               {
                  confirm_1S038( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Restore parent mode. */
                     Gx_mode = sMode34 ;
                     IsConfirmed = (short)(1) ;
                  }
               }
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
      }
   }

   public void confirm_1S0517( )
   {
      nGXsfl_517_idx = 0 ;
      while ( nGXsfl_517_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().size() )
      {
         readRow1S0517( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound517 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_517 != 0 ) )
         {
            getKey1S0517( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound517 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1S0517( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S0517( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1S0517( 61) ;
                     }
                     closeExtendedTableCursors1S0517( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound517 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1S0517( ) ;
                     load1S0517( ) ;
                     beforeValidate1S0517( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S0517( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_517 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1S0517( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S0517( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1S0517( 61) ;
                           }
                           closeExtendedTableCursors1S0517( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow517( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().elementAt(-1+nGXsfl_517_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1S0780( )
   {
      nGXsfl_780_idx = 0 ;
      while ( nGXsfl_780_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().size() )
      {
         readRow1S0780( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound780 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_780 != 0 ) )
         {
            getKey1S0780( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound780 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1S0780( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S0780( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1S0780( 59) ;
                     }
                     closeExtendedTableCursors1S0780( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound780 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1S0780( ) ;
                     load1S0780( ) ;
                     beforeValidate1S0780( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S0780( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_780 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1S0780( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S0780( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1S0780( 59) ;
                           }
                           closeExtendedTableCursors1S0780( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow780( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().elementAt(-1+nGXsfl_780_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1S039( )
   {
      nGXsfl_39_idx = 0 ;
      while ( nGXsfl_39_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().size() )
      {
         readRow1S039( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound39 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_39 != 0 ) )
         {
            getKey1S039( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound39 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1S039( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S039( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1S039( 57) ;
                     }
                     closeExtendedTableCursors1S039( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode39 = Gx_mode ;
                        confirm_1S0780( ) ;
                        if ( AnyError == 0 )
                        {
                           confirm_1S0517( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Restore parent mode. */
                              Gx_mode = sMode39 ;
                              IsConfirmed = (short)(1) ;
                           }
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode39 ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1S039( ) ;
                     load1S039( ) ;
                     beforeValidate1S039( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S039( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1S039( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S039( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1S039( 57) ;
                           }
                           closeExtendedTableCursors1S039( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode39 = Gx_mode ;
                              confirm_1S0780( ) ;
                              if ( AnyError == 0 )
                              {
                                 confirm_1S0517( ) ;
                                 if ( AnyError == 0 )
                                 {
                                    /* Restore parent mode. */
                                    Gx_mode = sMode39 ;
                                    IsConfirmed = (short)(1) ;
                                 }
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode39 ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow39( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1S038( )
   {
      nGXsfl_38_idx = 0 ;
      while ( nGXsfl_38_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().size() )
      {
         readRow1S038( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound38 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_38 != 0 ) )
         {
            getKey1S038( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound38 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1S038( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S038( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1S038( 55) ;
                     }
                     closeExtendedTableCursors1S038( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode38 = Gx_mode ;
                        confirm_1S039( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode38 ;
                           IsConfirmed = (short)(1) ;
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode38 ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound38 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1S038( ) ;
                     load1S038( ) ;
                     beforeValidate1S038( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S038( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_38 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1S038( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S038( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1S038( 55) ;
                           }
                           closeExtendedTableCursors1S038( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode38 = Gx_mode ;
                              confirm_1S039( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode38 ;
                                 IsConfirmed = (short)(1) ;
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode38 ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow38( ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1S037( )
   {
      nGXsfl_37_idx = 0 ;
      while ( nGXsfl_37_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().size() )
      {
         readRow1S037( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound37 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_37 != 0 ) )
         {
            getKey1S037( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound37 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1S037( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S037( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1S037( 53) ;
                     }
                     closeExtendedTableCursors1S037( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound37 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1S037( ) ;
                     load1S037( ) ;
                     beforeValidate1S037( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S037( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_37 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1S037( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S037( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1S037( 53) ;
                           }
                           closeExtendedTableCursors1S037( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow37( ((app.pedidosclientesindetalle.SdtPedido_Defecto)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().elementAt(-1+nGXsfl_37_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1S035( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().size() )
      {
         readRow1S035( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound35 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_35 != 0 ) )
         {
            getKey1S035( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound35 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1S035( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S035( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1S035( 51) ;
                     }
                     closeExtendedTableCursors1S035( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound35 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1S035( ) ;
                     load1S035( ) ;
                     beforeValidate1S035( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S035( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_35 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1S035( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S035( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1S035( 51) ;
                           }
                           closeExtendedTableCursors1S035( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow35( ((app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().elementAt(-1+nGXsfl_35_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1S01812( )
   {
      nGXsfl_1812_idx = 0 ;
      while ( nGXsfl_1812_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().size() )
      {
         readRow1S01812( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound1812 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_1812 != 0 ) )
         {
            getKey1S01812( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound1812 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1S01812( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S01812( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1S01812( 49) ;
                     }
                     closeExtendedTableCursors1S01812( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1812 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1S01812( ) ;
                     load1S01812( ) ;
                     beforeValidate1S01812( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S01812( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1812 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1S01812( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S01812( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1S01812( 49) ;
                           }
                           closeExtendedTableCursors1S01812( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow1812( ((app.pedidosclientesindetalle.SdtPedido_Norma)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().elementAt(-1+nGXsfl_1812_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void e111S02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pedido_bc.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      pedido_bc.this.A396EmprCod = GXv_char2[0] ;
      pedido_bc.this.AV12EmprNom = GXv_char3[0] ;
      pedido_bc.this.AV14UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV8Prio1) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRIOR1", ""), GXv_int6) ;
      pedido_bc.this.GXt_int5 = GXv_int6[0] ;
      AV8Prio1 = GXt_int5 ;
      GXt_int5 = (byte)(AV15moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      pedido_bc.this.GXt_int5 = GXv_int6[0] ;
      AV15moda21 = GXt_int5 ;
      AV10ExisteArticulo = (short)(0) ;
   }

   public void zm1S034( int GX_JID )
   {
      if ( ( GX_JID == 35 ) || ( GX_JID == 0 ) )
      {
         Z2310DisCliDes = A2310DisCliDes ;
         Z2009DisTipDis = A2009DisTipDis ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z340DisArtMat = A340DisArtMat ;
         Z2835DisPle2 = A2835DisPle2 ;
         Z339DisArtLar = A339DisArtLar ;
         Z351DisArtSua = A351DisArtSua ;
         Z333DisArtAca = A333DisArtAca ;
         Z343DisArtPle = A343DisArtPle ;
         Z352DisArtTip = A352DisArtTip ;
         Z338DisArtEnc = A338DisArtEnc ;
         Z336DisArtCor = A336DisArtCor ;
         Z353DisArtTr1 = A353DisArtTr1 ;
         Z354DisArtTr2 = A354DisArtTr2 ;
         Z355DisArtTr3 = A355DisArtTr3 ;
         Z344DisArtPt1 = A344DisArtPt1 ;
         Z345DisArtPt2 = A345DisArtPt2 ;
         Z346DisArtPt3 = A346DisArtPt3 ;
         Z350DisArtRdt = A350DisArtRdt ;
         Z359DisArtUrg = A359DisArtUrg ;
         Z356DisArtUr1 = A356DisArtUr1 ;
         Z357DisArtUr2 = A357DisArtUr2 ;
         Z358DisArtUr3 = A358DisArtUr3 ;
         Z347DisArtPu1 = A347DisArtPu1 ;
         Z348DisArtPu2 = A348DisArtPu2 ;
         Z349DisArtPu3 = A349DisArtPu3 ;
         Z342DisArtPes = A342DisArtPes ;
         Z1225DisGraCru = A1225DisGraCru ;
         Z334DisArtAnh = A334DisArtAnh ;
         Z1231DisArtAn1 = A1231DisArtAn1 ;
         Z1232DisArtAcb = A1232DisArtAcb ;
         Z1233DisArtAc2 = A1233DisArtAc2 ;
         Z1197DisEncCom = A1197DisEncCom ;
         Z1198DisEncAnh = A1198DisEncAnh ;
         Z3127DisNumCor = A3127DisNumCor ;
         Z3128DisAncSal1 = A3128DisAncSal1 ;
         Z3129DisAncSal2 = A3129DisAncSal2 ;
         Z3130DisAncSal3 = A3130DisAncSal3 ;
         Z3131DisGraAca2 = A3131DisGraAca2 ;
         Z3132DisGraCru2 = A3132DisGraCru2 ;
         Z1906DisGraAca = A1906DisGraAca ;
         Z1908DisRdoA = A1908DisRdoA ;
         Z1907DisRdoN = A1907DisRdoN ;
         Z5349DisObsGrm = A5349DisObsGrm ;
         Z5350DisObsAnc = A5350DisObsAnc ;
         Z9786DisItem5 = A9786DisItem5 ;
         Z392DisUniMed = A392DisUniMed ;
         Z757PriCod = A757PriCod ;
         Z4813DisEncCli = A4813DisEncCli ;
         Z369DisFec = A369DisFec ;
         Z370DisFecCli = A370DisFecCli ;
         Z371DisFecEnt = A371DisFecEnt ;
         Z335DisArtCod = A335DisArtCod ;
         Z362DisColNom = A362DisColNom ;
         Z363DisColNum = A363DisColNum ;
         Z367DisEst = A367DisEst ;
         Z365DisDes = A365DisDes ;
         Z13987DisArtDsc2 = A13987DisArtDsc2 ;
         Z11661DisOrdComp = A11661DisOrdComp ;
         Z12765DisPriorid = A12765DisPriorid ;
         Z11859Nxt_modelo = A11859Nxt_modelo ;
         Z11861Nxt_statio = A11861Nxt_statio ;
         Z11864Nxt_artcli = A11864Nxt_artcli ;
         Z7739DisExp = A7739DisExp ;
         Z252CliCod = A252CliCod ;
         Z390DisTipCol = A390DisTipCol ;
         Z10887Cod_Idtx = A10887Cod_Idtx ;
         Z13986DisIdtx2 = A13986DisIdtx2 ;
         Z11659MarcaId = A11659MarcaId ;
         Z11863DptoID = A11863DptoID ;
         Z11860CpteId = A11860CpteId ;
         Z11862DesaID = A11862DesaID ;
         Z12328RevenID = A12328RevenID ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 37 ) || ( GX_JID == 0 ) )
      {
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 38 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 39 ) || ( GX_JID == 0 ) )
      {
         Z279CliNom = A279CliNom ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 40 ) || ( GX_JID == 0 ) )
      {
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 41 ) || ( GX_JID == 0 ) )
      {
         Z10888Dsc_Idtx = A10888Dsc_Idtx ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 42 ) || ( GX_JID == 0 ) )
      {
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 43 ) || ( GX_JID == 0 ) )
      {
         Z11660MarcaDsc = A11660MarcaDsc ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 44 ) || ( GX_JID == 0 ) )
      {
         Z11867DptoDsc = A11867DptoDsc ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 45 ) || ( GX_JID == 0 ) )
      {
         Z11865CpteDsc = A11865CpteDsc ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 46 ) || ( GX_JID == 0 ) )
      {
         Z11866DesaDsc = A11866DesaDsc ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( ( GX_JID == 47 ) || ( GX_JID == 0 ) )
      {
         Z12327RevenNm = A12327RevenNm ;
         Z14003CliNomDes = A14003CliNomDes ;
         Z13994E_DisCliDe = A13994E_DisCliDe ;
         Z13995E_DisArtCo = A13995E_DisArtCo ;
         Z12115DisArtTipD = A12115DisArtTipD ;
      }
      if ( GX_JID == -35 )
      {
         Z361DisCod = A361DisCod ;
         Z2310DisCliDes = A2310DisCliDes ;
         Z2009DisTipDis = A2009DisTipDis ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z340DisArtMat = A340DisArtMat ;
         Z2835DisPle2 = A2835DisPle2 ;
         Z339DisArtLar = A339DisArtLar ;
         Z351DisArtSua = A351DisArtSua ;
         Z333DisArtAca = A333DisArtAca ;
         Z343DisArtPle = A343DisArtPle ;
         Z352DisArtTip = A352DisArtTip ;
         Z338DisArtEnc = A338DisArtEnc ;
         Z336DisArtCor = A336DisArtCor ;
         Z353DisArtTr1 = A353DisArtTr1 ;
         Z354DisArtTr2 = A354DisArtTr2 ;
         Z355DisArtTr3 = A355DisArtTr3 ;
         Z344DisArtPt1 = A344DisArtPt1 ;
         Z345DisArtPt2 = A345DisArtPt2 ;
         Z346DisArtPt3 = A346DisArtPt3 ;
         Z350DisArtRdt = A350DisArtRdt ;
         Z359DisArtUrg = A359DisArtUrg ;
         Z356DisArtUr1 = A356DisArtUr1 ;
         Z357DisArtUr2 = A357DisArtUr2 ;
         Z358DisArtUr3 = A358DisArtUr3 ;
         Z347DisArtPu1 = A347DisArtPu1 ;
         Z348DisArtPu2 = A348DisArtPu2 ;
         Z349DisArtPu3 = A349DisArtPu3 ;
         Z342DisArtPes = A342DisArtPes ;
         Z1225DisGraCru = A1225DisGraCru ;
         Z334DisArtAnh = A334DisArtAnh ;
         Z1231DisArtAn1 = A1231DisArtAn1 ;
         Z1232DisArtAcb = A1232DisArtAcb ;
         Z1233DisArtAc2 = A1233DisArtAc2 ;
         Z1197DisEncCom = A1197DisEncCom ;
         Z1198DisEncAnh = A1198DisEncAnh ;
         Z3127DisNumCor = A3127DisNumCor ;
         Z3128DisAncSal1 = A3128DisAncSal1 ;
         Z3129DisAncSal2 = A3129DisAncSal2 ;
         Z3130DisAncSal3 = A3130DisAncSal3 ;
         Z3131DisGraAca2 = A3131DisGraAca2 ;
         Z3132DisGraCru2 = A3132DisGraCru2 ;
         Z1906DisGraAca = A1906DisGraAca ;
         Z1908DisRdoA = A1908DisRdoA ;
         Z1907DisRdoN = A1907DisRdoN ;
         Z5349DisObsGrm = A5349DisObsGrm ;
         Z5350DisObsAnc = A5350DisObsAnc ;
         Z9786DisItem5 = A9786DisItem5 ;
         Z392DisUniMed = A392DisUniMed ;
         Z757PriCod = A757PriCod ;
         Z4813DisEncCli = A4813DisEncCli ;
         Z369DisFec = A369DisFec ;
         Z370DisFecCli = A370DisFecCli ;
         Z371DisFecEnt = A371DisFecEnt ;
         Z335DisArtCod = A335DisArtCod ;
         Z362DisColNom = A362DisColNom ;
         Z363DisColNum = A363DisColNum ;
         Z367DisEst = A367DisEst ;
         Z365DisDes = A365DisDes ;
         Z13987DisArtDsc2 = A13987DisArtDsc2 ;
         Z11661DisOrdComp = A11661DisOrdComp ;
         Z12765DisPriorid = A12765DisPriorid ;
         Z11859Nxt_modelo = A11859Nxt_modelo ;
         Z11861Nxt_statio = A11861Nxt_statio ;
         Z11864Nxt_artcli = A11864Nxt_artcli ;
         Z7739DisExp = A7739DisExp ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z390DisTipCol = A390DisTipCol ;
         Z10887Cod_Idtx = A10887Cod_Idtx ;
         Z13986DisIdtx2 = A13986DisIdtx2 ;
         Z11659MarcaId = A11659MarcaId ;
         Z11863DptoID = A11863DptoID ;
         Z11860CpteId = A11860CpteId ;
         Z11862DesaID = A11862DesaID ;
         Z12328RevenID = A12328RevenID ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z10888Dsc_Idtx = A10888Dsc_Idtx ;
         Z12327RevenNm = A12327RevenNm ;
         Z11660MarcaDsc = A11660MarcaDsc ;
         Z11865CpteDsc = A11865CpteDsc ;
         Z11866DesaDsc = A11866DesaDsc ;
         Z11867DptoDsc = A11867DptoDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S041 */
      pr_default.execute(35, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01S041_A407EmprNom[0] ;
      n407EmprNom = BC01S041_n407EmprNom[0] ;
      pr_default.close(35);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A369DisFec)) && ( Gx_BScreen == 0 ) )
      {
         A369DisFec = GXutil.today( ) ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A370DisFecCli)) && ( Gx_BScreen == 0 ) )
      {
         A370DisFecCli = GXutil.today( ) ;
      }
      if ( isIns( )  && (0==A367DisEst) && ( Gx_BScreen == 0 ) )
      {
         A367DisEst = (byte)(0) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A365DisDes)==0) && ( Gx_BScreen == 0 ) )
      {
         A365DisDes = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A757PriCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A757PriCod = "1" ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A7739DisExp)==0) && ( Gx_BScreen == 0 ) )
      {
         A7739DisExp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV7Codigo = ((GXutil.strcmp(A757PriCod, "0")==0) ? "020200" : "021200") ;
      }
   }

   public void load1S034( )
   {
      /* Using cursor BC01S042 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A2310DisCliDes = BC01S042_A2310DisCliDes[0] ;
         A2009DisTipDis = BC01S042_A2009DisTipDis[0] ;
         n2009DisTipDis = BC01S042_n2009DisTipDis[0] ;
         A337DisArtDsc = BC01S042_A337DisArtDsc[0] ;
         A340DisArtMat = BC01S042_A340DisArtMat[0] ;
         A2835DisPle2 = BC01S042_A2835DisPle2[0] ;
         A339DisArtLar = BC01S042_A339DisArtLar[0] ;
         A351DisArtSua = BC01S042_A351DisArtSua[0] ;
         A333DisArtAca = BC01S042_A333DisArtAca[0] ;
         A343DisArtPle = BC01S042_A343DisArtPle[0] ;
         A352DisArtTip = BC01S042_A352DisArtTip[0] ;
         A338DisArtEnc = BC01S042_A338DisArtEnc[0] ;
         A336DisArtCor = BC01S042_A336DisArtCor[0] ;
         A353DisArtTr1 = BC01S042_A353DisArtTr1[0] ;
         A354DisArtTr2 = BC01S042_A354DisArtTr2[0] ;
         A355DisArtTr3 = BC01S042_A355DisArtTr3[0] ;
         A344DisArtPt1 = BC01S042_A344DisArtPt1[0] ;
         A345DisArtPt2 = BC01S042_A345DisArtPt2[0] ;
         A346DisArtPt3 = BC01S042_A346DisArtPt3[0] ;
         A350DisArtRdt = BC01S042_A350DisArtRdt[0] ;
         A359DisArtUrg = BC01S042_A359DisArtUrg[0] ;
         A356DisArtUr1 = BC01S042_A356DisArtUr1[0] ;
         A357DisArtUr2 = BC01S042_A357DisArtUr2[0] ;
         A358DisArtUr3 = BC01S042_A358DisArtUr3[0] ;
         A347DisArtPu1 = BC01S042_A347DisArtPu1[0] ;
         A348DisArtPu2 = BC01S042_A348DisArtPu2[0] ;
         A349DisArtPu3 = BC01S042_A349DisArtPu3[0] ;
         n349DisArtPu3 = BC01S042_n349DisArtPu3[0] ;
         A342DisArtPes = BC01S042_A342DisArtPes[0] ;
         A1225DisGraCru = BC01S042_A1225DisGraCru[0] ;
         A334DisArtAnh = BC01S042_A334DisArtAnh[0] ;
         A1231DisArtAn1 = BC01S042_A1231DisArtAn1[0] ;
         A1232DisArtAcb = BC01S042_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = BC01S042_A1233DisArtAc2[0] ;
         A1197DisEncCom = BC01S042_A1197DisEncCom[0] ;
         A1198DisEncAnh = BC01S042_A1198DisEncAnh[0] ;
         A3127DisNumCor = BC01S042_A3127DisNumCor[0] ;
         A3128DisAncSal1 = BC01S042_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = BC01S042_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = BC01S042_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = BC01S042_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = BC01S042_A3132DisGraCru2[0] ;
         A1906DisGraAca = BC01S042_A1906DisGraAca[0] ;
         A1908DisRdoA = BC01S042_A1908DisRdoA[0] ;
         A1907DisRdoN = BC01S042_A1907DisRdoN[0] ;
         A5349DisObsGrm = BC01S042_A5349DisObsGrm[0] ;
         A5350DisObsAnc = BC01S042_A5350DisObsAnc[0] ;
         A9786DisItem5 = BC01S042_A9786DisItem5[0] ;
         A392DisUniMed = BC01S042_A392DisUniMed[0] ;
         A407EmprNom = BC01S042_A407EmprNom[0] ;
         n407EmprNom = BC01S042_n407EmprNom[0] ;
         A757PriCod = BC01S042_A757PriCod[0] ;
         A4813DisEncCli = BC01S042_A4813DisEncCli[0] ;
         A279CliNom = BC01S042_A279CliNom[0] ;
         A369DisFec = BC01S042_A369DisFec[0] ;
         A370DisFecCli = BC01S042_A370DisFecCli[0] ;
         A371DisFecEnt = BC01S042_A371DisFecEnt[0] ;
         A335DisArtCod = BC01S042_A335DisArtCod[0] ;
         A362DisColNom = BC01S042_A362DisColNom[0] ;
         n362DisColNom = BC01S042_n362DisColNom[0] ;
         A363DisColNum = BC01S042_A363DisColNum[0] ;
         n363DisColNum = BC01S042_n363DisColNum[0] ;
         A367DisEst = BC01S042_A367DisEst[0] ;
         A365DisDes = BC01S042_A365DisDes[0] ;
         A13987DisArtDsc2 = BC01S042_A13987DisArtDsc2[0] ;
         A10888Dsc_Idtx = BC01S042_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = BC01S042_n10888Dsc_Idtx[0] ;
         A11661DisOrdComp = BC01S042_A11661DisOrdComp[0] ;
         A12327RevenNm = BC01S042_A12327RevenNm[0] ;
         n12327RevenNm = BC01S042_n12327RevenNm[0] ;
         A11660MarcaDsc = BC01S042_A11660MarcaDsc[0] ;
         n11660MarcaDsc = BC01S042_n11660MarcaDsc[0] ;
         A12765DisPriorid = BC01S042_A12765DisPriorid[0] ;
         A11859Nxt_modelo = BC01S042_A11859Nxt_modelo[0] ;
         A11865CpteDsc = BC01S042_A11865CpteDsc[0] ;
         n11865CpteDsc = BC01S042_n11865CpteDsc[0] ;
         A11861Nxt_statio = BC01S042_A11861Nxt_statio[0] ;
         A11866DesaDsc = BC01S042_A11866DesaDsc[0] ;
         n11866DesaDsc = BC01S042_n11866DesaDsc[0] ;
         A11867DptoDsc = BC01S042_A11867DptoDsc[0] ;
         n11867DptoDsc = BC01S042_n11867DptoDsc[0] ;
         A11864Nxt_artcli = BC01S042_A11864Nxt_artcli[0] ;
         A7739DisExp = BC01S042_A7739DisExp[0] ;
         A252CliCod = BC01S042_A252CliCod[0] ;
         A390DisTipCol = BC01S042_A390DisTipCol[0] ;
         n390DisTipCol = BC01S042_n390DisTipCol[0] ;
         A10887Cod_Idtx = BC01S042_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = BC01S042_n10887Cod_Idtx[0] ;
         A13986DisIdtx2 = BC01S042_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = BC01S042_n13986DisIdtx2[0] ;
         A11659MarcaId = BC01S042_A11659MarcaId[0] ;
         n11659MarcaId = BC01S042_n11659MarcaId[0] ;
         A11863DptoID = BC01S042_A11863DptoID[0] ;
         n11863DptoID = BC01S042_n11863DptoID[0] ;
         A11860CpteId = BC01S042_A11860CpteId[0] ;
         n11860CpteId = BC01S042_n11860CpteId[0] ;
         A11862DesaID = BC01S042_A11862DesaID[0] ;
         n11862DesaID = BC01S042_n11862DesaID[0] ;
         A12328RevenID = BC01S042_A12328RevenID[0] ;
         n12328RevenID = BC01S042_n12328RevenID[0] ;
         zm1S034( -35) ;
      }
      pr_default.close(36);
      onLoadActions1S034( ) ;
   }

   public void onLoadActions1S034( )
   {
      GXt_char1 = A12115DisArtTipD ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
      pedido_bc.this.GXt_char1 = GXv_char4[0] ;
      A12115DisArtTipD = GXt_char1 ;
      if ( ( AV15moda21 == 1 ) && (GXutil.strcmp("", A2009DisTipDis)==0) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         A2009DisTipDis = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         n2009DisTipDis = false ;
      }
      AV7Codigo = ((GXutil.strcmp(A757PriCod, "0")==0) ? "020200" : "021200") ;
      /* Using cursor BC01S045 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         A13994E_DisCliDe = BC01S045_A13994E_DisCliDe[0] ;
         n13994E_DisCliDe = BC01S045_n13994E_DisCliDe[0] ;
      }
      else
      {
         A13994E_DisCliDe = (short)(0) ;
         n13994E_DisCliDe = false ;
      }
      pr_default.close(37);
      /* Using cursor BC01S048 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A335DisArtCod});
      if ( (pr_default.getStatus(38) != 101) )
      {
         A13995E_DisArtCo = BC01S048_A13995E_DisArtCo[0] ;
         n13995E_DisArtCo = BC01S048_n13995E_DisArtCo[0] ;
      }
      else
      {
         A13995E_DisArtCo = (short)(0) ;
         n13995E_DisArtCo = false ;
      }
      pr_default.close(38);
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         A2310DisCliDes = A252CliCod ;
      }
      GXt_char1 = A14003CliNomDes ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A2310DisCliDes, GXv_char4) ;
      pedido_bc.this.GXt_char1 = GXv_char4[0] ;
      A14003CliNomDes = GXt_char1 ;
   }

   public void checkExtendedTable1S034( )
   {
      nIsDirty_34 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01S049 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "P_CliCod:Cliente NO Existe.", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = BC01S049_A279CliNom[0] ;
      pr_default.close(39);
      /* Using cursor BC01S050 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
      if ( (pr_default.getStatus(40) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A390DisTipCol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISTIPCOL");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(40);
      /* Using cursor BC01S051 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx});
      if ( (pr_default.getStatus(41) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A10887Cod_Idtx)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INDITEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_IDTX");
            AnyError = (short)(1) ;
         }
      }
      A10888Dsc_Idtx = BC01S051_A10888Dsc_Idtx[0] ;
      n10888Dsc_Idtx = BC01S051_n10888Dsc_Idtx[0] ;
      pr_default.close(41);
      /* Using cursor BC01S052 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n13986DisIdtx2), A13986DisIdtx2});
      if ( (pr_default.getStatus(42) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A13986DisIdtx2)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TINDITEX2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISIDTX2");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(42);
      /* Using cursor BC01S053 */
      pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n11659MarcaId), A11659MarcaId});
      if ( (pr_default.getStatus(43) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11659MarcaId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MARCAS CLIENTE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MARCAID");
            AnyError = (short)(1) ;
         }
      }
      A11660MarcaDsc = BC01S053_A11660MarcaDsc[0] ;
      n11660MarcaDsc = BC01S053_n11660MarcaDsc[0] ;
      pr_default.close(43);
      /* Using cursor BC01S054 */
      pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n11863DptoID), Short.valueOf(A11863DptoID)});
      if ( (pr_default.getStatus(44) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A11863DptoID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA DEPARTAMENTOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DPTOID");
            AnyError = (short)(1) ;
         }
      }
      A11867DptoDsc = BC01S054_A11867DptoDsc[0] ;
      n11867DptoDsc = BC01S054_n11867DptoDsc[0] ;
      pr_default.close(44);
      /* Using cursor BC01S055 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n11860CpteId), Short.valueOf(A11860CpteId)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A11860CpteId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA COMPONENTES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CPTEID");
            AnyError = (short)(1) ;
         }
      }
      A11865CpteDsc = BC01S055_A11865CpteDsc[0] ;
      n11865CpteDsc = BC01S055_n11865CpteDsc[0] ;
      pr_default.close(45);
      /* Using cursor BC01S056 */
      pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n11862DesaID), Short.valueOf(A11862DesaID)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A11862DesaID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA DESAROLLOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DESAID");
            AnyError = (short)(1) ;
         }
      }
      A11866DesaDsc = BC01S056_A11866DesaDsc[0] ;
      n11866DesaDsc = BC01S056_n11866DesaDsc[0] ;
      pr_default.close(46);
      /* Using cursor BC01S057 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n12328RevenID), A12328RevenID});
      if ( (pr_default.getStatus(47) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A12328RevenID)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLA de REVENDORES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "REVENID");
            AnyError = (short)(1) ;
         }
      }
      A12327RevenNm = BC01S057_A12327RevenNm[0] ;
      n12327RevenNm = BC01S057_n12327RevenNm[0] ;
      pr_default.close(47);
      nIsDirty_34 = (short)(1) ;
      GXt_char1 = A12115DisArtTipD ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
      pedido_bc.this.GXt_char1 = GXv_char4[0] ;
      A12115DisArtTipD = GXt_char1 ;
      if ( ( GXutil.strcmp(A12115DisArtTipD, httpContext.getMessage( "Error", "")) == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "P_DisArtTip:Tipo Artículo Inexistente.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && ! ( (GXutil.strcmp("", A335DisArtCod)==0) && ( GXutil.strcmp(A335DisArtCod, O335DisArtCod) != 0 ) ) )
      {
         GXv_char4[0] = A337DisArtDsc ;
         GXv_char3[0] = A340DisArtMat ;
         GXv_char2[0] = A2835DisPle2 ;
         GXv_char7[0] = A339DisArtLar ;
         GXv_char8[0] = A351DisArtSua ;
         GXv_char9[0] = A333DisArtAca ;
         GXv_char10[0] = A343DisArtPle ;
         GXv_int11[0] = A352DisArtTip ;
         GXv_char12[0] = A338DisArtEnc ;
         GXv_char13[0] = A336DisArtCor ;
         GXv_char14[0] = A353DisArtTr1 ;
         GXv_char15[0] = A354DisArtTr2 ;
         GXv_char16[0] = A355DisArtTr3 ;
         GXv_int17[0] = A344DisArtPt1 ;
         GXv_int18[0] = A345DisArtPt2 ;
         GXv_int19[0] = A346DisArtPt3 ;
         GXv_decimal20[0] = A350DisArtRdt ;
         GXv_int6[0] = A359DisArtUrg ;
         GXv_char21[0] = A356DisArtUr1 ;
         GXv_char22[0] = A357DisArtUr2 ;
         GXv_char23[0] = A358DisArtUr3 ;
         GXv_int24[0] = A347DisArtPu1 ;
         GXv_int25[0] = A348DisArtPu2 ;
         GXv_int26[0] = A349DisArtPu3 ;
         GXv_int27[0] = A342DisArtPes ;
         GXv_int28[0] = A1225DisGraCru ;
         GXv_int29[0] = A334DisArtAnh ;
         GXv_int30[0] = A1231DisArtAn1 ;
         GXv_int31[0] = A1232DisArtAcb ;
         GXv_int32[0] = A1233DisArtAc2 ;
         GXv_int33[0] = (short)(DecimalUtil.decToDouble(A1197DisEncCom)) ;
         GXv_int34[0] = (short)(DecimalUtil.decToDouble(A1198DisEncAnh)) ;
         GXv_int35[0] = A3127DisNumCor ;
         GXv_int36[0] = A3128DisAncSal1 ;
         GXv_int37[0] = A3129DisAncSal2 ;
         GXv_int38[0] = A3130DisAncSal3 ;
         GXv_int39[0] = A3131DisGraAca2 ;
         GXv_int40[0] = A3132DisGraCru2 ;
         GXv_int41[0] = A1906DisGraAca ;
         GXv_decimal42[0] = A1908DisRdoA ;
         GXv_decimal43[0] = A1907DisRdoN ;
         GXv_char44[0] = A5349DisObsGrm ;
         GXv_char45[0] = A5350DisObsAnc ;
         GXv_char46[0] = A9786DisItem5 ;
         GXv_char47[0] = A392DisUniMed ;
         GXv_decimal48[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int49[0] = (byte)(AV10ExisteArticulo) ;
         new app.partdis3(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, GXv_char4, GXv_char3, GXv_char2, GXv_char7, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_char16, GXv_int17, GXv_int18, GXv_int19, GXv_decimal20, GXv_int6, GXv_char21, GXv_char22, GXv_char23, GXv_int24, GXv_int25, GXv_int26, GXv_int27, GXv_int28, GXv_int29, GXv_int30, GXv_int31, GXv_int32, GXv_int33, GXv_int34, GXv_int35, GXv_int36, GXv_int37, GXv_int38, GXv_int39, GXv_int40, GXv_int41, GXv_decimal42, GXv_decimal43, GXv_char44, GXv_char45, GXv_char46, GXv_char47, GXv_decimal48, GXv_int49) ;
         pedido_bc.this.A337DisArtDsc = GXv_char4[0] ;
         pedido_bc.this.A340DisArtMat = GXv_char3[0] ;
         pedido_bc.this.A2835DisPle2 = GXv_char2[0] ;
         pedido_bc.this.A339DisArtLar = GXv_char7[0] ;
         pedido_bc.this.A351DisArtSua = GXv_char8[0] ;
         pedido_bc.this.A333DisArtAca = GXv_char9[0] ;
         pedido_bc.this.A343DisArtPle = GXv_char10[0] ;
         pedido_bc.this.A352DisArtTip = GXv_int11[0] ;
         pedido_bc.this.A338DisArtEnc = GXv_char12[0] ;
         pedido_bc.this.A336DisArtCor = GXv_char13[0] ;
         pedido_bc.this.A353DisArtTr1 = GXv_char14[0] ;
         pedido_bc.this.A354DisArtTr2 = GXv_char15[0] ;
         pedido_bc.this.A355DisArtTr3 = GXv_char16[0] ;
         pedido_bc.this.A344DisArtPt1 = GXv_int17[0] ;
         pedido_bc.this.A345DisArtPt2 = GXv_int18[0] ;
         pedido_bc.this.A346DisArtPt3 = GXv_int19[0] ;
         pedido_bc.this.A350DisArtRdt = GXv_decimal20[0] ;
         pedido_bc.this.A359DisArtUrg = GXv_int6[0] ;
         pedido_bc.this.A356DisArtUr1 = GXv_char21[0] ;
         pedido_bc.this.A357DisArtUr2 = GXv_char22[0] ;
         pedido_bc.this.A358DisArtUr3 = GXv_char23[0] ;
         pedido_bc.this.A347DisArtPu1 = GXv_int24[0] ;
         pedido_bc.this.A348DisArtPu2 = GXv_int25[0] ;
         pedido_bc.this.A349DisArtPu3 = GXv_int26[0] ;
         pedido_bc.this.A342DisArtPes = GXv_int27[0] ;
         pedido_bc.this.A1225DisGraCru = GXv_int28[0] ;
         pedido_bc.this.A334DisArtAnh = GXv_int29[0] ;
         pedido_bc.this.A1231DisArtAn1 = GXv_int30[0] ;
         pedido_bc.this.A1232DisArtAcb = GXv_int31[0] ;
         pedido_bc.this.A1233DisArtAc2 = GXv_int32[0] ;
         pedido_bc.this.A1197DisEncCom = DecimalUtil.doubleToDec(GXv_int33[0]) ;
         pedido_bc.this.A1198DisEncAnh = DecimalUtil.doubleToDec(GXv_int34[0]) ;
         pedido_bc.this.A3127DisNumCor = GXv_int35[0] ;
         pedido_bc.this.A3128DisAncSal1 = GXv_int36[0] ;
         pedido_bc.this.A3129DisAncSal2 = GXv_int37[0] ;
         pedido_bc.this.A3130DisAncSal3 = GXv_int38[0] ;
         pedido_bc.this.A3131DisGraAca2 = GXv_int39[0] ;
         pedido_bc.this.A3132DisGraCru2 = GXv_int40[0] ;
         pedido_bc.this.A1906DisGraAca = GXv_int41[0] ;
         pedido_bc.this.A1908DisRdoA = GXv_decimal42[0] ;
         pedido_bc.this.A1907DisRdoN = GXv_decimal43[0] ;
         pedido_bc.this.A5349DisObsGrm = GXv_char44[0] ;
         pedido_bc.this.A5350DisObsAnc = GXv_char45[0] ;
         pedido_bc.this.A9786DisItem5 = GXv_char46[0] ;
         pedido_bc.this.A392DisUniMed = GXv_char47[0] ;
         pedido_bc.this.AV10ExisteArticulo = GXv_int49[0] ;
      }
      if ( ( AV15moda21 == 1 ) && (GXutil.strcmp("", A2009DisTipDis)==0) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         nIsDirty_34 = (short)(1) ;
         A2009DisTipDis = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         n2009DisTipDis = false ;
      }
      if ( ! ( ( GXutil.strcmp(A757PriCod, "0") == 0 ) || ( GXutil.strcmp(A757PriCod, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      AV7Codigo = ((GXutil.strcmp(A757PriCod, "0")==0) ? "020200" : "021200") ;
      /* Using cursor BC01S060 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         A13994E_DisCliDe = BC01S060_A13994E_DisCliDe[0] ;
         n13994E_DisCliDe = BC01S060_n13994E_DisCliDe[0] ;
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A13994E_DisCliDe = (short)(0) ;
         n13994E_DisCliDe = false ;
      }
      pr_default.close(48);
      /* Using cursor BC01S063 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A335DisArtCod});
      if ( (pr_default.getStatus(49) != 101) )
      {
         A13995E_DisArtCo = BC01S063_A13995E_DisArtCo[0] ;
         n13995E_DisArtCo = BC01S063_n13995E_DisArtCo[0] ;
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A13995E_DisArtCo = (short)(0) ;
         n13995E_DisArtCo = false ;
      }
      pr_default.close(49);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A13995E_DisArtCo) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "P_DisArtCod:Artculo Inexistente´.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         nIsDirty_34 = (short)(1) ;
         A2310DisCliDes = A252CliCod ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A252CliCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "P_CliCod:Cliente es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      nIsDirty_34 = (short)(1) ;
      GXt_char1 = A14003CliNomDes ;
      GXv_char47[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A2310DisCliDes, GXv_char47) ;
      pedido_bc.this.GXt_char1 = GXv_char47[0] ;
      A14003CliNomDes = GXt_char1 ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( GXutil.strcmp(A14003CliNomDes, httpContext.getMessage( "Error", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "P_DisCliDes:Cliente Destino NO Existe.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A335DisArtCod)==0) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "P_DisArtCod:Artículo requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A365DisDes, "S") == 0 ) || ( GXutil.strcmp(A365DisDes, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Desglose", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A338DisArtEnc, "S") == 0 ) || ( GXutil.strcmp(A338DisArtEnc, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Encolar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A336DisArtCor, "S") == 0 ) || ( GXutil.strcmp(A336DisArtCor, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( ( A359DisArtUrg >= 0 ) && ( A359DisArtUrg <= 9 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Urgencia", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S034( )
   {
      pr_default.close(39);
      pr_default.close(40);
      pr_default.close(41);
      pr_default.close(42);
      pr_default.close(43);
      pr_default.close(44);
      pr_default.close(45);
      pr_default.close(46);
      pr_default.close(47);
      pr_default.close(48);
      pr_default.close(49);
   }

   public void enableDisable( )
   {
   }

   public void getKey1S034( )
   {
      /* Using cursor BC01S064 */
      pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(50);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01S065 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(51) != 101) && ( GXutil.strcmp(BC01S065_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S034( 35) ;
         RcdFound34 = (short)(1) ;
         A361DisCod = BC01S065_A361DisCod[0] ;
         A2310DisCliDes = BC01S065_A2310DisCliDes[0] ;
         A2009DisTipDis = BC01S065_A2009DisTipDis[0] ;
         n2009DisTipDis = BC01S065_n2009DisTipDis[0] ;
         A337DisArtDsc = BC01S065_A337DisArtDsc[0] ;
         A340DisArtMat = BC01S065_A340DisArtMat[0] ;
         A2835DisPle2 = BC01S065_A2835DisPle2[0] ;
         A339DisArtLar = BC01S065_A339DisArtLar[0] ;
         A351DisArtSua = BC01S065_A351DisArtSua[0] ;
         A333DisArtAca = BC01S065_A333DisArtAca[0] ;
         A343DisArtPle = BC01S065_A343DisArtPle[0] ;
         A352DisArtTip = BC01S065_A352DisArtTip[0] ;
         A338DisArtEnc = BC01S065_A338DisArtEnc[0] ;
         A336DisArtCor = BC01S065_A336DisArtCor[0] ;
         A353DisArtTr1 = BC01S065_A353DisArtTr1[0] ;
         A354DisArtTr2 = BC01S065_A354DisArtTr2[0] ;
         A355DisArtTr3 = BC01S065_A355DisArtTr3[0] ;
         A344DisArtPt1 = BC01S065_A344DisArtPt1[0] ;
         A345DisArtPt2 = BC01S065_A345DisArtPt2[0] ;
         A346DisArtPt3 = BC01S065_A346DisArtPt3[0] ;
         A350DisArtRdt = BC01S065_A350DisArtRdt[0] ;
         A359DisArtUrg = BC01S065_A359DisArtUrg[0] ;
         A356DisArtUr1 = BC01S065_A356DisArtUr1[0] ;
         A357DisArtUr2 = BC01S065_A357DisArtUr2[0] ;
         A358DisArtUr3 = BC01S065_A358DisArtUr3[0] ;
         A347DisArtPu1 = BC01S065_A347DisArtPu1[0] ;
         A348DisArtPu2 = BC01S065_A348DisArtPu2[0] ;
         A349DisArtPu3 = BC01S065_A349DisArtPu3[0] ;
         n349DisArtPu3 = BC01S065_n349DisArtPu3[0] ;
         A342DisArtPes = BC01S065_A342DisArtPes[0] ;
         A1225DisGraCru = BC01S065_A1225DisGraCru[0] ;
         A334DisArtAnh = BC01S065_A334DisArtAnh[0] ;
         A1231DisArtAn1 = BC01S065_A1231DisArtAn1[0] ;
         A1232DisArtAcb = BC01S065_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = BC01S065_A1233DisArtAc2[0] ;
         A1197DisEncCom = BC01S065_A1197DisEncCom[0] ;
         A1198DisEncAnh = BC01S065_A1198DisEncAnh[0] ;
         A3127DisNumCor = BC01S065_A3127DisNumCor[0] ;
         A3128DisAncSal1 = BC01S065_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = BC01S065_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = BC01S065_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = BC01S065_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = BC01S065_A3132DisGraCru2[0] ;
         A1906DisGraAca = BC01S065_A1906DisGraAca[0] ;
         A1908DisRdoA = BC01S065_A1908DisRdoA[0] ;
         A1907DisRdoN = BC01S065_A1907DisRdoN[0] ;
         A5349DisObsGrm = BC01S065_A5349DisObsGrm[0] ;
         A5350DisObsAnc = BC01S065_A5350DisObsAnc[0] ;
         A9786DisItem5 = BC01S065_A9786DisItem5[0] ;
         A392DisUniMed = BC01S065_A392DisUniMed[0] ;
         A757PriCod = BC01S065_A757PriCod[0] ;
         A4813DisEncCli = BC01S065_A4813DisEncCli[0] ;
         A369DisFec = BC01S065_A369DisFec[0] ;
         A370DisFecCli = BC01S065_A370DisFecCli[0] ;
         A371DisFecEnt = BC01S065_A371DisFecEnt[0] ;
         A335DisArtCod = BC01S065_A335DisArtCod[0] ;
         A362DisColNom = BC01S065_A362DisColNom[0] ;
         n362DisColNom = BC01S065_n362DisColNom[0] ;
         A363DisColNum = BC01S065_A363DisColNum[0] ;
         n363DisColNum = BC01S065_n363DisColNum[0] ;
         A367DisEst = BC01S065_A367DisEst[0] ;
         A365DisDes = BC01S065_A365DisDes[0] ;
         A13987DisArtDsc2 = BC01S065_A13987DisArtDsc2[0] ;
         A11661DisOrdComp = BC01S065_A11661DisOrdComp[0] ;
         A12765DisPriorid = BC01S065_A12765DisPriorid[0] ;
         A11859Nxt_modelo = BC01S065_A11859Nxt_modelo[0] ;
         A11861Nxt_statio = BC01S065_A11861Nxt_statio[0] ;
         A11864Nxt_artcli = BC01S065_A11864Nxt_artcli[0] ;
         A7739DisExp = BC01S065_A7739DisExp[0] ;
         A252CliCod = BC01S065_A252CliCod[0] ;
         A390DisTipCol = BC01S065_A390DisTipCol[0] ;
         n390DisTipCol = BC01S065_n390DisTipCol[0] ;
         A10887Cod_Idtx = BC01S065_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = BC01S065_n10887Cod_Idtx[0] ;
         A13986DisIdtx2 = BC01S065_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = BC01S065_n13986DisIdtx2[0] ;
         A11659MarcaId = BC01S065_A11659MarcaId[0] ;
         n11659MarcaId = BC01S065_n11659MarcaId[0] ;
         A11863DptoID = BC01S065_A11863DptoID[0] ;
         n11863DptoID = BC01S065_n11863DptoID[0] ;
         A11860CpteId = BC01S065_A11860CpteId[0] ;
         n11860CpteId = BC01S065_n11860CpteId[0] ;
         A11862DesaID = BC01S065_A11862DesaID[0] ;
         n11862DesaID = BC01S065_n11862DesaID[0] ;
         A12328RevenID = BC01S065_A12328RevenID[0] ;
         n12328RevenID = BC01S065_n12328RevenID[0] ;
         O335DisArtCod = A335DisArtCod ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1S034( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1S034( ) ;
         }
         Gx_mode = sMode34 ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1S034( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
      }
      pr_default.close(51);
   }

   public void getEqualNoModal( )
   {
      getKey1S034( ) ;
      if ( RcdFound34 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_1S00( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency1S034( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S066 */
         pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(52) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(52) == 101) || ( Z2310DisCliDes != BC01S066_A2310DisCliDes[0] ) || ( GXutil.strcmp(Z2009DisTipDis, BC01S066_A2009DisTipDis[0]) != 0 ) || ( GXutil.strcmp(Z337DisArtDsc, BC01S066_A337DisArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z340DisArtMat, BC01S066_A340DisArtMat[0]) != 0 ) || ( GXutil.strcmp(Z2835DisPle2, BC01S066_A2835DisPle2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z339DisArtLar, BC01S066_A339DisArtLar[0]) != 0 ) || ( GXutil.strcmp(Z351DisArtSua, BC01S066_A351DisArtSua[0]) != 0 ) || ( GXutil.strcmp(Z333DisArtAca, BC01S066_A333DisArtAca[0]) != 0 ) || ( GXutil.strcmp(Z343DisArtPle, BC01S066_A343DisArtPle[0]) != 0 ) || ( Z352DisArtTip != BC01S066_A352DisArtTip[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z338DisArtEnc, BC01S066_A338DisArtEnc[0]) != 0 ) || ( GXutil.strcmp(Z336DisArtCor, BC01S066_A336DisArtCor[0]) != 0 ) || ( GXutil.strcmp(Z353DisArtTr1, BC01S066_A353DisArtTr1[0]) != 0 ) || ( GXutil.strcmp(Z354DisArtTr2, BC01S066_A354DisArtTr2[0]) != 0 ) || ( GXutil.strcmp(Z355DisArtTr3, BC01S066_A355DisArtTr3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z344DisArtPt1 != BC01S066_A344DisArtPt1[0] ) || ( Z345DisArtPt2 != BC01S066_A345DisArtPt2[0] ) || ( Z346DisArtPt3 != BC01S066_A346DisArtPt3[0] ) || ( DecimalUtil.compareTo(Z350DisArtRdt, BC01S066_A350DisArtRdt[0]) != 0 ) || ( Z359DisArtUrg != BC01S066_A359DisArtUrg[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z356DisArtUr1, BC01S066_A356DisArtUr1[0]) != 0 ) || ( GXutil.strcmp(Z357DisArtUr2, BC01S066_A357DisArtUr2[0]) != 0 ) || ( GXutil.strcmp(Z358DisArtUr3, BC01S066_A358DisArtUr3[0]) != 0 ) || ( Z347DisArtPu1 != BC01S066_A347DisArtPu1[0] ) || ( Z348DisArtPu2 != BC01S066_A348DisArtPu2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z349DisArtPu3 != BC01S066_A349DisArtPu3[0] ) || ( Z342DisArtPes != BC01S066_A342DisArtPes[0] ) || ( Z1225DisGraCru != BC01S066_A1225DisGraCru[0] ) || ( Z334DisArtAnh != BC01S066_A334DisArtAnh[0] ) || ( Z1231DisArtAn1 != BC01S066_A1231DisArtAn1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1232DisArtAcb != BC01S066_A1232DisArtAcb[0] ) || ( Z1233DisArtAc2 != BC01S066_A1233DisArtAc2[0] ) || ( DecimalUtil.compareTo(Z1197DisEncCom, BC01S066_A1197DisEncCom[0]) != 0 ) || ( DecimalUtil.compareTo(Z1198DisEncAnh, BC01S066_A1198DisEncAnh[0]) != 0 ) || ( Z3127DisNumCor != BC01S066_A3127DisNumCor[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3128DisAncSal1 != BC01S066_A3128DisAncSal1[0] ) || ( Z3129DisAncSal2 != BC01S066_A3129DisAncSal2[0] ) || ( Z3130DisAncSal3 != BC01S066_A3130DisAncSal3[0] ) || ( Z3131DisGraAca2 != BC01S066_A3131DisGraAca2[0] ) || ( Z3132DisGraCru2 != BC01S066_A3132DisGraCru2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1906DisGraAca != BC01S066_A1906DisGraAca[0] ) || ( DecimalUtil.compareTo(Z1908DisRdoA, BC01S066_A1908DisRdoA[0]) != 0 ) || ( DecimalUtil.compareTo(Z1907DisRdoN, BC01S066_A1907DisRdoN[0]) != 0 ) || ( GXutil.strcmp(Z5349DisObsGrm, BC01S066_A5349DisObsGrm[0]) != 0 ) || ( GXutil.strcmp(Z5350DisObsAnc, BC01S066_A5350DisObsAnc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9786DisItem5, BC01S066_A9786DisItem5[0]) != 0 ) || ( GXutil.strcmp(Z392DisUniMed, BC01S066_A392DisUniMed[0]) != 0 ) || ( GXutil.strcmp(Z757PriCod, BC01S066_A757PriCod[0]) != 0 ) || ( GXutil.strcmp(Z4813DisEncCli, BC01S066_A4813DisEncCli[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z369DisFec), GXutil.resetTime(BC01S066_A369DisFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z370DisFecCli), GXutil.resetTime(BC01S066_A370DisFecCli[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z371DisFecEnt), GXutil.resetTime(BC01S066_A371DisFecEnt[0])) ) || ( GXutil.strcmp(Z335DisArtCod, BC01S066_A335DisArtCod[0]) != 0 ) || ( GXutil.strcmp(Z362DisColNom, BC01S066_A362DisColNom[0]) != 0 ) || ( Z363DisColNum != BC01S066_A363DisColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z367DisEst != BC01S066_A367DisEst[0] ) || ( GXutil.strcmp(Z365DisDes, BC01S066_A365DisDes[0]) != 0 ) || ( GXutil.strcmp(Z13987DisArtDsc2, BC01S066_A13987DisArtDsc2[0]) != 0 ) || ( GXutil.strcmp(Z11661DisOrdComp, BC01S066_A11661DisOrdComp[0]) != 0 ) || ( Z12765DisPriorid != BC01S066_A12765DisPriorid[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11859Nxt_modelo, BC01S066_A11859Nxt_modelo[0]) != 0 ) || ( GXutil.strcmp(Z11861Nxt_statio, BC01S066_A11861Nxt_statio[0]) != 0 ) || ( GXutil.strcmp(Z11864Nxt_artcli, BC01S066_A11864Nxt_artcli[0]) != 0 ) || ( GXutil.strcmp(Z7739DisExp, BC01S066_A7739DisExp[0]) != 0 ) || ( Z252CliCod != BC01S066_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z390DisTipCol != BC01S066_A390DisTipCol[0] ) || ( GXutil.strcmp(Z10887Cod_Idtx, BC01S066_A10887Cod_Idtx[0]) != 0 ) || ( GXutil.strcmp(Z13986DisIdtx2, BC01S066_A13986DisIdtx2[0]) != 0 ) || ( GXutil.strcmp(Z11659MarcaId, BC01S066_A11659MarcaId[0]) != 0 ) || ( Z11863DptoID != BC01S066_A11863DptoID[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11860CpteId != BC01S066_A11860CpteId[0] ) || ( Z11862DesaID != BC01S066_A11862DesaID[0] ) || ( GXutil.strcmp(Z12328RevenID, BC01S066_A12328RevenID[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S034( )
   {
      beforeValidate1S034( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S034( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S034( 0) ;
         checkOptimisticConcurrency1S034( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S034( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S034( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S067 */
                  pr_default.execute(53, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A2310DisCliDes), Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, A337DisArtDsc, A340DisArtMat, A2835DisPle2, A339DisArtLar, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A353DisArtTr1, A354DisArtTr2, A355DisArtTr3, Short.valueOf(A344DisArtPt1), Short.valueOf(A345DisArtPt2), Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, A357DisArtUr2, A358DisArtUr3, Short.valueOf(A347DisArtPu1), Short.valueOf(A348DisArtPu2), Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A342DisArtPes), Short.valueOf(A1225DisGraCru), Short.valueOf(A334DisArtAnh), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A1197DisEncCom, A1198DisEncAnh, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), Short.valueOf(A1906DisGraAca), A1908DisRdoA, A1907DisRdoN, A5349DisObsGrm, A5350DisObsAnc, A9786DisItem5, A392DisUniMed, A757PriCod, A4813DisEncCli, A369DisFec, A370DisFecCli, A371DisFecEnt, A335DisArtCod, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Byte.valueOf(A367DisEst), A365DisDes, A13987DisArtDsc2, A11661DisOrdComp, Byte.valueOf(A12765DisPriorid), A11859Nxt_modelo, A11861Nxt_statio, A11864Nxt_artcli, A7739DisExp, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx, Boolean.valueOf(n13986DisIdtx2), A13986DisIdtx2, Boolean.valueOf(n11659MarcaId), A11659MarcaId, Boolean.valueOf(n11863DptoID), Short.valueOf(A11863DptoID), Boolean.valueOf(n11860CpteId), Short.valueOf(A11860CpteId), Boolean.valueOf(n11862DesaID), Short.valueOf(A11862DesaID), Boolean.valueOf(n12328RevenID), A12328RevenID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(53) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S034( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S034( ) ;
         }
         endLevel1S034( ) ;
      }
      closeExtendedTableCursors1S034( ) ;
   }

   public void update1S034( )
   {
      beforeValidate1S034( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S034( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S034( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S034( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S034( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S068 */
                  pr_default.execute(54, new Object[] {Integer.valueOf(A2310DisCliDes), Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, A337DisArtDsc, A340DisArtMat, A2835DisPle2, A339DisArtLar, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A353DisArtTr1, A354DisArtTr2, A355DisArtTr3, Short.valueOf(A344DisArtPt1), Short.valueOf(A345DisArtPt2), Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, A357DisArtUr2, A358DisArtUr3, Short.valueOf(A347DisArtPu1), Short.valueOf(A348DisArtPu2), Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A342DisArtPes), Short.valueOf(A1225DisGraCru), Short.valueOf(A334DisArtAnh), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A1197DisEncCom, A1198DisEncAnh, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), Short.valueOf(A1906DisGraAca), A1908DisRdoA, A1907DisRdoN, A5349DisObsGrm, A5350DisObsAnc, A9786DisItem5, A392DisUniMed, A757PriCod, A4813DisEncCli, A369DisFec, A370DisFecCli, A371DisFecEnt, A335DisArtCod, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Byte.valueOf(A367DisEst), A365DisDes, A13987DisArtDsc2, A11661DisOrdComp, Byte.valueOf(A12765DisPriorid), A11859Nxt_modelo, A11861Nxt_statio, A11864Nxt_artcli, A7739DisExp, Integer.valueOf(A252CliCod), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx, Boolean.valueOf(n13986DisIdtx2), A13986DisIdtx2, Boolean.valueOf(n11659MarcaId), A11659MarcaId, Boolean.valueOf(n11863DptoID), Short.valueOf(A11863DptoID), Boolean.valueOf(n11860CpteId), Short.valueOf(A11860CpteId), Boolean.valueOf(n11862DesaID), Short.valueOf(A11862DesaID), Boolean.valueOf(n12328RevenID), A12328RevenID, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(54) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S034( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S034( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S034( ) ;
      }
      closeExtendedTableCursors1S034( ) ;
   }

   public void deferredUpdate1S034( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S034( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S034( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S034( ) ;
         afterConfirm1S034( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S034( ) ;
            if ( AnyError == 0 )
            {
               scanKeyStart1S01812( ) ;
               while ( RcdFound1812 != 0 )
               {
                  getByPrimaryKey1S01812( ) ;
                  delete1S01812( ) ;
                  scanKeyNext1S01812( ) ;
               }
               scanKeyEnd1S01812( ) ;
               scanKeyStart1S037( ) ;
               while ( RcdFound37 != 0 )
               {
                  getByPrimaryKey1S037( ) ;
                  delete1S037( ) ;
                  scanKeyNext1S037( ) ;
               }
               scanKeyEnd1S037( ) ;
               scanKeyStart1S035( ) ;
               while ( RcdFound35 != 0 )
               {
                  getByPrimaryKey1S035( ) ;
                  delete1S035( ) ;
                  scanKeyNext1S035( ) ;
               }
               scanKeyEnd1S035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S069 */
                  pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
      }
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S034( ) ;
      Gx_mode = sMode34 ;
   }

   public void onDeleteControls1S034( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ! ( (GXutil.strcmp("", A335DisArtCod)==0) && ( GXutil.strcmp(A335DisArtCod, O335DisArtCod) != 0 ) ) )
         {
            GXv_char47[0] = A337DisArtDsc ;
            GXv_char46[0] = A340DisArtMat ;
            GXv_char45[0] = A2835DisPle2 ;
            GXv_char44[0] = A339DisArtLar ;
            GXv_char23[0] = A351DisArtSua ;
            GXv_char22[0] = A333DisArtAca ;
            GXv_char21[0] = A343DisArtPle ;
            GXv_int41[0] = A352DisArtTip ;
            GXv_char16[0] = A338DisArtEnc ;
            GXv_char15[0] = A336DisArtCor ;
            GXv_char14[0] = A353DisArtTr1 ;
            GXv_char13[0] = A354DisArtTr2 ;
            GXv_char12[0] = A355DisArtTr3 ;
            GXv_int40[0] = A344DisArtPt1 ;
            GXv_int39[0] = A345DisArtPt2 ;
            GXv_int38[0] = A346DisArtPt3 ;
            GXv_decimal48[0] = A350DisArtRdt ;
            GXv_int49[0] = A359DisArtUrg ;
            GXv_char10[0] = A356DisArtUr1 ;
            GXv_char9[0] = A357DisArtUr2 ;
            GXv_char8[0] = A358DisArtUr3 ;
            GXv_int37[0] = A347DisArtPu1 ;
            GXv_int36[0] = A348DisArtPu2 ;
            GXv_int35[0] = A349DisArtPu3 ;
            GXv_int34[0] = A342DisArtPes ;
            GXv_int33[0] = A1225DisGraCru ;
            GXv_int32[0] = A334DisArtAnh ;
            GXv_int31[0] = A1231DisArtAn1 ;
            GXv_int30[0] = A1232DisArtAcb ;
            GXv_int29[0] = A1233DisArtAc2 ;
            GXv_int28[0] = (short)(DecimalUtil.decToDouble(A1197DisEncCom)) ;
            GXv_int27[0] = (short)(DecimalUtil.decToDouble(A1198DisEncAnh)) ;
            GXv_int26[0] = A3127DisNumCor ;
            GXv_int25[0] = A3128DisAncSal1 ;
            GXv_int24[0] = A3129DisAncSal2 ;
            GXv_int19[0] = A3130DisAncSal3 ;
            GXv_int18[0] = A3131DisGraAca2 ;
            GXv_int17[0] = A3132DisGraCru2 ;
            GXv_int11[0] = A1906DisGraAca ;
            GXv_decimal43[0] = A1908DisRdoA ;
            GXv_decimal42[0] = A1907DisRdoN ;
            GXv_char7[0] = A5349DisObsGrm ;
            GXv_char4[0] = A5350DisObsAnc ;
            GXv_char3[0] = A9786DisItem5 ;
            GXv_char2[0] = A392DisUniMed ;
            GXv_decimal20[0] = DecimalUtil.doubleToDec(0) ;
            GXv_int6[0] = (byte)(AV10ExisteArticulo) ;
            new app.partdis3(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, GXv_char47, GXv_char46, GXv_char45, GXv_char44, GXv_char23, GXv_char22, GXv_char21, GXv_int41, GXv_char16, GXv_char15, GXv_char14, GXv_char13, GXv_char12, GXv_int40, GXv_int39, GXv_int38, GXv_decimal48, GXv_int49, GXv_char10, GXv_char9, GXv_char8, GXv_int37, GXv_int36, GXv_int35, GXv_int34, GXv_int33, GXv_int32, GXv_int31, GXv_int30, GXv_int29, GXv_int28, GXv_int27, GXv_int26, GXv_int25, GXv_int24, GXv_int19, GXv_int18, GXv_int17, GXv_int11, GXv_decimal43, GXv_decimal42, GXv_char7, GXv_char4, GXv_char3, GXv_char2, GXv_decimal20, GXv_int6) ;
            pedido_bc.this.A337DisArtDsc = GXv_char47[0] ;
            pedido_bc.this.A340DisArtMat = GXv_char46[0] ;
            pedido_bc.this.A2835DisPle2 = GXv_char45[0] ;
            pedido_bc.this.A339DisArtLar = GXv_char44[0] ;
            pedido_bc.this.A351DisArtSua = GXv_char23[0] ;
            pedido_bc.this.A333DisArtAca = GXv_char22[0] ;
            pedido_bc.this.A343DisArtPle = GXv_char21[0] ;
            pedido_bc.this.A352DisArtTip = GXv_int41[0] ;
            pedido_bc.this.A338DisArtEnc = GXv_char16[0] ;
            pedido_bc.this.A336DisArtCor = GXv_char15[0] ;
            pedido_bc.this.A353DisArtTr1 = GXv_char14[0] ;
            pedido_bc.this.A354DisArtTr2 = GXv_char13[0] ;
            pedido_bc.this.A355DisArtTr3 = GXv_char12[0] ;
            pedido_bc.this.A344DisArtPt1 = GXv_int40[0] ;
            pedido_bc.this.A345DisArtPt2 = GXv_int39[0] ;
            pedido_bc.this.A346DisArtPt3 = GXv_int38[0] ;
            pedido_bc.this.A350DisArtRdt = GXv_decimal48[0] ;
            pedido_bc.this.A359DisArtUrg = GXv_int49[0] ;
            pedido_bc.this.A356DisArtUr1 = GXv_char10[0] ;
            pedido_bc.this.A357DisArtUr2 = GXv_char9[0] ;
            pedido_bc.this.A358DisArtUr3 = GXv_char8[0] ;
            pedido_bc.this.A347DisArtPu1 = GXv_int37[0] ;
            pedido_bc.this.A348DisArtPu2 = GXv_int36[0] ;
            pedido_bc.this.A349DisArtPu3 = GXv_int35[0] ;
            pedido_bc.this.A342DisArtPes = GXv_int34[0] ;
            pedido_bc.this.A1225DisGraCru = GXv_int33[0] ;
            pedido_bc.this.A334DisArtAnh = GXv_int32[0] ;
            pedido_bc.this.A1231DisArtAn1 = GXv_int31[0] ;
            pedido_bc.this.A1232DisArtAcb = GXv_int30[0] ;
            pedido_bc.this.A1233DisArtAc2 = GXv_int29[0] ;
            pedido_bc.this.A1197DisEncCom = DecimalUtil.doubleToDec(GXv_int28[0]) ;
            pedido_bc.this.A1198DisEncAnh = DecimalUtil.doubleToDec(GXv_int27[0]) ;
            pedido_bc.this.A3127DisNumCor = GXv_int26[0] ;
            pedido_bc.this.A3128DisAncSal1 = GXv_int25[0] ;
            pedido_bc.this.A3129DisAncSal2 = GXv_int24[0] ;
            pedido_bc.this.A3130DisAncSal3 = GXv_int19[0] ;
            pedido_bc.this.A3131DisGraAca2 = GXv_int18[0] ;
            pedido_bc.this.A3132DisGraCru2 = GXv_int17[0] ;
            pedido_bc.this.A1906DisGraAca = GXv_int11[0] ;
            pedido_bc.this.A1908DisRdoA = GXv_decimal43[0] ;
            pedido_bc.this.A1907DisRdoN = GXv_decimal42[0] ;
            pedido_bc.this.A5349DisObsGrm = GXv_char7[0] ;
            pedido_bc.this.A5350DisObsAnc = GXv_char4[0] ;
            pedido_bc.this.A9786DisItem5 = GXv_char3[0] ;
            pedido_bc.this.A392DisUniMed = GXv_char2[0] ;
            pedido_bc.this.AV10ExisteArticulo = GXv_int6[0] ;
         }
         AV7Codigo = ((GXutil.strcmp(A757PriCod, "0")==0) ? "020200" : "021200") ;
         /* Using cursor BC01S072 */
         pr_default.execute(56, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            A13994E_DisCliDe = BC01S072_A13994E_DisCliDe[0] ;
            n13994E_DisCliDe = BC01S072_n13994E_DisCliDe[0] ;
         }
         else
         {
            A13994E_DisCliDe = (short)(0) ;
            n13994E_DisCliDe = false ;
         }
         pr_default.close(56);
         /* Using cursor BC01S073 */
         pr_default.execute(57, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = BC01S073_A279CliNom[0] ;
         pr_default.close(57);
         GXt_char1 = A14003CliNomDes ;
         GXv_char47[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A2310DisCliDes, GXv_char47) ;
         pedido_bc.this.GXt_char1 = GXv_char47[0] ;
         A14003CliNomDes = GXt_char1 ;
         /* Using cursor BC01S076 */
         pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A335DisArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            A13995E_DisArtCo = BC01S076_A13995E_DisArtCo[0] ;
            n13995E_DisArtCo = BC01S076_n13995E_DisArtCo[0] ;
         }
         else
         {
            A13995E_DisArtCo = (short)(0) ;
            n13995E_DisArtCo = false ;
         }
         pr_default.close(58);
         GXt_char1 = A12115DisArtTipD ;
         GXv_char47[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char47) ;
         pedido_bc.this.GXt_char1 = GXv_char47[0] ;
         A12115DisArtTipD = GXt_char1 ;
         /* Using cursor BC01S077 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx});
         A10888Dsc_Idtx = BC01S077_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = BC01S077_n10888Dsc_Idtx[0] ;
         pr_default.close(59);
         /* Using cursor BC01S078 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n12328RevenID), A12328RevenID});
         A12327RevenNm = BC01S078_A12327RevenNm[0] ;
         n12327RevenNm = BC01S078_n12327RevenNm[0] ;
         pr_default.close(60);
         /* Using cursor BC01S079 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n11659MarcaId), A11659MarcaId});
         A11660MarcaDsc = BC01S079_A11660MarcaDsc[0] ;
         n11660MarcaDsc = BC01S079_n11660MarcaDsc[0] ;
         pr_default.close(61);
         /* Using cursor BC01S080 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n11860CpteId), Short.valueOf(A11860CpteId)});
         A11865CpteDsc = BC01S080_A11865CpteDsc[0] ;
         n11865CpteDsc = BC01S080_n11865CpteDsc[0] ;
         pr_default.close(62);
         /* Using cursor BC01S081 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n11862DesaID), Short.valueOf(A11862DesaID)});
         A11866DesaDsc = BC01S081_A11866DesaDsc[0] ;
         n11866DesaDsc = BC01S081_n11866DesaDsc[0] ;
         pr_default.close(63);
         /* Using cursor BC01S082 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n11863DptoID), Short.valueOf(A11863DptoID)});
         A11867DptoDsc = BC01S082_A11867DptoDsc[0] ;
         n11867DptoDsc = BC01S082_n11867DptoDsc[0] ;
         pr_default.close(64);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01S083 */
         pr_default.execute(65, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor BC01S084 */
         pr_default.execute(66, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor BC01S085 */
         pr_default.execute(67, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor BC01S086 */
         pr_default.execute(68, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor BC01S087 */
         pr_default.execute(69, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor BC01S088 */
         pr_default.execute(70, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor BC01S089 */
         pr_default.execute(71, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor BC01S090 */
         pr_default.execute(72, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor BC01S091 */
         pr_default.execute(73, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor BC01S092 */
         pr_default.execute(74, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor BC01S093 */
         pr_default.execute(75, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
      }
   }

   public void processNestedLevel1S01812( )
   {
      nGXsfl_1812_idx = 0 ;
      while ( nGXsfl_1812_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().size() )
      {
         readRow1S01812( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound1812 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_1812 != 0 ) )
         {
            standaloneNotModal1S01812( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1S01812( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1S01812( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1S01812( ) ;
               }
            }
         }
         KeyVarsToRow1812( ((app.pedidosclientesindetalle.SdtPedido_Norma)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().elementAt(-1+nGXsfl_1812_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_1812_idx = 0 ;
         while ( nGXsfl_1812_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().size() )
         {
            readRow1S01812( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound1812 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().removeElement(nGXsfl_1812_idx);
               nGXsfl_1812_idx = (int)(nGXsfl_1812_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1S01812( ) ;
               VarsToRow1812( ((app.pedidosclientesindetalle.SdtPedido_Norma)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().elementAt(-1+nGXsfl_1812_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S01812( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1812 = (short)(0) ;
      nIsMod_1812 = (short)(0) ;
      Gxremove1812 = (byte)(0) ;
   }

   public void processNestedLevel1S035( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().size() )
      {
         readRow1S035( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound35 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_35 != 0 ) )
         {
            standaloneNotModal1S035( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1S035( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1S035( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1S035( ) ;
               }
            }
         }
         KeyVarsToRow35( ((app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().elementAt(-1+nGXsfl_35_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_35_idx = 0 ;
         while ( nGXsfl_35_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().size() )
         {
            readRow1S035( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound35 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().removeElement(nGXsfl_35_idx);
               nGXsfl_35_idx = (int)(nGXsfl_35_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1S035( ) ;
               VarsToRow35( ((app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().elementAt(-1+nGXsfl_35_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S035( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_35 = (short)(0) ;
      nIsMod_35 = (short)(0) ;
      Gxremove35 = (byte)(0) ;
   }

   public void processNestedLevel1S037( )
   {
      nGXsfl_37_idx = 0 ;
      while ( nGXsfl_37_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().size() )
      {
         readRow1S037( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound37 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_37 != 0 ) )
         {
            standaloneNotModal1S037( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1S037( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1S037( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1S037( ) ;
               }
            }
         }
         KeyVarsToRow37( ((app.pedidosclientesindetalle.SdtPedido_Defecto)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().elementAt(-1+nGXsfl_37_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_37_idx = 0 ;
         while ( nGXsfl_37_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().size() )
         {
            readRow1S037( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound37 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().removeElement(nGXsfl_37_idx);
               nGXsfl_37_idx = (int)(nGXsfl_37_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1S037( ) ;
               VarsToRow37( ((app.pedidosclientesindetalle.SdtPedido_Defecto)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().elementAt(-1+nGXsfl_37_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S037( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_37 = (short)(0) ;
      nIsMod_37 = (short)(0) ;
      Gxremove37 = (byte)(0) ;
   }

   public void processNestedLevel1S038( )
   {
      nGXsfl_38_idx = 0 ;
      while ( nGXsfl_38_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().size() )
      {
         readRow1S038( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound38 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_38 != 0 ) )
         {
            standaloneNotModal1S038( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1S038( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1S038( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1S038( ) ;
               }
            }
         }
         KeyVarsToRow38( ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_38_idx = 0 ;
         while ( nGXsfl_38_idx < bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().size() )
         {
            readRow1S038( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound38 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().removeElement(nGXsfl_38_idx);
               nGXsfl_38_idx = (int)(nGXsfl_38_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1S038( ) ;
               VarsToRow38( ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S038( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_38 = (short)(0) ;
      nIsMod_38 = (short)(0) ;
      Gxremove38 = (byte)(0) ;
   }

   public void processLevel1S034( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1S01812( ) ;
      processNestedLevel1S035( ) ;
      processNestedLevel1S037( ) ;
      processNestedLevel1S038( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      /* ' Update level parameters */
   }

   public void endLevel1S034( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(52);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1S034( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S034( )
   {
      /* Scan By routine */
      /* Using cursor BC01S094 */
      pr_default.execute(76, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A361DisCod = BC01S094_A361DisCod[0] ;
         A2310DisCliDes = BC01S094_A2310DisCliDes[0] ;
         A2009DisTipDis = BC01S094_A2009DisTipDis[0] ;
         n2009DisTipDis = BC01S094_n2009DisTipDis[0] ;
         A337DisArtDsc = BC01S094_A337DisArtDsc[0] ;
         A340DisArtMat = BC01S094_A340DisArtMat[0] ;
         A2835DisPle2 = BC01S094_A2835DisPle2[0] ;
         A339DisArtLar = BC01S094_A339DisArtLar[0] ;
         A351DisArtSua = BC01S094_A351DisArtSua[0] ;
         A333DisArtAca = BC01S094_A333DisArtAca[0] ;
         A343DisArtPle = BC01S094_A343DisArtPle[0] ;
         A352DisArtTip = BC01S094_A352DisArtTip[0] ;
         A338DisArtEnc = BC01S094_A338DisArtEnc[0] ;
         A336DisArtCor = BC01S094_A336DisArtCor[0] ;
         A353DisArtTr1 = BC01S094_A353DisArtTr1[0] ;
         A354DisArtTr2 = BC01S094_A354DisArtTr2[0] ;
         A355DisArtTr3 = BC01S094_A355DisArtTr3[0] ;
         A344DisArtPt1 = BC01S094_A344DisArtPt1[0] ;
         A345DisArtPt2 = BC01S094_A345DisArtPt2[0] ;
         A346DisArtPt3 = BC01S094_A346DisArtPt3[0] ;
         A350DisArtRdt = BC01S094_A350DisArtRdt[0] ;
         A359DisArtUrg = BC01S094_A359DisArtUrg[0] ;
         A356DisArtUr1 = BC01S094_A356DisArtUr1[0] ;
         A357DisArtUr2 = BC01S094_A357DisArtUr2[0] ;
         A358DisArtUr3 = BC01S094_A358DisArtUr3[0] ;
         A347DisArtPu1 = BC01S094_A347DisArtPu1[0] ;
         A348DisArtPu2 = BC01S094_A348DisArtPu2[0] ;
         A349DisArtPu3 = BC01S094_A349DisArtPu3[0] ;
         n349DisArtPu3 = BC01S094_n349DisArtPu3[0] ;
         A342DisArtPes = BC01S094_A342DisArtPes[0] ;
         A1225DisGraCru = BC01S094_A1225DisGraCru[0] ;
         A334DisArtAnh = BC01S094_A334DisArtAnh[0] ;
         A1231DisArtAn1 = BC01S094_A1231DisArtAn1[0] ;
         A1232DisArtAcb = BC01S094_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = BC01S094_A1233DisArtAc2[0] ;
         A1197DisEncCom = BC01S094_A1197DisEncCom[0] ;
         A1198DisEncAnh = BC01S094_A1198DisEncAnh[0] ;
         A3127DisNumCor = BC01S094_A3127DisNumCor[0] ;
         A3128DisAncSal1 = BC01S094_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = BC01S094_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = BC01S094_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = BC01S094_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = BC01S094_A3132DisGraCru2[0] ;
         A1906DisGraAca = BC01S094_A1906DisGraAca[0] ;
         A1908DisRdoA = BC01S094_A1908DisRdoA[0] ;
         A1907DisRdoN = BC01S094_A1907DisRdoN[0] ;
         A5349DisObsGrm = BC01S094_A5349DisObsGrm[0] ;
         A5350DisObsAnc = BC01S094_A5350DisObsAnc[0] ;
         A9786DisItem5 = BC01S094_A9786DisItem5[0] ;
         A392DisUniMed = BC01S094_A392DisUniMed[0] ;
         A407EmprNom = BC01S094_A407EmprNom[0] ;
         n407EmprNom = BC01S094_n407EmprNom[0] ;
         A757PriCod = BC01S094_A757PriCod[0] ;
         A4813DisEncCli = BC01S094_A4813DisEncCli[0] ;
         A279CliNom = BC01S094_A279CliNom[0] ;
         A369DisFec = BC01S094_A369DisFec[0] ;
         A370DisFecCli = BC01S094_A370DisFecCli[0] ;
         A371DisFecEnt = BC01S094_A371DisFecEnt[0] ;
         A335DisArtCod = BC01S094_A335DisArtCod[0] ;
         A362DisColNom = BC01S094_A362DisColNom[0] ;
         n362DisColNom = BC01S094_n362DisColNom[0] ;
         A363DisColNum = BC01S094_A363DisColNum[0] ;
         n363DisColNum = BC01S094_n363DisColNum[0] ;
         A367DisEst = BC01S094_A367DisEst[0] ;
         A365DisDes = BC01S094_A365DisDes[0] ;
         A13987DisArtDsc2 = BC01S094_A13987DisArtDsc2[0] ;
         A10888Dsc_Idtx = BC01S094_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = BC01S094_n10888Dsc_Idtx[0] ;
         A11661DisOrdComp = BC01S094_A11661DisOrdComp[0] ;
         A12327RevenNm = BC01S094_A12327RevenNm[0] ;
         n12327RevenNm = BC01S094_n12327RevenNm[0] ;
         A11660MarcaDsc = BC01S094_A11660MarcaDsc[0] ;
         n11660MarcaDsc = BC01S094_n11660MarcaDsc[0] ;
         A12765DisPriorid = BC01S094_A12765DisPriorid[0] ;
         A11859Nxt_modelo = BC01S094_A11859Nxt_modelo[0] ;
         A11865CpteDsc = BC01S094_A11865CpteDsc[0] ;
         n11865CpteDsc = BC01S094_n11865CpteDsc[0] ;
         A11861Nxt_statio = BC01S094_A11861Nxt_statio[0] ;
         A11866DesaDsc = BC01S094_A11866DesaDsc[0] ;
         n11866DesaDsc = BC01S094_n11866DesaDsc[0] ;
         A11867DptoDsc = BC01S094_A11867DptoDsc[0] ;
         n11867DptoDsc = BC01S094_n11867DptoDsc[0] ;
         A11864Nxt_artcli = BC01S094_A11864Nxt_artcli[0] ;
         A7739DisExp = BC01S094_A7739DisExp[0] ;
         A252CliCod = BC01S094_A252CliCod[0] ;
         A390DisTipCol = BC01S094_A390DisTipCol[0] ;
         n390DisTipCol = BC01S094_n390DisTipCol[0] ;
         A10887Cod_Idtx = BC01S094_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = BC01S094_n10887Cod_Idtx[0] ;
         A13986DisIdtx2 = BC01S094_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = BC01S094_n13986DisIdtx2[0] ;
         A11659MarcaId = BC01S094_A11659MarcaId[0] ;
         n11659MarcaId = BC01S094_n11659MarcaId[0] ;
         A11863DptoID = BC01S094_A11863DptoID[0] ;
         n11863DptoID = BC01S094_n11863DptoID[0] ;
         A11860CpteId = BC01S094_A11860CpteId[0] ;
         n11860CpteId = BC01S094_n11860CpteId[0] ;
         A11862DesaID = BC01S094_A11862DesaID[0] ;
         n11862DesaID = BC01S094_n11862DesaID[0] ;
         A12328RevenID = BC01S094_A12328RevenID[0] ;
         n12328RevenID = BC01S094_n12328RevenID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S034( )
   {
      /* Scan next routine */
      pr_default.readNext(76);
      RcdFound34 = (short)(0) ;
      scanKeyLoad1S034( ) ;
   }

   public void scanKeyLoad1S034( )
   {
      sMode34 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A361DisCod = BC01S094_A361DisCod[0] ;
         A2310DisCliDes = BC01S094_A2310DisCliDes[0] ;
         A2009DisTipDis = BC01S094_A2009DisTipDis[0] ;
         n2009DisTipDis = BC01S094_n2009DisTipDis[0] ;
         A337DisArtDsc = BC01S094_A337DisArtDsc[0] ;
         A340DisArtMat = BC01S094_A340DisArtMat[0] ;
         A2835DisPle2 = BC01S094_A2835DisPle2[0] ;
         A339DisArtLar = BC01S094_A339DisArtLar[0] ;
         A351DisArtSua = BC01S094_A351DisArtSua[0] ;
         A333DisArtAca = BC01S094_A333DisArtAca[0] ;
         A343DisArtPle = BC01S094_A343DisArtPle[0] ;
         A352DisArtTip = BC01S094_A352DisArtTip[0] ;
         A338DisArtEnc = BC01S094_A338DisArtEnc[0] ;
         A336DisArtCor = BC01S094_A336DisArtCor[0] ;
         A353DisArtTr1 = BC01S094_A353DisArtTr1[0] ;
         A354DisArtTr2 = BC01S094_A354DisArtTr2[0] ;
         A355DisArtTr3 = BC01S094_A355DisArtTr3[0] ;
         A344DisArtPt1 = BC01S094_A344DisArtPt1[0] ;
         A345DisArtPt2 = BC01S094_A345DisArtPt2[0] ;
         A346DisArtPt3 = BC01S094_A346DisArtPt3[0] ;
         A350DisArtRdt = BC01S094_A350DisArtRdt[0] ;
         A359DisArtUrg = BC01S094_A359DisArtUrg[0] ;
         A356DisArtUr1 = BC01S094_A356DisArtUr1[0] ;
         A357DisArtUr2 = BC01S094_A357DisArtUr2[0] ;
         A358DisArtUr3 = BC01S094_A358DisArtUr3[0] ;
         A347DisArtPu1 = BC01S094_A347DisArtPu1[0] ;
         A348DisArtPu2 = BC01S094_A348DisArtPu2[0] ;
         A349DisArtPu3 = BC01S094_A349DisArtPu3[0] ;
         n349DisArtPu3 = BC01S094_n349DisArtPu3[0] ;
         A342DisArtPes = BC01S094_A342DisArtPes[0] ;
         A1225DisGraCru = BC01S094_A1225DisGraCru[0] ;
         A334DisArtAnh = BC01S094_A334DisArtAnh[0] ;
         A1231DisArtAn1 = BC01S094_A1231DisArtAn1[0] ;
         A1232DisArtAcb = BC01S094_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = BC01S094_A1233DisArtAc2[0] ;
         A1197DisEncCom = BC01S094_A1197DisEncCom[0] ;
         A1198DisEncAnh = BC01S094_A1198DisEncAnh[0] ;
         A3127DisNumCor = BC01S094_A3127DisNumCor[0] ;
         A3128DisAncSal1 = BC01S094_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = BC01S094_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = BC01S094_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = BC01S094_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = BC01S094_A3132DisGraCru2[0] ;
         A1906DisGraAca = BC01S094_A1906DisGraAca[0] ;
         A1908DisRdoA = BC01S094_A1908DisRdoA[0] ;
         A1907DisRdoN = BC01S094_A1907DisRdoN[0] ;
         A5349DisObsGrm = BC01S094_A5349DisObsGrm[0] ;
         A5350DisObsAnc = BC01S094_A5350DisObsAnc[0] ;
         A9786DisItem5 = BC01S094_A9786DisItem5[0] ;
         A392DisUniMed = BC01S094_A392DisUniMed[0] ;
         A407EmprNom = BC01S094_A407EmprNom[0] ;
         n407EmprNom = BC01S094_n407EmprNom[0] ;
         A757PriCod = BC01S094_A757PriCod[0] ;
         A4813DisEncCli = BC01S094_A4813DisEncCli[0] ;
         A279CliNom = BC01S094_A279CliNom[0] ;
         A369DisFec = BC01S094_A369DisFec[0] ;
         A370DisFecCli = BC01S094_A370DisFecCli[0] ;
         A371DisFecEnt = BC01S094_A371DisFecEnt[0] ;
         A335DisArtCod = BC01S094_A335DisArtCod[0] ;
         A362DisColNom = BC01S094_A362DisColNom[0] ;
         n362DisColNom = BC01S094_n362DisColNom[0] ;
         A363DisColNum = BC01S094_A363DisColNum[0] ;
         n363DisColNum = BC01S094_n363DisColNum[0] ;
         A367DisEst = BC01S094_A367DisEst[0] ;
         A365DisDes = BC01S094_A365DisDes[0] ;
         A13987DisArtDsc2 = BC01S094_A13987DisArtDsc2[0] ;
         A10888Dsc_Idtx = BC01S094_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = BC01S094_n10888Dsc_Idtx[0] ;
         A11661DisOrdComp = BC01S094_A11661DisOrdComp[0] ;
         A12327RevenNm = BC01S094_A12327RevenNm[0] ;
         n12327RevenNm = BC01S094_n12327RevenNm[0] ;
         A11660MarcaDsc = BC01S094_A11660MarcaDsc[0] ;
         n11660MarcaDsc = BC01S094_n11660MarcaDsc[0] ;
         A12765DisPriorid = BC01S094_A12765DisPriorid[0] ;
         A11859Nxt_modelo = BC01S094_A11859Nxt_modelo[0] ;
         A11865CpteDsc = BC01S094_A11865CpteDsc[0] ;
         n11865CpteDsc = BC01S094_n11865CpteDsc[0] ;
         A11861Nxt_statio = BC01S094_A11861Nxt_statio[0] ;
         A11866DesaDsc = BC01S094_A11866DesaDsc[0] ;
         n11866DesaDsc = BC01S094_n11866DesaDsc[0] ;
         A11867DptoDsc = BC01S094_A11867DptoDsc[0] ;
         n11867DptoDsc = BC01S094_n11867DptoDsc[0] ;
         A11864Nxt_artcli = BC01S094_A11864Nxt_artcli[0] ;
         A7739DisExp = BC01S094_A7739DisExp[0] ;
         A252CliCod = BC01S094_A252CliCod[0] ;
         A390DisTipCol = BC01S094_A390DisTipCol[0] ;
         n390DisTipCol = BC01S094_n390DisTipCol[0] ;
         A10887Cod_Idtx = BC01S094_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = BC01S094_n10887Cod_Idtx[0] ;
         A13986DisIdtx2 = BC01S094_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = BC01S094_n13986DisIdtx2[0] ;
         A11659MarcaId = BC01S094_A11659MarcaId[0] ;
         n11659MarcaId = BC01S094_n11659MarcaId[0] ;
         A11863DptoID = BC01S094_A11863DptoID[0] ;
         n11863DptoID = BC01S094_n11863DptoID[0] ;
         A11860CpteId = BC01S094_A11860CpteId[0] ;
         n11860CpteId = BC01S094_n11860CpteId[0] ;
         A11862DesaID = BC01S094_A11862DesaID[0] ;
         n11862DesaID = BC01S094_n11862DesaID[0] ;
         A12328RevenID = BC01S094_A12328RevenID[0] ;
         n12328RevenID = BC01S094_n12328RevenID[0] ;
      }
      Gx_mode = sMode34 ;
   }

   public void scanKeyEnd1S034( )
   {
      pr_default.close(76);
   }

   public void afterConfirm1S034( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S034( )
   {
      /* Before Insert Rules */
      GXv_int50[0] = A361DisCod ;
      new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV7Codigo, GXv_int50) ;
      pedido_bc.this.A361DisCod = GXv_int50[0] ;
   }

   public void beforeUpdate1S034( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S034( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S034( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S034( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S034( )
   {
   }

   public void zm1S01812( int GX_JID )
   {
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         Z13214DisNormSt = A13214DisNormSt ;
         Z13215DisNormNC = A13215DisNormNC ;
      }
      if ( ( GX_JID == 49 ) || ( GX_JID == 0 ) )
      {
         Z13216DisNormDsc = A13216DisNormDsc ;
      }
      if ( GX_JID == -48 )
      {
         Z361DisCod = A361DisCod ;
         Z13214DisNormSt = A13214DisNormSt ;
         Z13215DisNormNC = A13215DisNormNC ;
         Z396EmprCod = A396EmprCod ;
         Z13213DisNormID = A13213DisNormID ;
         Z13216DisNormDsc = A13216DisNormDsc ;
      }
   }

   public void standaloneNotModal1S01812( )
   {
   }

   public void standaloneModal1S01812( )
   {
   }

   public void load1S01812( )
   {
      /* Using cursor BC01S095 */
      pr_default.execute(77, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13216DisNormDsc = BC01S095_A13216DisNormDsc[0] ;
         n13216DisNormDsc = BC01S095_n13216DisNormDsc[0] ;
         A13214DisNormSt = BC01S095_A13214DisNormSt[0] ;
         A13215DisNormNC = BC01S095_A13215DisNormNC[0] ;
         zm1S01812( -48) ;
      }
      pr_default.close(77);
      onLoadActions1S01812( ) ;
   }

   public void onLoadActions1S01812( )
   {
   }

   public void checkExtendedTable1S01812( )
   {
      nIsDirty_1812 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1S01812( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S096 */
      pr_default.execute(78, new Object[] {A396EmprCod, A13213DisNormID});
      if ( (pr_default.getStatus(78) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Normativas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISNORMID");
         AnyError = (short)(1) ;
      }
      A13216DisNormDsc = BC01S096_A13216DisNormDsc[0] ;
      n13216DisNormDsc = BC01S096_n13216DisNormDsc[0] ;
      pr_default.close(78);
      if ( (GXutil.strcmp("", A13213DisNormID)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PN_DisNormID:Código de norma es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S01812( )
   {
      pr_default.close(78);
   }

   public void enableDisable1S01812( )
   {
   }

   public void getKey1S01812( )
   {
      /* Using cursor BC01S097 */
      pr_default.execute(79, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound1812 = (short)(1) ;
      }
      else
      {
         RcdFound1812 = (short)(0) ;
      }
      pr_default.close(79);
   }

   public void getByPrimaryKey1S01812( )
   {
      /* Using cursor BC01S098 */
      pr_default.execute(80, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(80) != 101) && ( GXutil.strcmp(BC01S098_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S01812( 48) ;
         RcdFound1812 = (short)(1) ;
         initializeNonKey1S01812( ) ;
         A13214DisNormSt = BC01S098_A13214DisNormSt[0] ;
         A13215DisNormNC = BC01S098_A13215DisNormNC[0] ;
         A13213DisNormID = BC01S098_A13213DisNormID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z13213DisNormID = A13213DisNormID ;
         sMode1812 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S01812( ) ;
         load1S01812( ) ;
         Gx_mode = sMode1812 ;
      }
      else
      {
         RcdFound1812 = (short)(0) ;
         initializeNonKey1S01812( ) ;
         sMode1812 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S01812( ) ;
         Gx_mode = sMode1812 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S01812( ) ;
      }
      pr_default.close(80);
   }

   public void checkOptimisticConcurrency1S01812( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S099 */
         pr_default.execute(81, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
         if ( (pr_default.getStatus(81) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISNOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(81) == 101) || ( GXutil.strcmp(Z13214DisNormSt, BC01S099_A13214DisNormSt[0]) != 0 ) || ( GXutil.strcmp(Z13215DisNormNC, BC01S099_A13215DisNormNC[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISNOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S01812( )
   {
      beforeValidate1S01812( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S01812( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S01812( 0) ;
         checkOptimisticConcurrency1S01812( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S01812( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S01812( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0100 */
                  pr_default.execute(82, new Object[] {Integer.valueOf(A361DisCod), A13214DisNormSt, A13215DisNormNC, A396EmprCod, A13213DisNormID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
                  if ( (pr_default.getStatus(82) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S01812( ) ;
         }
         endLevel1S01812( ) ;
      }
      closeExtendedTableCursors1S01812( ) ;
   }

   public void update1S01812( )
   {
      beforeValidate1S01812( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S01812( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S01812( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S01812( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S01812( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0101 */
                  pr_default.execute(83, new Object[] {A13214DisNormSt, A13215DisNormNC, A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
                  if ( (pr_default.getStatus(83) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISNOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S01812( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1S01812( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S01812( ) ;
      }
      closeExtendedTableCursors1S01812( ) ;
   }

   public void deferredUpdate1S01812( )
   {
   }

   public void delete1S01812( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S01812( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S01812( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S01812( ) ;
         afterConfirm1S01812( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S01812( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01S0102 */
               pr_default.execute(84, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1812 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S01812( ) ;
      Gx_mode = sMode1812 ;
   }

   public void onDeleteControls1S01812( )
   {
      standaloneModal1S01812( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01S0103 */
         pr_default.execute(85, new Object[] {A396EmprCod, A13213DisNormID});
         A13216DisNormDsc = BC01S0103_A13216DisNormDsc[0] ;
         n13216DisNormDsc = BC01S0103_n13216DisNormDsc[0] ;
         pr_default.close(85);
      }
   }

   public void endLevel1S01812( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(81);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S01812( )
   {
      /* Scan By routine */
      /* Using cursor BC01S0104 */
      pr_default.execute(86, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound1812 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13216DisNormDsc = BC01S0104_A13216DisNormDsc[0] ;
         n13216DisNormDsc = BC01S0104_n13216DisNormDsc[0] ;
         A13214DisNormSt = BC01S0104_A13214DisNormSt[0] ;
         A13215DisNormNC = BC01S0104_A13215DisNormNC[0] ;
         A13213DisNormID = BC01S0104_A13213DisNormID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S01812( )
   {
      /* Scan next routine */
      pr_default.readNext(86);
      RcdFound1812 = (short)(0) ;
      scanKeyLoad1S01812( ) ;
   }

   public void scanKeyLoad1S01812( )
   {
      sMode1812 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13216DisNormDsc = BC01S0104_A13216DisNormDsc[0] ;
         n13216DisNormDsc = BC01S0104_n13216DisNormDsc[0] ;
         A13214DisNormSt = BC01S0104_A13214DisNormSt[0] ;
         A13215DisNormNC = BC01S0104_A13215DisNormNC[0] ;
         A13213DisNormID = BC01S0104_A13213DisNormID[0] ;
      }
      Gx_mode = sMode1812 ;
   }

   public void scanKeyEnd1S01812( )
   {
      pr_default.close(86);
   }

   public void afterConfirm1S01812( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S01812( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S01812( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S01812( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S01812( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S01812( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S01812( )
   {
   }

   public void send_integrity_lvl_hashes1S01812( )
   {
   }

   public void zm1S035( int GX_JID )
   {
      if ( ( GX_JID == 50 ) || ( GX_JID == 0 ) )
      {
         Z673Piezas = A673Piezas ;
         Z595Kilos = A595Kilos ;
         Z631Metros = A631Metros ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
      }
      if ( ( GX_JID == 51 ) || ( GX_JID == 0 ) )
      {
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z55AlbRReo = A55AlbRReo ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
      }
      if ( GX_JID == -50 )
      {
         Z361DisCod = A361DisCod ;
         Z673Piezas = A673Piezas ;
         Z595Kilos = A595Kilos ;
         Z631Metros = A631Metros ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z55AlbRReo = A55AlbRReo ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
      }
   }

   public void standaloneNotModal1S035( )
   {
   }

   public void standaloneModal1S035( )
   {
   }

   public void load1S035( )
   {
      /* Using cursor BC01S0105 */
      pr_default.execute(87, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A3613AlbRefDsc = BC01S0105_A3613AlbRefDsc[0] ;
         A55AlbRReo = BC01S0105_A55AlbRReo[0] ;
         A673Piezas = BC01S0105_A673Piezas[0] ;
         A595Kilos = BC01S0105_A595Kilos[0] ;
         A631Metros = BC01S0105_A631Metros[0] ;
         A58AlbRUniEnt = BC01S0105_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = BC01S0105_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01S0105_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = BC01S0105_A54AlbRPieUti[0] ;
         zm1S035( -50) ;
      }
      pr_default.close(87);
      onLoadActions1S035( ) ;
   }

   public void onLoadActions1S035( )
   {
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
   }

   public void checkExtendedTable1S035( )
   {
      nIsDirty_35 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1S035( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S0106 */
      pr_default.execute(88, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(88) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A3613AlbRefDsc = BC01S0106_A3613AlbRefDsc[0] ;
      A55AlbRReo = BC01S0106_A55AlbRReo[0] ;
      A58AlbRUniEnt = BC01S0106_A58AlbRUniEnt[0] ;
      A60AlbRUniUti = BC01S0106_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = BC01S0106_A52AlbRPieEnt[0] ;
      A54AlbRPieUti = BC01S0106_A54AlbRPieUti[0] ;
      pr_default.close(88);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_35 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      nIsDirty_35 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( (0==A44AlbRecCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PA_AlbRecCod: N Recepción es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S035( )
   {
      pr_default.close(88);
   }

   public void enableDisable1S035( )
   {
   }

   public void getKey1S035( )
   {
      /* Using cursor BC01S0107 */
      pr_default.execute(89, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(89);
   }

   public void getByPrimaryKey1S035( )
   {
      /* Using cursor BC01S0108 */
      pr_default.execute(90, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(90) != 101) && ( GXutil.strcmp(BC01S0108_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S035( 50) ;
         RcdFound35 = (short)(1) ;
         initializeNonKey1S035( ) ;
         A673Piezas = BC01S0108_A673Piezas[0] ;
         A595Kilos = BC01S0108_A595Kilos[0] ;
         A631Metros = BC01S0108_A631Metros[0] ;
         A44AlbRecCod = BC01S0108_A44AlbRecCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S035( ) ;
         load1S035( ) ;
         Gx_mode = sMode35 ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1S035( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S035( ) ;
         Gx_mode = sMode35 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S035( ) ;
      }
      pr_default.close(90);
   }

   public void checkOptimisticConcurrency1S035( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S0109 */
         pr_default.execute(91, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(91) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(91) == 101) || ( Z673Piezas != BC01S0109_A673Piezas[0] ) || ( DecimalUtil.compareTo(Z595Kilos, BC01S0109_A595Kilos[0]) != 0 ) || ( DecimalUtil.compareTo(Z631Metros, BC01S0109_A631Metros[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S035( )
   {
      beforeValidate1S035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S035( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S035( 0) ;
         checkOptimisticConcurrency1S035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S035( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0110 */
                  pr_default.execute(92, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(92) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S035( ) ;
         }
         endLevel1S035( ) ;
      }
      closeExtendedTableCursors1S035( ) ;
   }

   public void update1S035( )
   {
      beforeValidate1S035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S035( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S035( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0111 */
                  pr_default.execute(93, new Object[] {Integer.valueOf(A673Piezas), A595Kilos, A631Metros, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(93) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S035( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1S035( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S035( ) ;
      }
      closeExtendedTableCursors1S035( ) ;
   }

   public void deferredUpdate1S035( )
   {
   }

   public void delete1S035( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S035( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S035( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S035( ) ;
         afterConfirm1S035( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S035( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01S0112 */
               pr_default.execute(94, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S035( ) ;
      Gx_mode = sMode35 ;
   }

   public void onDeleteControls1S035( )
   {
      standaloneModal1S035( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01S0113 */
         pr_default.execute(95, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A3613AlbRefDsc = BC01S0113_A3613AlbRefDsc[0] ;
         A55AlbRReo = BC01S0113_A55AlbRReo[0] ;
         A58AlbRUniEnt = BC01S0113_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = BC01S0113_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01S0113_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = BC01S0113_A54AlbRPieUti[0] ;
         pr_default.close(95);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01S0114 */
         pr_default.execute(96, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIOUT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor BC01S0115 */
         pr_default.execute(97, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
      }
   }

   public void endLevel1S035( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(91);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S035( )
   {
      /* Scan By routine */
      /* Using cursor BC01S0116 */
      pr_default.execute(98, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(98) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A3613AlbRefDsc = BC01S0116_A3613AlbRefDsc[0] ;
         A55AlbRReo = BC01S0116_A55AlbRReo[0] ;
         A673Piezas = BC01S0116_A673Piezas[0] ;
         A595Kilos = BC01S0116_A595Kilos[0] ;
         A631Metros = BC01S0116_A631Metros[0] ;
         A58AlbRUniEnt = BC01S0116_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = BC01S0116_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01S0116_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = BC01S0116_A54AlbRPieUti[0] ;
         A44AlbRecCod = BC01S0116_A44AlbRecCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S035( )
   {
      /* Scan next routine */
      pr_default.readNext(98);
      RcdFound35 = (short)(0) ;
      scanKeyLoad1S035( ) ;
   }

   public void scanKeyLoad1S035( )
   {
      sMode35 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(98) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A3613AlbRefDsc = BC01S0116_A3613AlbRefDsc[0] ;
         A55AlbRReo = BC01S0116_A55AlbRReo[0] ;
         A673Piezas = BC01S0116_A673Piezas[0] ;
         A595Kilos = BC01S0116_A595Kilos[0] ;
         A631Metros = BC01S0116_A631Metros[0] ;
         A58AlbRUniEnt = BC01S0116_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = BC01S0116_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01S0116_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = BC01S0116_A54AlbRPieUti[0] ;
         A44AlbRecCod = BC01S0116_A44AlbRecCod[0] ;
      }
      Gx_mode = sMode35 ;
   }

   public void scanKeyEnd1S035( )
   {
      pr_default.close(98);
   }

   public void afterConfirm1S035( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S035( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S035( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S035( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S035( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S035( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S035( )
   {
   }

   public void send_integrity_lvl_hashes1S035( )
   {
   }

   public void zm1S037( int GX_JID )
   {
      if ( ( GX_JID == 52 ) || ( GX_JID == 0 ) )
      {
         Z319DefPor = A319DefPor ;
      }
      if ( ( GX_JID == 53 ) || ( GX_JID == 0 ) )
      {
         Z834TipDefDsc = A834TipDefDsc ;
      }
      if ( GX_JID == -52 )
      {
         Z361DisCod = A361DisCod ;
         Z319DefPor = A319DefPor ;
         Z396EmprCod = A396EmprCod ;
         Z833TipDefCod = A833TipDefCod ;
         Z834TipDefDsc = A834TipDefDsc ;
      }
   }

   public void standaloneNotModal1S037( )
   {
   }

   public void standaloneModal1S037( )
   {
   }

   public void load1S037( )
   {
      /* Using cursor BC01S0117 */
      pr_default.execute(99, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(99) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A834TipDefDsc = BC01S0117_A834TipDefDsc[0] ;
         n834TipDefDsc = BC01S0117_n834TipDefDsc[0] ;
         A319DefPor = BC01S0117_A319DefPor[0] ;
         zm1S037( -52) ;
      }
      pr_default.close(99);
      onLoadActions1S037( ) ;
   }

   public void onLoadActions1S037( )
   {
   }

   public void checkExtendedTable1S037( )
   {
      nIsDirty_37 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1S037( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S0118 */
      pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(100) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
      }
      A834TipDefDsc = BC01S0118_A834TipDefDsc[0] ;
      n834TipDefDsc = BC01S0118_n834TipDefDsc[0] ;
      pr_default.close(100);
   }

   public void closeExtendedTableCursors1S037( )
   {
      pr_default.close(100);
   }

   public void enableDisable1S037( )
   {
   }

   public void getKey1S037( )
   {
      /* Using cursor BC01S0119 */
      pr_default.execute(101, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(101) != 101) )
      {
         RcdFound37 = (short)(1) ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
      }
      pr_default.close(101);
   }

   public void getByPrimaryKey1S037( )
   {
      /* Using cursor BC01S0120 */
      pr_default.execute(102, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(102) != 101) && ( GXutil.strcmp(BC01S0120_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S037( 52) ;
         RcdFound37 = (short)(1) ;
         initializeNonKey1S037( ) ;
         A319DefPor = BC01S0120_A319DefPor[0] ;
         A833TipDefCod = BC01S0120_A833TipDefCod[0] ;
         n833TipDefCod = BC01S0120_n833TipDefCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z833TipDefCod = A833TipDefCod ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S037( ) ;
         load1S037( ) ;
         Gx_mode = sMode37 ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
         initializeNonKey1S037( ) ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S037( ) ;
         Gx_mode = sMode37 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S037( ) ;
      }
      pr_default.close(102);
   }

   public void checkOptimisticConcurrency1S037( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S0121 */
         pr_default.execute(103, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(103) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(103) == 101) || ( Z319DefPor != BC01S0121_A319DefPor[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISDEF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S037( )
   {
      beforeValidate1S037( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S037( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S037( 0) ;
         checkOptimisticConcurrency1S037( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S037( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S037( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0122 */
                  pr_default.execute(104, new Object[] {Integer.valueOf(A361DisCod), Short.valueOf(A319DefPor), A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                  if ( (pr_default.getStatus(104) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S037( ) ;
         }
         endLevel1S037( ) ;
      }
      closeExtendedTableCursors1S037( ) ;
   }

   public void update1S037( )
   {
      beforeValidate1S037( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S037( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S037( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S037( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S037( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0123 */
                  pr_default.execute(105, new Object[] {Short.valueOf(A319DefPor), A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                  if ( (pr_default.getStatus(105) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S037( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1S037( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S037( ) ;
      }
      closeExtendedTableCursors1S037( ) ;
   }

   public void deferredUpdate1S037( )
   {
   }

   public void delete1S037( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S037( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S037( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S037( ) ;
         afterConfirm1S037( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S037( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01S0124 */
               pr_default.execute(106, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode37 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S037( ) ;
      Gx_mode = sMode37 ;
   }

   public void onDeleteControls1S037( )
   {
      standaloneModal1S037( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01S0125 */
         pr_default.execute(107, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = BC01S0125_A834TipDefDsc[0] ;
         n834TipDefDsc = BC01S0125_n834TipDefDsc[0] ;
         pr_default.close(107);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01S0126 */
         pr_default.execute(108, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
      }
   }

   public void endLevel1S037( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(103);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S037( )
   {
      /* Scan By routine */
      /* Using cursor BC01S0127 */
      pr_default.execute(109, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(109) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A834TipDefDsc = BC01S0127_A834TipDefDsc[0] ;
         n834TipDefDsc = BC01S0127_n834TipDefDsc[0] ;
         A319DefPor = BC01S0127_A319DefPor[0] ;
         A833TipDefCod = BC01S0127_A833TipDefCod[0] ;
         n833TipDefCod = BC01S0127_n833TipDefCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S037( )
   {
      /* Scan next routine */
      pr_default.readNext(109);
      RcdFound37 = (short)(0) ;
      scanKeyLoad1S037( ) ;
   }

   public void scanKeyLoad1S037( )
   {
      sMode37 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(109) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A834TipDefDsc = BC01S0127_A834TipDefDsc[0] ;
         n834TipDefDsc = BC01S0127_n834TipDefDsc[0] ;
         A319DefPor = BC01S0127_A319DefPor[0] ;
         A833TipDefCod = BC01S0127_A833TipDefCod[0] ;
         n833TipDefCod = BC01S0127_n833TipDefCod[0] ;
      }
      Gx_mode = sMode37 ;
   }

   public void scanKeyEnd1S037( )
   {
      pr_default.close(109);
   }

   public void afterConfirm1S037( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S037( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S037( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S037( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S037( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S037( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S037( )
   {
   }

   public void send_integrity_lvl_hashes1S037( )
   {
   }

   public void zm1S038( int GX_JID )
   {
      if ( ( GX_JID == 54 ) || ( GX_JID == 0 ) )
      {
         Z846UltFasLin = A846UltFasLin ;
      }
      if ( ( GX_JID == 55 ) || ( GX_JID == 0 ) )
      {
         Z759ProDsc = A759ProDsc ;
      }
      if ( GX_JID == -54 )
      {
         Z361DisCod = A361DisCod ;
         Z846UltFasLin = A846UltFasLin ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal1S038( )
   {
   }

   public void standaloneModal1S038( )
   {
   }

   public void load1S038( )
   {
      /* Using cursor BC01S0128 */
      pr_default.execute(110, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(110) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A759ProDsc = BC01S0128_A759ProDsc[0] ;
         A846UltFasLin = BC01S0128_A846UltFasLin[0] ;
         zm1S038( -54) ;
      }
      pr_default.close(110);
      onLoadActions1S038( ) ;
   }

   public void onLoadActions1S038( )
   {
   }

   public void checkExtendedTable1S038( )
   {
      nIsDirty_38 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1S038( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S0129 */
      pr_default.execute(111, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(111) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = BC01S0129_A759ProDsc[0] ;
      pr_default.close(111);
      if ( (GXutil.strcmp("", A758ProCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PP_ProCod:Código proceso  es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S038( )
   {
      pr_default.close(111);
   }

   public void enableDisable1S038( )
   {
   }

   public void getKey1S038( )
   {
      /* Using cursor BC01S0130 */
      pr_default.execute(112, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(112) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(112);
   }

   public void getByPrimaryKey1S038( )
   {
      /* Using cursor BC01S0131 */
      pr_default.execute(113, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(113) != 101) && ( GXutil.strcmp(BC01S0131_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S038( 54) ;
         RcdFound38 = (short)(1) ;
         initializeNonKey1S038( ) ;
         A846UltFasLin = BC01S0131_A846UltFasLin[0] ;
         A758ProCod = BC01S0131_A758ProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S038( ) ;
         load1S038( ) ;
         Gx_mode = sMode38 ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1S038( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S038( ) ;
         Gx_mode = sMode38 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S038( ) ;
      }
      pr_default.close(113);
   }

   public void checkOptimisticConcurrency1S038( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S0132 */
         pr_default.execute(114, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(114) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(114) == 101) || ( Z846UltFasLin != BC01S0132_A846UltFasLin[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S038( )
   {
      beforeValidate1S038( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S038( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S038( 0) ;
         checkOptimisticConcurrency1S038( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S038( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S038( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0133 */
                  pr_default.execute(115, new Object[] {Integer.valueOf(A361DisCod), Short.valueOf(A846UltFasLin), A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( (pr_default.getStatus(115) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S038( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S038( ) ;
         }
         endLevel1S038( ) ;
      }
      closeExtendedTableCursors1S038( ) ;
   }

   public void update1S038( )
   {
      beforeValidate1S038( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S038( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S038( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S038( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S038( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0134 */
                  pr_default.execute(116, new Object[] {Short.valueOf(A846UltFasLin), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( (pr_default.getStatus(116) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISLIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S038( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S038( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1S038( ) ;
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S038( ) ;
      }
      closeExtendedTableCursors1S038( ) ;
   }

   public void deferredUpdate1S038( )
   {
   }

   public void delete1S038( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S038( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S038( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S038( ) ;
         afterConfirm1S038( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S038( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01S0135 */
               pr_default.execute(117, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S038( ) ;
      Gx_mode = sMode38 ;
   }

   public void onDeleteControls1S038( )
   {
      standaloneModal1S038( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01S0136 */
         pr_default.execute(118, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = BC01S0136_A759ProDsc[0] ;
         pr_default.close(118);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01S0137 */
         pr_default.execute(119, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
      }
   }

   public void processNestedLevel1S039( )
   {
      nGXsfl_39_idx = 0 ;
      while ( nGXsfl_39_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().size() )
      {
         readRow1S039( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound39 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_39 != 0 ) )
         {
            standaloneNotModal1S039( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1S039( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1S039( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1S039( ) ;
               }
            }
         }
         KeyVarsToRow39( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_39_idx = 0 ;
         while ( nGXsfl_39_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().size() )
         {
            readRow1S039( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound39 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().removeElement(nGXsfl_39_idx);
               nGXsfl_39_idx = (int)(nGXsfl_39_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1S039( ) ;
               VarsToRow39( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S039( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      Gxremove39 = (byte)(0) ;
   }

   public void processLevel1S038( )
   {
      /* Save parent mode. */
      sMode38 = Gx_mode ;
      processNestedLevel1S039( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode38 ;
      /* ' Update level parameters */
   }

   public void endLevel1S038( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(114);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S038( )
   {
      /* Scan By routine */
      /* Using cursor BC01S0138 */
      pr_default.execute(120, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(120) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A759ProDsc = BC01S0138_A759ProDsc[0] ;
         A846UltFasLin = BC01S0138_A846UltFasLin[0] ;
         A758ProCod = BC01S0138_A758ProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S038( )
   {
      /* Scan next routine */
      pr_default.readNext(120);
      RcdFound38 = (short)(0) ;
      scanKeyLoad1S038( ) ;
   }

   public void scanKeyLoad1S038( )
   {
      sMode38 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(120) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A759ProDsc = BC01S0138_A759ProDsc[0] ;
         A846UltFasLin = BC01S0138_A846UltFasLin[0] ;
         A758ProCod = BC01S0138_A758ProCod[0] ;
      }
      Gx_mode = sMode38 ;
   }

   public void scanKeyEnd1S038( )
   {
      pr_default.close(120);
   }

   public void afterConfirm1S038( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S038( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S038( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S038( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S038( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S038( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S038( )
   {
   }

   public void zm1S039( int GX_JID )
   {
      if ( ( GX_JID == 56 ) || ( GX_JID == 0 ) )
      {
         Z5376DisQuiUl = A5376DisQuiUl ;
         Z457FasCod = A457FasCod ;
      }
      if ( ( GX_JID == 57 ) || ( GX_JID == 0 ) )
      {
         Z460FasDsc = A460FasDsc ;
         Z7744FasPreObl = A7744FasPreObl ;
      }
      if ( GX_JID == -56 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z5376DisQuiUl = A5376DisQuiUl ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal1S039( )
   {
   }

   public void standaloneModal1S039( )
   {
   }

   public void load1S039( )
   {
      /* Using cursor BC01S0139 */
      pr_default.execute(121, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(121) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A460FasDsc = BC01S0139_A460FasDsc[0] ;
         A5376DisQuiUl = BC01S0139_A5376DisQuiUl[0] ;
         A7744FasPreObl = BC01S0139_A7744FasPreObl[0] ;
         n7744FasPreObl = BC01S0139_n7744FasPreObl[0] ;
         A457FasCod = BC01S0139_A457FasCod[0] ;
         zm1S039( -56) ;
      }
      pr_default.close(121);
      onLoadActions1S039( ) ;
   }

   public void onLoadActions1S039( )
   {
   }

   public void checkExtendedTable1S039( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1S039( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S0140 */
      pr_default.execute(122, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(122) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = BC01S0140_A460FasDsc[0] ;
      A7744FasPreObl = BC01S0140_A7744FasPreObl[0] ;
      n7744FasPreObl = BC01S0140_n7744FasPreObl[0] ;
      pr_default.close(122);
      if ( (0==A368DisFasLin) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PPF_DisFasLin:Línea de la fase es requerida.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A457FasCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PPF_FasCod:La fase es requerida.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S039( )
   {
      pr_default.close(122);
   }

   public void enableDisable1S039( )
   {
   }

   public void getKey1S039( )
   {
      /* Using cursor BC01S0141 */
      pr_default.execute(123, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(123) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(123);
   }

   public void getByPrimaryKey1S039( )
   {
      /* Using cursor BC01S0142 */
      pr_default.execute(124, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(124) != 101) && ( GXutil.strcmp(BC01S0142_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S039( 56) ;
         RcdFound39 = (short)(1) ;
         initializeNonKey1S039( ) ;
         A368DisFasLin = BC01S0142_A368DisFasLin[0] ;
         A5376DisQuiUl = BC01S0142_A5376DisQuiUl[0] ;
         A457FasCod = BC01S0142_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S039( ) ;
         load1S039( ) ;
         Gx_mode = sMode39 ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1S039( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S039( ) ;
         Gx_mode = sMode39 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S039( ) ;
      }
      pr_default.close(124);
   }

   public void checkOptimisticConcurrency1S039( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S0143 */
         pr_default.execute(125, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(125) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(125) == 101) || ( Z5376DisQuiUl != BC01S0143_A5376DisQuiUl[0] ) || ( GXutil.strcmp(Z457FasCod, BC01S0143_A457FasCod[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S039( )
   {
      beforeValidate1S039( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S039( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S039( 0) ;
         checkOptimisticConcurrency1S039( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S039( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S039( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0144 */
                  pr_default.execute(126, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5376DisQuiUl), A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(126) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S039( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S039( ) ;
         }
         endLevel1S039( ) ;
      }
      closeExtendedTableCursors1S039( ) ;
   }

   public void update1S039( )
   {
      beforeValidate1S039( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S039( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S039( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S039( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S039( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0145 */
                  pr_default.execute(127, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Short.valueOf(A5376DisQuiUl), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(127) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S039( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S039( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1S039( ) ;
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S039( ) ;
      }
      closeExtendedTableCursors1S039( ) ;
   }

   public void deferredUpdate1S039( )
   {
   }

   public void delete1S039( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S039( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S039( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S039( ) ;
         afterConfirm1S039( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S039( ) ;
            if ( AnyError == 0 )
            {
               scanKeyStart1S0780( ) ;
               while ( RcdFound780 != 0 )
               {
                  getByPrimaryKey1S0780( ) ;
                  delete1S0780( ) ;
                  scanKeyNext1S0780( ) ;
               }
               scanKeyEnd1S0780( ) ;
               scanKeyStart1S0517( ) ;
               while ( RcdFound517 != 0 )
               {
                  getByPrimaryKey1S0517( ) ;
                  delete1S0517( ) ;
                  scanKeyNext1S0517( ) ;
               }
               scanKeyEnd1S0517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0146 */
                  pr_default.execute(128, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
      }
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S039( ) ;
      Gx_mode = sMode39 ;
   }

   public void onDeleteControls1S039( )
   {
      standaloneModal1S039( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01S0147 */
         pr_default.execute(129, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = BC01S0147_A460FasDsc[0] ;
         A7744FasPreObl = BC01S0147_A7744FasPreObl[0] ;
         n7744FasPreObl = BC01S0147_n7744FasPreObl[0] ;
         pr_default.close(129);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01S0148 */
         pr_default.execute(130, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(130) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(130);
         /* Using cursor BC01S0149 */
         pr_default.execute(131, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(131) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(131);
         /* Using cursor BC01S0150 */
         pr_default.execute(132, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(132) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(132);
      }
   }

   public void processNestedLevel1S0780( )
   {
      nGXsfl_780_idx = 0 ;
      while ( nGXsfl_780_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().size() )
      {
         readRow1S0780( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound780 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_780 != 0 ) )
         {
            standaloneNotModal1S0780( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1S0780( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1S0780( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1S0780( ) ;
               }
            }
         }
         KeyVarsToRow780( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().elementAt(-1+nGXsfl_780_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_780_idx = 0 ;
         while ( nGXsfl_780_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().size() )
         {
            readRow1S0780( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound780 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().removeElement(nGXsfl_780_idx);
               nGXsfl_780_idx = (int)(nGXsfl_780_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1S0780( ) ;
               VarsToRow780( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().elementAt(-1+nGXsfl_780_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S0780( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_780 = (short)(0) ;
      nIsMod_780 = (short)(0) ;
      Gxremove780 = (byte)(0) ;
   }

   public void processNestedLevel1S0517( )
   {
      nGXsfl_517_idx = 0 ;
      while ( nGXsfl_517_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().size() )
      {
         readRow1S0517( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound517 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_517 != 0 ) )
         {
            standaloneNotModal1S0517( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1S0517( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1S0517( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1S0517( ) ;
               }
            }
         }
         KeyVarsToRow517( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().elementAt(-1+nGXsfl_517_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_517_idx = 0 ;
         while ( nGXsfl_517_idx < ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().size() )
         {
            readRow1S0517( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound517 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().removeElement(nGXsfl_517_idx);
               nGXsfl_517_idx = (int)(nGXsfl_517_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1S0517( ) ;
               VarsToRow517( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().elementAt(-1+nGXsfl_517_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S0517( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_517 = (short)(0) ;
      nIsMod_517 = (short)(0) ;
      Gxremove517 = (byte)(0) ;
   }

   public void processLevel1S039( )
   {
      /* Save parent mode. */
      sMode39 = Gx_mode ;
      processNestedLevel1S0780( ) ;
      processNestedLevel1S0517( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode39 ;
      /* ' Update level parameters */
   }

   public void endLevel1S039( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(125);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S039( )
   {
      /* Scan By routine */
      /* Using cursor BC01S0151 */
      pr_default.execute(133, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(133) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = BC01S0151_A368DisFasLin[0] ;
         A460FasDsc = BC01S0151_A460FasDsc[0] ;
         A5376DisQuiUl = BC01S0151_A5376DisQuiUl[0] ;
         A7744FasPreObl = BC01S0151_A7744FasPreObl[0] ;
         n7744FasPreObl = BC01S0151_n7744FasPreObl[0] ;
         A457FasCod = BC01S0151_A457FasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S039( )
   {
      /* Scan next routine */
      pr_default.readNext(133);
      RcdFound39 = (short)(0) ;
      scanKeyLoad1S039( ) ;
   }

   public void scanKeyLoad1S039( )
   {
      sMode39 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(133) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = BC01S0151_A368DisFasLin[0] ;
         A460FasDsc = BC01S0151_A460FasDsc[0] ;
         A5376DisQuiUl = BC01S0151_A5376DisQuiUl[0] ;
         A7744FasPreObl = BC01S0151_A7744FasPreObl[0] ;
         n7744FasPreObl = BC01S0151_n7744FasPreObl[0] ;
         A457FasCod = BC01S0151_A457FasCod[0] ;
      }
      Gx_mode = sMode39 ;
   }

   public void scanKeyEnd1S039( )
   {
      pr_default.close(133);
   }

   public void afterConfirm1S039( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S039( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S039( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S039( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S039( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S039( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S039( )
   {
   }

   public void zm1S0780( int GX_JID )
   {
      if ( ( GX_JID == 58 ) || ( GX_JID == 0 ) )
      {
         Z764ProForCod = A764ProForCod ;
      }
      if ( ( GX_JID == 59 ) || ( GX_JID == 0 ) )
      {
         Z766ProForDsc = A766ProForDsc ;
      }
      if ( GX_JID == -58 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z5377DisQuiLin = A5377DisQuiLin ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModal1S0780( )
   {
   }

   public void standaloneModal1S0780( )
   {
   }

   public void load1S0780( )
   {
      /* Using cursor BC01S0152 */
      pr_default.execute(134, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
      if ( (pr_default.getStatus(134) != 101) )
      {
         RcdFound780 = (short)(1) ;
         A766ProForDsc = BC01S0152_A766ProForDsc[0] ;
         A764ProForCod = BC01S0152_A764ProForCod[0] ;
         zm1S0780( -58) ;
      }
      pr_default.close(134);
      onLoadActions1S0780( ) ;
   }

   public void onLoadActions1S0780( )
   {
   }

   public void checkExtendedTable1S0780( )
   {
      nIsDirty_780 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1S0780( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S0153 */
      pr_default.execute(135, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(135) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
      }
      A766ProForDsc = BC01S0153_A766ProForDsc[0] ;
      pr_default.close(135);
      if ( (0==A5377DisQuiLin) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PPFQ_DisQuiLin:Línea del tratamiento químico es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A764ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PPFQ_ProForCod:Tratamiento químico es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S0780( )
   {
      pr_default.close(135);
   }

   public void enableDisable1S0780( )
   {
   }

   public void getKey1S0780( )
   {
      /* Using cursor BC01S0154 */
      pr_default.execute(136, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
      if ( (pr_default.getStatus(136) != 101) )
      {
         RcdFound780 = (short)(1) ;
      }
      else
      {
         RcdFound780 = (short)(0) ;
      }
      pr_default.close(136);
   }

   public void getByPrimaryKey1S0780( )
   {
      /* Using cursor BC01S0155 */
      pr_default.execute(137, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
      if ( (pr_default.getStatus(137) != 101) && ( GXutil.strcmp(BC01S0155_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S0780( 58) ;
         RcdFound780 = (short)(1) ;
         initializeNonKey1S0780( ) ;
         A5377DisQuiLin = BC01S0155_A5377DisQuiLin[0] ;
         A764ProForCod = BC01S0155_A764ProForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z5377DisQuiLin = A5377DisQuiLin ;
         sMode780 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S0780( ) ;
         load1S0780( ) ;
         Gx_mode = sMode780 ;
      }
      else
      {
         RcdFound780 = (short)(0) ;
         initializeNonKey1S0780( ) ;
         sMode780 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S0780( ) ;
         Gx_mode = sMode780 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S0780( ) ;
      }
      pr_default.close(137);
   }

   public void checkOptimisticConcurrency1S0780( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S0156 */
         pr_default.execute(138, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
         if ( (pr_default.getStatus(138) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISQUI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(138) == 101) || ( GXutil.strcmp(Z764ProForCod, BC01S0156_A764ProForCod[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISQUI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S0780( )
   {
      beforeValidate1S0780( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S0780( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S0780( 0) ;
         checkOptimisticConcurrency1S0780( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S0780( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S0780( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0157 */
                  pr_default.execute(139, new Object[] {Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A396EmprCod, A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
                  if ( (pr_default.getStatus(139) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S0780( ) ;
         }
         endLevel1S0780( ) ;
      }
      closeExtendedTableCursors1S0780( ) ;
   }

   public void update1S0780( )
   {
      beforeValidate1S0780( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S0780( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S0780( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S0780( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S0780( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0158 */
                  pr_default.execute(140, new Object[] {A764ProForCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
                  if ( (pr_default.getStatus(140) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISQUI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S0780( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1S0780( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S0780( ) ;
      }
      closeExtendedTableCursors1S0780( ) ;
   }

   public void deferredUpdate1S0780( )
   {
   }

   public void delete1S0780( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S0780( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S0780( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S0780( ) ;
         afterConfirm1S0780( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S0780( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01S0159 */
               pr_default.execute(141, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode780 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S0780( ) ;
      Gx_mode = sMode780 ;
   }

   public void onDeleteControls1S0780( )
   {
      standaloneModal1S0780( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01S0160 */
         pr_default.execute(142, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = BC01S0160_A766ProForDsc[0] ;
         pr_default.close(142);
      }
   }

   public void endLevel1S0780( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(138);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S0780( )
   {
      /* Scan By routine */
      /* Using cursor BC01S0161 */
      pr_default.execute(143, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound780 = (short)(0) ;
      if ( (pr_default.getStatus(143) != 101) )
      {
         RcdFound780 = (short)(1) ;
         A5377DisQuiLin = BC01S0161_A5377DisQuiLin[0] ;
         A766ProForDsc = BC01S0161_A766ProForDsc[0] ;
         A764ProForCod = BC01S0161_A764ProForCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S0780( )
   {
      /* Scan next routine */
      pr_default.readNext(143);
      RcdFound780 = (short)(0) ;
      scanKeyLoad1S0780( ) ;
   }

   public void scanKeyLoad1S0780( )
   {
      sMode780 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(143) != 101) )
      {
         RcdFound780 = (short)(1) ;
         A5377DisQuiLin = BC01S0161_A5377DisQuiLin[0] ;
         A766ProForDsc = BC01S0161_A766ProForDsc[0] ;
         A764ProForCod = BC01S0161_A764ProForCod[0] ;
      }
      Gx_mode = sMode780 ;
   }

   public void scanKeyEnd1S0780( )
   {
      pr_default.close(143);
   }

   public void afterConfirm1S0780( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S0780( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S0780( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S0780( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S0780( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S0780( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S0780( )
   {
   }

   public void send_integrity_lvl_hashes1S0780( )
   {
   }

   public void zm1S0517( int GX_JID )
   {
      if ( ( GX_JID == 60 ) || ( GX_JID == 0 ) )
      {
         Z12672DisParVl2 = A12672DisParVl2 ;
         Z3686DisParObs = A3686DisParObs ;
      }
      if ( ( GX_JID == 61 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -60 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z12672DisParVl2 = A12672DisParVl2 ;
         Z3686DisParObs = A3686DisParObs ;
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
      }
   }

   public void standaloneNotModal1S0517( )
   {
   }

   public void standaloneModal1S0517( )
   {
   }

   public void load1S0517( )
   {
      /* Using cursor BC01S0162 */
      pr_default.execute(144, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(144) != 101) )
      {
         RcdFound517 = (short)(1) ;
         A12672DisParVl2 = BC01S0162_A12672DisParVl2[0] ;
         A3686DisParObs = BC01S0162_A3686DisParObs[0] ;
         zm1S0517( -60) ;
      }
      pr_default.close(144);
      onLoadActions1S0517( ) ;
   }

   public void onLoadActions1S0517( )
   {
   }

   public void checkExtendedTable1S0517( )
   {
      nIsDirty_517 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1S0517( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01S0163 */
      pr_default.execute(145, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(145) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(145);
      if ( (0==A1664ParFasCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PPFP_ParFasCod:Parámetro es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A12672DisParVl2)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "PPFP_DisParVl2:Valor del parámetro es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S0517( )
   {
      pr_default.close(145);
   }

   public void enableDisable1S0517( )
   {
   }

   public void getKey1S0517( )
   {
      /* Using cursor BC01S0164 */
      pr_default.execute(146, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(146) != 101) )
      {
         RcdFound517 = (short)(1) ;
      }
      else
      {
         RcdFound517 = (short)(0) ;
      }
      pr_default.close(146);
   }

   public void getByPrimaryKey1S0517( )
   {
      /* Using cursor BC01S0165 */
      pr_default.execute(147, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(147) != 101) && ( GXutil.strcmp(BC01S0165_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S0517( 60) ;
         RcdFound517 = (short)(1) ;
         initializeNonKey1S0517( ) ;
         A12672DisParVl2 = BC01S0165_A12672DisParVl2[0] ;
         A3686DisParObs = BC01S0165_A3686DisParObs[0] ;
         A1664ParFasCod = BC01S0165_A1664ParFasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode517 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S0517( ) ;
         load1S0517( ) ;
         Gx_mode = sMode517 ;
      }
      else
      {
         RcdFound517 = (short)(0) ;
         initializeNonKey1S0517( ) ;
         sMode517 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1S0517( ) ;
         Gx_mode = sMode517 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S0517( ) ;
      }
      pr_default.close(147);
   }

   public void checkOptimisticConcurrency1S0517( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01S0166 */
         pr_default.execute(148, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(148) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(148) == 101) || ( GXutil.strcmp(Z12672DisParVl2, BC01S0166_A12672DisParVl2[0]) != 0 ) || ( GXutil.strcmp(Z3686DisParObs, BC01S0166_A3686DisParObs[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S0517( )
   {
      beforeValidate1S0517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S0517( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S0517( 0) ;
         checkOptimisticConcurrency1S0517( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S0517( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S0517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0167 */
                  pr_default.execute(149, new Object[] {Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A12672DisParVl2, A3686DisParObs, A396EmprCod, Short.valueOf(A1664ParFasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
                  if ( (pr_default.getStatus(149) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1S0517( ) ;
         }
         endLevel1S0517( ) ;
      }
      closeExtendedTableCursors1S0517( ) ;
   }

   public void update1S0517( )
   {
      beforeValidate1S0517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S0517( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S0517( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S0517( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S0517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01S0168 */
                  pr_default.execute(150, new Object[] {A12672DisParVl2, A3686DisParObs, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
                  if ( (pr_default.getStatus(150) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S0517( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char47[0] = A396EmprCod ;
                     GXv_int50[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char47, GXv_int50) ;
                     pedido_bc.this.A396EmprCod = GXv_char47[0] ;
                     pedido_bc.this.A361DisCod = GXv_int50[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1S0517( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1S0517( ) ;
      }
      closeExtendedTableCursors1S0517( ) ;
   }

   public void deferredUpdate1S0517( )
   {
   }

   public void delete1S0517( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1S0517( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S0517( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S0517( ) ;
         afterConfirm1S0517( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S0517( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01S0169 */
               pr_default.execute(151, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode517 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1S0517( ) ;
      Gx_mode = sMode517 ;
   }

   public void onDeleteControls1S0517( )
   {
      standaloneModal1S0517( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1S0517( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(148);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1S0517( )
   {
      /* Scan By routine */
      /* Using cursor BC01S0170 */
      pr_default.execute(152, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound517 = (short)(0) ;
      if ( (pr_default.getStatus(152) != 101) )
      {
         RcdFound517 = (short)(1) ;
         A12672DisParVl2 = BC01S0170_A12672DisParVl2[0] ;
         A3686DisParObs = BC01S0170_A3686DisParObs[0] ;
         A1664ParFasCod = BC01S0170_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1S0517( )
   {
      /* Scan next routine */
      pr_default.readNext(152);
      RcdFound517 = (short)(0) ;
      scanKeyLoad1S0517( ) ;
   }

   public void scanKeyLoad1S0517( )
   {
      sMode517 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(152) != 101) )
      {
         RcdFound517 = (short)(1) ;
         A12672DisParVl2 = BC01S0170_A12672DisParVl2[0] ;
         A3686DisParObs = BC01S0170_A3686DisParObs[0] ;
         A1664ParFasCod = BC01S0170_A1664ParFasCod[0] ;
      }
      Gx_mode = sMode517 ;
   }

   public void scanKeyEnd1S0517( )
   {
      pr_default.close(152);
   }

   public void afterConfirm1S0517( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S0517( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S0517( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S0517( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S0517( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S0517( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S0517( )
   {
   }

   public void send_integrity_lvl_hashes1S0517( )
   {
   }

   public void send_integrity_lvl_hashes1S039( )
   {
   }

   public void send_integrity_lvl_hashes1S038( )
   {
   }

   public void send_integrity_lvl_hashes1S034( )
   {
   }

   public void addRow1S034( )
   {
      VarsToRow34( bcpedidosclientesindetalle_Pedido) ;
   }

   public void readRow1S034( )
   {
      RowToVars34( bcpedidosclientesindetalle_Pedido, 1) ;
   }

   public void addRow1S01812( )
   {
      app.pedidosclientesindetalle.SdtPedido_Norma obj1812;
      obj1812 = new app.pedidosclientesindetalle.SdtPedido_Norma(remoteHandle);
      VarsToRow1812( obj1812) ;
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().add(obj1812, 0);
      obj1812.setgxTv_SdtPedido_Norma_Mode( "UPD" );
      obj1812.setgxTv_SdtPedido_Norma_Modified( (short)(0) );
   }

   public void readRow1S01812( )
   {
      nGXsfl_1812_idx = (int)(nGXsfl_1812_idx+1) ;
      RowToVars1812( ((app.pedidosclientesindetalle.SdtPedido_Norma)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().elementAt(-1+nGXsfl_1812_idx)), 1) ;
   }

   public void addRow1S035( )
   {
      app.pedidosclientesindetalle.SdtPedido_AlmacenTejido obj35;
      obj35 = new app.pedidosclientesindetalle.SdtPedido_AlmacenTejido(remoteHandle);
      VarsToRow35( obj35) ;
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().add(obj35, 0);
      obj35.setgxTv_SdtPedido_AlmacenTejido_Mode( "UPD" );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Modified( (short)(0) );
   }

   public void readRow1S035( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      RowToVars35( ((app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().elementAt(-1+nGXsfl_35_idx)), 1) ;
   }

   public void addRow1S037( )
   {
      app.pedidosclientesindetalle.SdtPedido_Defecto obj37;
      obj37 = new app.pedidosclientesindetalle.SdtPedido_Defecto(remoteHandle);
      VarsToRow37( obj37) ;
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().add(obj37, 0);
      obj37.setgxTv_SdtPedido_Defecto_Mode( "UPD" );
      obj37.setgxTv_SdtPedido_Defecto_Modified( (short)(0) );
   }

   public void readRow1S037( )
   {
      nGXsfl_37_idx = (int)(nGXsfl_37_idx+1) ;
      RowToVars37( ((app.pedidosclientesindetalle.SdtPedido_Defecto)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().elementAt(-1+nGXsfl_37_idx)), 1) ;
   }

   public void addRow1S038( )
   {
      app.pedidosclientesindetalle.SdtPedido_Proceso obj38;
      obj38 = new app.pedidosclientesindetalle.SdtPedido_Proceso(remoteHandle);
      VarsToRow38( obj38) ;
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().add(obj38, 0);
      obj38.setgxTv_SdtPedido_Proceso_Mode( "UPD" );
      obj38.setgxTv_SdtPedido_Proceso_Modified( (short)(0) );
   }

   public void readRow1S038( )
   {
      nGXsfl_38_idx = (int)(nGXsfl_38_idx+1) ;
      RowToVars38( ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)), 1) ;
   }

   public void addRow1S039( )
   {
      app.pedidosclientesindetalle.SdtPedido_Proceso_Fase obj39;
      obj39 = new app.pedidosclientesindetalle.SdtPedido_Proceso_Fase(remoteHandle);
      VarsToRow39( obj39) ;
      ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().add(obj39, 0);
      obj39.setgxTv_SdtPedido_Proceso_Fase_Mode( "UPD" );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Modified( (short)(0) );
   }

   public void readRow1S039( )
   {
      nGXsfl_39_idx = (int)(nGXsfl_39_idx+1) ;
      RowToVars39( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)), 1) ;
   }

   public void addRow1S0780( )
   {
      app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico obj780;
      obj780 = new app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico(remoteHandle);
      VarsToRow780( obj780) ;
      ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().add(obj780, 0);
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode( "UPD" );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified( (short)(0) );
   }

   public void readRow1S0780( )
   {
      nGXsfl_780_idx = (int)(nGXsfl_780_idx+1) ;
      RowToVars780( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().elementAt(-1+nGXsfl_780_idx)), 1) ;
   }

   public void addRow1S0517( )
   {
      app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro obj517;
      obj517 = new app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro(remoteHandle);
      VarsToRow517( obj517) ;
      ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().add(obj517, 0);
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Mode( "UPD" );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Modified( (short)(0) );
   }

   public void readRow1S0517( )
   {
      nGXsfl_517_idx = (int)(nGXsfl_517_idx+1) ;
      RowToVars517( ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().elementAt(-1+nGXsfl_517_idx)), 1) ;
   }

   public void initializeNonKey1S034( )
   {
      AV7Codigo = "" ;
      A2310DisCliDes = 0 ;
      A2009DisTipDis = "" ;
      n2009DisTipDis = false ;
      A337DisArtDsc = "" ;
      A340DisArtMat = "" ;
      A2835DisPle2 = "" ;
      A339DisArtLar = "" ;
      A351DisArtSua = "" ;
      A333DisArtAca = "" ;
      A343DisArtPle = "" ;
      A352DisArtTip = (short)(0) ;
      A338DisArtEnc = "" ;
      A336DisArtCor = "" ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A344DisArtPt1 = (short)(0) ;
      A345DisArtPt2 = (short)(0) ;
      A346DisArtPt3 = (short)(0) ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A359DisArtUrg = (byte)(0) ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A347DisArtPu1 = (short)(0) ;
      A348DisArtPu2 = (short)(0) ;
      A349DisArtPu3 = (short)(0) ;
      n349DisArtPu3 = false ;
      A342DisArtPes = (short)(0) ;
      A1225DisGraCru = (short)(0) ;
      A334DisArtAnh = (short)(0) ;
      A1231DisArtAn1 = (short)(0) ;
      A1232DisArtAcb = (short)(0) ;
      A1233DisArtAc2 = (short)(0) ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A3127DisNumCor = (short)(0) ;
      A3128DisAncSal1 = (short)(0) ;
      A3129DisAncSal2 = (short)(0) ;
      A3130DisAncSal3 = (short)(0) ;
      A3131DisGraAca2 = (short)(0) ;
      A3132DisGraCru2 = (short)(0) ;
      A1906DisGraAca = (short)(0) ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      A5349DisObsGrm = "" ;
      A5350DisObsAnc = "" ;
      A9786DisItem5 = "" ;
      A392DisUniMed = "" ;
      A12115DisArtTipD = "" ;
      A13994E_DisCliDe = (short)(0) ;
      n13994E_DisCliDe = false ;
      A13995E_DisArtCo = (short)(0) ;
      n13995E_DisArtCo = false ;
      A14003CliNomDes = "" ;
      A4813DisEncCli = "" ;
      A252CliCod = 0 ;
      A279CliNom = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      n362DisColNom = false ;
      A363DisColNum = 0 ;
      n363DisColNum = false ;
      A390DisTipCol = (byte)(0) ;
      n390DisTipCol = false ;
      A13987DisArtDsc2 = "" ;
      A10887Cod_Idtx = "" ;
      n10887Cod_Idtx = false ;
      A10888Dsc_Idtx = "" ;
      n10888Dsc_Idtx = false ;
      A11661DisOrdComp = "" ;
      A12328RevenID = "" ;
      n12328RevenID = false ;
      A12327RevenNm = "" ;
      n12327RevenNm = false ;
      A11659MarcaId = "" ;
      n11659MarcaId = false ;
      A11660MarcaDsc = "" ;
      n11660MarcaDsc = false ;
      A13986DisIdtx2 = "" ;
      n13986DisIdtx2 = false ;
      A12765DisPriorid = (byte)(0) ;
      A11859Nxt_modelo = "" ;
      A11860CpteId = (short)(0) ;
      n11860CpteId = false ;
      A11865CpteDsc = "" ;
      n11865CpteDsc = false ;
      A11861Nxt_statio = "" ;
      A11862DesaID = (short)(0) ;
      n11862DesaID = false ;
      A11866DesaDsc = "" ;
      n11866DesaDsc = false ;
      A11863DptoID = (short)(0) ;
      n11863DptoID = false ;
      A11867DptoDsc = "" ;
      n11867DptoDsc = false ;
      A11864Nxt_artcli = "" ;
      A757PriCod = "1" ;
      A369DisFec = GXutil.today( ) ;
      A370DisFecCli = GXutil.today( ) ;
      A367DisEst = (byte)(0) ;
      A365DisDes = httpContext.getMessage( "N", "") ;
      A7739DisExp = httpContext.getMessage( "N", "") ;
      O335DisArtCod = A335DisArtCod ;
      Z2310DisCliDes = 0 ;
      Z2009DisTipDis = "" ;
      Z337DisArtDsc = "" ;
      Z340DisArtMat = "" ;
      Z2835DisPle2 = "" ;
      Z339DisArtLar = "" ;
      Z351DisArtSua = "" ;
      Z333DisArtAca = "" ;
      Z343DisArtPle = "" ;
      Z352DisArtTip = (short)(0) ;
      Z338DisArtEnc = "" ;
      Z336DisArtCor = "" ;
      Z353DisArtTr1 = "" ;
      Z354DisArtTr2 = "" ;
      Z355DisArtTr3 = "" ;
      Z344DisArtPt1 = (short)(0) ;
      Z345DisArtPt2 = (short)(0) ;
      Z346DisArtPt3 = (short)(0) ;
      Z350DisArtRdt = DecimalUtil.ZERO ;
      Z359DisArtUrg = (byte)(0) ;
      Z356DisArtUr1 = "" ;
      Z357DisArtUr2 = "" ;
      Z358DisArtUr3 = "" ;
      Z347DisArtPu1 = (short)(0) ;
      Z348DisArtPu2 = (short)(0) ;
      Z349DisArtPu3 = (short)(0) ;
      Z342DisArtPes = (short)(0) ;
      Z1225DisGraCru = (short)(0) ;
      Z334DisArtAnh = (short)(0) ;
      Z1231DisArtAn1 = (short)(0) ;
      Z1232DisArtAcb = (short)(0) ;
      Z1233DisArtAc2 = (short)(0) ;
      Z1197DisEncCom = DecimalUtil.ZERO ;
      Z1198DisEncAnh = DecimalUtil.ZERO ;
      Z3127DisNumCor = (short)(0) ;
      Z3128DisAncSal1 = (short)(0) ;
      Z3129DisAncSal2 = (short)(0) ;
      Z3130DisAncSal3 = (short)(0) ;
      Z3131DisGraAca2 = (short)(0) ;
      Z3132DisGraCru2 = (short)(0) ;
      Z1906DisGraAca = (short)(0) ;
      Z1908DisRdoA = DecimalUtil.ZERO ;
      Z1907DisRdoN = DecimalUtil.ZERO ;
      Z5349DisObsGrm = "" ;
      Z5350DisObsAnc = "" ;
      Z9786DisItem5 = "" ;
      Z392DisUniMed = "" ;
      Z757PriCod = "" ;
      Z4813DisEncCli = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z370DisFecCli = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z362DisColNom = "" ;
      Z363DisColNum = 0 ;
      Z367DisEst = (byte)(0) ;
      Z365DisDes = "" ;
      Z13987DisArtDsc2 = "" ;
      Z11661DisOrdComp = "" ;
      Z12765DisPriorid = (byte)(0) ;
      Z11859Nxt_modelo = "" ;
      Z11861Nxt_statio = "" ;
      Z11864Nxt_artcli = "" ;
      Z7739DisExp = "" ;
      Z252CliCod = 0 ;
      Z390DisTipCol = (byte)(0) ;
      Z10887Cod_Idtx = "" ;
      Z13986DisIdtx2 = "" ;
      Z11659MarcaId = "" ;
      Z11863DptoID = (short)(0) ;
      Z11860CpteId = (short)(0) ;
      Z11862DesaID = (short)(0) ;
      Z12328RevenID = "" ;
   }

   public void initAll1S034( )
   {
      A361DisCod = 0 ;
      initializeNonKey1S034( ) ;
   }

   public void standaloneModalInsert( )
   {
      A369DisFec = i369DisFec ;
      A370DisFecCli = i370DisFecCli ;
      A367DisEst = i367DisEst ;
      A365DisDes = i365DisDes ;
      A757PriCod = i757PriCod ;
      A7739DisExp = i7739DisExp ;
   }

   public void initializeNonKey1S01812( )
   {
      A13216DisNormDsc = "" ;
      n13216DisNormDsc = false ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      Z13214DisNormSt = "" ;
      Z13215DisNormNC = "" ;
   }

   public void initAll1S01812( )
   {
      A13213DisNormID = "" ;
      initializeNonKey1S01812( ) ;
   }

   public void standaloneModalInsert1S01812( )
   {
   }

   public void initializeNonKey1S035( )
   {
      A3613AlbRefDsc = "" ;
      A55AlbRReo = "" ;
      A673Piezas = 0 ;
      A51AlbRPieDis = 0 ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A52AlbRPieEnt = 0 ;
      A54AlbRPieUti = 0 ;
      Z673Piezas = 0 ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
   }

   public void initAll1S035( )
   {
      A44AlbRecCod = 0 ;
      initializeNonKey1S035( ) ;
   }

   public void standaloneModalInsert1S035( )
   {
   }

   public void initializeNonKey1S037( )
   {
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      A319DefPor = (short)(0) ;
      Z319DefPor = (short)(0) ;
   }

   public void initAll1S037( )
   {
      A833TipDefCod = (short)(0) ;
      n833TipDefCod = false ;
      initializeNonKey1S037( ) ;
   }

   public void standaloneModalInsert1S037( )
   {
   }

   public void initializeNonKey1S038( )
   {
      A759ProDsc = "" ;
      A846UltFasLin = (short)(0) ;
      Z846UltFasLin = (short)(0) ;
   }

   public void initAll1S038( )
   {
      A758ProCod = "" ;
      initializeNonKey1S038( ) ;
   }

   public void standaloneModalInsert1S038( )
   {
   }

   public void initializeNonKey1S039( )
   {
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A5376DisQuiUl = (short)(0) ;
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      Z5376DisQuiUl = (short)(0) ;
      Z457FasCod = "" ;
   }

   public void initAll1S039( )
   {
      A368DisFasLin = (short)(0) ;
      initializeNonKey1S039( ) ;
   }

   public void standaloneModalInsert1S039( )
   {
   }

   public void initializeNonKey1S0780( )
   {
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      Z764ProForCod = "" ;
   }

   public void initAll1S0780( )
   {
      A5377DisQuiLin = (short)(0) ;
      initializeNonKey1S0780( ) ;
   }

   public void standaloneModalInsert1S0780( )
   {
   }

   public void initializeNonKey1S0517( )
   {
      A12672DisParVl2 = "" ;
      A3686DisParObs = "" ;
      Z12672DisParVl2 = "" ;
      Z3686DisParObs = "" ;
   }

   public void initAll1S0517( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKey1S0517( ) ;
   }

   public void standaloneModalInsert1S0517( )
   {
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void VarsToRow34( app.pedidosclientesindetalle.SdtPedido obj34 )
   {
      obj34.setgxTv_SdtPedido_Mode( Gx_mode );
      obj34.setgxTv_SdtPedido_Emprcod( A396EmprCod );
      obj34.setgxTv_SdtPedido_Disclides( A2310DisCliDes );
      obj34.setgxTv_SdtPedido_Distipdis( A2009DisTipDis );
      obj34.setgxTv_SdtPedido_Disartdsc( A337DisArtDsc );
      obj34.setgxTv_SdtPedido_Disartmat( A340DisArtMat );
      obj34.setgxTv_SdtPedido_Disple2( A2835DisPle2 );
      obj34.setgxTv_SdtPedido_Disartlar( A339DisArtLar );
      obj34.setgxTv_SdtPedido_Disartsua( A351DisArtSua );
      obj34.setgxTv_SdtPedido_Disartaca( A333DisArtAca );
      obj34.setgxTv_SdtPedido_Disartple( A343DisArtPle );
      obj34.setgxTv_SdtPedido_Disarttip( A352DisArtTip );
      obj34.setgxTv_SdtPedido_Disartenc( A338DisArtEnc );
      obj34.setgxTv_SdtPedido_Disartcor( A336DisArtCor );
      obj34.setgxTv_SdtPedido_Disarttr1( A353DisArtTr1 );
      obj34.setgxTv_SdtPedido_Disarttr2( A354DisArtTr2 );
      obj34.setgxTv_SdtPedido_Disarttr3( A355DisArtTr3 );
      obj34.setgxTv_SdtPedido_Disartpt1( A344DisArtPt1 );
      obj34.setgxTv_SdtPedido_Disartpt2( A345DisArtPt2 );
      obj34.setgxTv_SdtPedido_Disartpt3( A346DisArtPt3 );
      obj34.setgxTv_SdtPedido_Disartrdt( A350DisArtRdt );
      obj34.setgxTv_SdtPedido_Disarturg( A359DisArtUrg );
      obj34.setgxTv_SdtPedido_Disartur1( A356DisArtUr1 );
      obj34.setgxTv_SdtPedido_Disartur2( A357DisArtUr2 );
      obj34.setgxTv_SdtPedido_Disartur3( A358DisArtUr3 );
      obj34.setgxTv_SdtPedido_Disartpu1( A347DisArtPu1 );
      obj34.setgxTv_SdtPedido_Disartpu2( A348DisArtPu2 );
      obj34.setgxTv_SdtPedido_Disartpu3( A349DisArtPu3 );
      obj34.setgxTv_SdtPedido_Disartpes( A342DisArtPes );
      obj34.setgxTv_SdtPedido_Disgracru( A1225DisGraCru );
      obj34.setgxTv_SdtPedido_Disartanh( A334DisArtAnh );
      obj34.setgxTv_SdtPedido_Disartan1( A1231DisArtAn1 );
      obj34.setgxTv_SdtPedido_Disartacb( A1232DisArtAcb );
      obj34.setgxTv_SdtPedido_Disartac2( A1233DisArtAc2 );
      obj34.setgxTv_SdtPedido_Disenccom( A1197DisEncCom );
      obj34.setgxTv_SdtPedido_Disencanh( A1198DisEncAnh );
      obj34.setgxTv_SdtPedido_Disnumcor( A3127DisNumCor );
      obj34.setgxTv_SdtPedido_Disancsal1( A3128DisAncSal1 );
      obj34.setgxTv_SdtPedido_Disancsal2( A3129DisAncSal2 );
      obj34.setgxTv_SdtPedido_Disancsal3( A3130DisAncSal3 );
      obj34.setgxTv_SdtPedido_Disgraaca2( A3131DisGraAca2 );
      obj34.setgxTv_SdtPedido_Disgracru2( A3132DisGraCru2 );
      obj34.setgxTv_SdtPedido_Disgraaca( A1906DisGraAca );
      obj34.setgxTv_SdtPedido_Disrdoa( A1908DisRdoA );
      obj34.setgxTv_SdtPedido_Disrdon( A1907DisRdoN );
      obj34.setgxTv_SdtPedido_Disobsgrm( A5349DisObsGrm );
      obj34.setgxTv_SdtPedido_Disobsanc( A5350DisObsAnc );
      obj34.setgxTv_SdtPedido_Disitem5( A9786DisItem5 );
      obj34.setgxTv_SdtPedido_Disunimed( A392DisUniMed );
      obj34.setgxTv_SdtPedido_Disarttipd( A12115DisArtTipD );
      obj34.setgxTv_SdtPedido_E_disclides( A13994E_DisCliDe );
      obj34.setgxTv_SdtPedido_E_disartcod( A13995E_DisArtCo );
      obj34.setgxTv_SdtPedido_Clinomdes( A14003CliNomDes );
      obj34.setgxTv_SdtPedido_Emprnom( A407EmprNom );
      obj34.setgxTv_SdtPedido_Disenccli( A4813DisEncCli );
      obj34.setgxTv_SdtPedido_Clicod( A252CliCod );
      obj34.setgxTv_SdtPedido_Clinom( A279CliNom );
      obj34.setgxTv_SdtPedido_Disfecent( A371DisFecEnt );
      obj34.setgxTv_SdtPedido_Disartcod( A335DisArtCod );
      obj34.setgxTv_SdtPedido_Discolnom( A362DisColNom );
      obj34.setgxTv_SdtPedido_Discolnum( A363DisColNum );
      obj34.setgxTv_SdtPedido_Distipcol( A390DisTipCol );
      obj34.setgxTv_SdtPedido_Disartdsc2( A13987DisArtDsc2 );
      obj34.setgxTv_SdtPedido_Cod_idtx( A10887Cod_Idtx );
      obj34.setgxTv_SdtPedido_Dsc_idtx( A10888Dsc_Idtx );
      obj34.setgxTv_SdtPedido_Disordcomp( A11661DisOrdComp );
      obj34.setgxTv_SdtPedido_Revenid( A12328RevenID );
      obj34.setgxTv_SdtPedido_Revennm( A12327RevenNm );
      obj34.setgxTv_SdtPedido_Marcaid( A11659MarcaId );
      obj34.setgxTv_SdtPedido_Marcadsc( A11660MarcaDsc );
      obj34.setgxTv_SdtPedido_Disidtx2( A13986DisIdtx2 );
      obj34.setgxTv_SdtPedido_Dispriorid( A12765DisPriorid );
      obj34.setgxTv_SdtPedido_Nxt_modelo( A11859Nxt_modelo );
      obj34.setgxTv_SdtPedido_Cpteid( A11860CpteId );
      obj34.setgxTv_SdtPedido_Cptedsc( A11865CpteDsc );
      obj34.setgxTv_SdtPedido_Nxt_statio( A11861Nxt_statio );
      obj34.setgxTv_SdtPedido_Desaid( A11862DesaID );
      obj34.setgxTv_SdtPedido_Desadsc( A11866DesaDsc );
      obj34.setgxTv_SdtPedido_Dptoid( A11863DptoID );
      obj34.setgxTv_SdtPedido_Dptodsc( A11867DptoDsc );
      obj34.setgxTv_SdtPedido_Nxt_artcli( A11864Nxt_artcli );
      obj34.setgxTv_SdtPedido_Pricod( A757PriCod );
      obj34.setgxTv_SdtPedido_Disfec( A369DisFec );
      obj34.setgxTv_SdtPedido_Disfeccli( A370DisFecCli );
      obj34.setgxTv_SdtPedido_Disest( A367DisEst );
      obj34.setgxTv_SdtPedido_Disdes( A365DisDes );
      obj34.setgxTv_SdtPedido_Disexp( A7739DisExp );
      obj34.setgxTv_SdtPedido_Emprcod( A396EmprCod );
      obj34.setgxTv_SdtPedido_Discod( A361DisCod );
      obj34.setgxTv_SdtPedido_Emprcod_Z( Z396EmprCod );
      obj34.setgxTv_SdtPedido_Emprnom_Z( Z407EmprNom );
      obj34.setgxTv_SdtPedido_Pricod_Z( Z757PriCod );
      obj34.setgxTv_SdtPedido_Discod_Z( Z361DisCod );
      obj34.setgxTv_SdtPedido_Distipdis_Z( Z2009DisTipDis );
      obj34.setgxTv_SdtPedido_Disenccli_Z( Z4813DisEncCli );
      obj34.setgxTv_SdtPedido_Clicod_Z( Z252CliCod );
      obj34.setgxTv_SdtPedido_Clinom_Z( Z279CliNom );
      obj34.setgxTv_SdtPedido_Disclides_Z( Z2310DisCliDes );
      obj34.setgxTv_SdtPedido_Clinomdes_Z( Z14003CliNomDes );
      obj34.setgxTv_SdtPedido_E_disclides_Z( Z13994E_DisCliDe );
      obj34.setgxTv_SdtPedido_Disfec_Z( Z369DisFec );
      obj34.setgxTv_SdtPedido_Disfeccli_Z( Z370DisFecCli );
      obj34.setgxTv_SdtPedido_Disfecent_Z( Z371DisFecEnt );
      obj34.setgxTv_SdtPedido_Disartcod_Z( Z335DisArtCod );
      obj34.setgxTv_SdtPedido_E_disartcod_Z( Z13995E_DisArtCo );
      obj34.setgxTv_SdtPedido_Disartdsc_Z( Z337DisArtDsc );
      obj34.setgxTv_SdtPedido_Disarttip_Z( Z352DisArtTip );
      obj34.setgxTv_SdtPedido_Disarttipd_Z( Z12115DisArtTipD );
      obj34.setgxTv_SdtPedido_Disartmat_Z( Z340DisArtMat );
      obj34.setgxTv_SdtPedido_Disarttr1_Z( Z353DisArtTr1 );
      obj34.setgxTv_SdtPedido_Disartpt1_Z( Z344DisArtPt1 );
      obj34.setgxTv_SdtPedido_Disarttr2_Z( Z354DisArtTr2 );
      obj34.setgxTv_SdtPedido_Disartpt2_Z( Z345DisArtPt2 );
      obj34.setgxTv_SdtPedido_Disarttr3_Z( Z355DisArtTr3 );
      obj34.setgxTv_SdtPedido_Disartpt3_Z( Z346DisArtPt3 );
      obj34.setgxTv_SdtPedido_Disartur1_Z( Z356DisArtUr1 );
      obj34.setgxTv_SdtPedido_Disartpu1_Z( Z347DisArtPu1 );
      obj34.setgxTv_SdtPedido_Disartur2_Z( Z357DisArtUr2 );
      obj34.setgxTv_SdtPedido_Disartpu2_Z( Z348DisArtPu2 );
      obj34.setgxTv_SdtPedido_Disartur3_Z( Z358DisArtUr3 );
      obj34.setgxTv_SdtPedido_Disartpu3_Z( Z349DisArtPu3 );
      obj34.setgxTv_SdtPedido_Discolnom_Z( Z362DisColNom );
      obj34.setgxTv_SdtPedido_Discolnum_Z( Z363DisColNum );
      obj34.setgxTv_SdtPedido_Distipcol_Z( Z390DisTipCol );
      obj34.setgxTv_SdtPedido_Disest_Z( Z367DisEst );
      obj34.setgxTv_SdtPedido_Disdes_Z( Z365DisDes );
      obj34.setgxTv_SdtPedido_Disartdsc2_Z( Z13987DisArtDsc2 );
      obj34.setgxTv_SdtPedido_Disple2_Z( Z2835DisPle2 );
      obj34.setgxTv_SdtPedido_Disartlar_Z( Z339DisArtLar );
      obj34.setgxTv_SdtPedido_Disartsua_Z( Z351DisArtSua );
      obj34.setgxTv_SdtPedido_Disartaca_Z( Z333DisArtAca );
      obj34.setgxTv_SdtPedido_Disartenc_Z( Z338DisArtEnc );
      obj34.setgxTv_SdtPedido_Disartcor_Z( Z336DisArtCor );
      obj34.setgxTv_SdtPedido_Disartpes_Z( Z342DisArtPes );
      obj34.setgxTv_SdtPedido_Disartrdt_Z( Z350DisArtRdt );
      obj34.setgxTv_SdtPedido_Disarturg_Z( Z359DisArtUrg );
      obj34.setgxTv_SdtPedido_Disgracru_Z( Z1225DisGraCru );
      obj34.setgxTv_SdtPedido_Disartanh_Z( Z334DisArtAnh );
      obj34.setgxTv_SdtPedido_Disartan1_Z( Z1231DisArtAn1 );
      obj34.setgxTv_SdtPedido_Disartacb_Z( Z1232DisArtAcb );
      obj34.setgxTv_SdtPedido_Disartac2_Z( Z1233DisArtAc2 );
      obj34.setgxTv_SdtPedido_Disenccom_Z( Z1197DisEncCom );
      obj34.setgxTv_SdtPedido_Disencanh_Z( Z1198DisEncAnh );
      obj34.setgxTv_SdtPedido_Disnumcor_Z( Z3127DisNumCor );
      obj34.setgxTv_SdtPedido_Disancsal1_Z( Z3128DisAncSal1 );
      obj34.setgxTv_SdtPedido_Disancsal2_Z( Z3129DisAncSal2 );
      obj34.setgxTv_SdtPedido_Disancsal3_Z( Z3130DisAncSal3 );
      obj34.setgxTv_SdtPedido_Disgraaca2_Z( Z3131DisGraAca2 );
      obj34.setgxTv_SdtPedido_Disgracru2_Z( Z3132DisGraCru2 );
      obj34.setgxTv_SdtPedido_Disgraaca_Z( Z1906DisGraAca );
      obj34.setgxTv_SdtPedido_Disrdoa_Z( Z1908DisRdoA );
      obj34.setgxTv_SdtPedido_Disrdon_Z( Z1907DisRdoN );
      obj34.setgxTv_SdtPedido_Disobsgrm_Z( Z5349DisObsGrm );
      obj34.setgxTv_SdtPedido_Disobsanc_Z( Z5350DisObsAnc );
      obj34.setgxTv_SdtPedido_Disitem5_Z( Z9786DisItem5 );
      obj34.setgxTv_SdtPedido_Disartple_Z( Z343DisArtPle );
      obj34.setgxTv_SdtPedido_Disunimed_Z( Z392DisUniMed );
      obj34.setgxTv_SdtPedido_Cod_idtx_Z( Z10887Cod_Idtx );
      obj34.setgxTv_SdtPedido_Dsc_idtx_Z( Z10888Dsc_Idtx );
      obj34.setgxTv_SdtPedido_Disordcomp_Z( Z11661DisOrdComp );
      obj34.setgxTv_SdtPedido_Revenid_Z( Z12328RevenID );
      obj34.setgxTv_SdtPedido_Revennm_Z( Z12327RevenNm );
      obj34.setgxTv_SdtPedido_Marcaid_Z( Z11659MarcaId );
      obj34.setgxTv_SdtPedido_Marcadsc_Z( Z11660MarcaDsc );
      obj34.setgxTv_SdtPedido_Disidtx2_Z( Z13986DisIdtx2 );
      obj34.setgxTv_SdtPedido_Dispriorid_Z( Z12765DisPriorid );
      obj34.setgxTv_SdtPedido_Nxt_modelo_Z( Z11859Nxt_modelo );
      obj34.setgxTv_SdtPedido_Cpteid_Z( Z11860CpteId );
      obj34.setgxTv_SdtPedido_Cptedsc_Z( Z11865CpteDsc );
      obj34.setgxTv_SdtPedido_Nxt_statio_Z( Z11861Nxt_statio );
      obj34.setgxTv_SdtPedido_Desaid_Z( Z11862DesaID );
      obj34.setgxTv_SdtPedido_Desadsc_Z( Z11866DesaDsc );
      obj34.setgxTv_SdtPedido_Dptoid_Z( Z11863DptoID );
      obj34.setgxTv_SdtPedido_Dptodsc_Z( Z11867DptoDsc );
      obj34.setgxTv_SdtPedido_Nxt_artcli_Z( Z11864Nxt_artcli );
      obj34.setgxTv_SdtPedido_Disexp_Z( Z7739DisExp );
      obj34.setgxTv_SdtPedido_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj34.setgxTv_SdtPedido_Distipdis_N( (byte)((byte)((n2009DisTipDis)?1:0)) );
      obj34.setgxTv_SdtPedido_E_disclides_N( (byte)((byte)((n13994E_DisCliDe)?1:0)) );
      obj34.setgxTv_SdtPedido_E_disartcod_N( (byte)((byte)((n13995E_DisArtCo)?1:0)) );
      obj34.setgxTv_SdtPedido_Disartpu3_N( (byte)((byte)((n349DisArtPu3)?1:0)) );
      obj34.setgxTv_SdtPedido_Discolnom_N( (byte)((byte)((n362DisColNom)?1:0)) );
      obj34.setgxTv_SdtPedido_Discolnum_N( (byte)((byte)((n363DisColNum)?1:0)) );
      obj34.setgxTv_SdtPedido_Distipcol_N( (byte)((byte)((n390DisTipCol)?1:0)) );
      obj34.setgxTv_SdtPedido_Cod_idtx_N( (byte)((byte)((n10887Cod_Idtx)?1:0)) );
      obj34.setgxTv_SdtPedido_Dsc_idtx_N( (byte)((byte)((n10888Dsc_Idtx)?1:0)) );
      obj34.setgxTv_SdtPedido_Revenid_N( (byte)((byte)((n12328RevenID)?1:0)) );
      obj34.setgxTv_SdtPedido_Revennm_N( (byte)((byte)((n12327RevenNm)?1:0)) );
      obj34.setgxTv_SdtPedido_Marcaid_N( (byte)((byte)((n11659MarcaId)?1:0)) );
      obj34.setgxTv_SdtPedido_Marcadsc_N( (byte)((byte)((n11660MarcaDsc)?1:0)) );
      obj34.setgxTv_SdtPedido_Disidtx2_N( (byte)((byte)((n13986DisIdtx2)?1:0)) );
      obj34.setgxTv_SdtPedido_Cpteid_N( (byte)((byte)((n11860CpteId)?1:0)) );
      obj34.setgxTv_SdtPedido_Cptedsc_N( (byte)((byte)((n11865CpteDsc)?1:0)) );
      obj34.setgxTv_SdtPedido_Desaid_N( (byte)((byte)((n11862DesaID)?1:0)) );
      obj34.setgxTv_SdtPedido_Desadsc_N( (byte)((byte)((n11866DesaDsc)?1:0)) );
      obj34.setgxTv_SdtPedido_Dptoid_N( (byte)((byte)((n11863DptoID)?1:0)) );
      obj34.setgxTv_SdtPedido_Dptodsc_N( (byte)((byte)((n11867DptoDsc)?1:0)) );
      obj34.setgxTv_SdtPedido_Mode( Gx_mode );
   }

   public void KeyVarsToRow34( app.pedidosclientesindetalle.SdtPedido obj34 )
   {
      obj34.setgxTv_SdtPedido_Emprcod( A396EmprCod );
      obj34.setgxTv_SdtPedido_Discod( A361DisCod );
   }

   public void RowToVars34( app.pedidosclientesindetalle.SdtPedido obj34 ,
                            int forceLoad )
   {
      Gx_mode = obj34.getgxTv_SdtPedido_Mode() ;
      A396EmprCod = obj34.getgxTv_SdtPedido_Emprcod() ;
      A2310DisCliDes = obj34.getgxTv_SdtPedido_Disclides() ;
      A2009DisTipDis = obj34.getgxTv_SdtPedido_Distipdis() ;
      n2009DisTipDis = false ;
      A337DisArtDsc = obj34.getgxTv_SdtPedido_Disartdsc() ;
      A340DisArtMat = obj34.getgxTv_SdtPedido_Disartmat() ;
      A2835DisPle2 = obj34.getgxTv_SdtPedido_Disple2() ;
      A339DisArtLar = obj34.getgxTv_SdtPedido_Disartlar() ;
      A351DisArtSua = obj34.getgxTv_SdtPedido_Disartsua() ;
      A333DisArtAca = obj34.getgxTv_SdtPedido_Disartaca() ;
      A343DisArtPle = obj34.getgxTv_SdtPedido_Disartple() ;
      A352DisArtTip = obj34.getgxTv_SdtPedido_Disarttip() ;
      A338DisArtEnc = obj34.getgxTv_SdtPedido_Disartenc() ;
      A336DisArtCor = obj34.getgxTv_SdtPedido_Disartcor() ;
      A353DisArtTr1 = obj34.getgxTv_SdtPedido_Disarttr1() ;
      A354DisArtTr2 = obj34.getgxTv_SdtPedido_Disarttr2() ;
      A355DisArtTr3 = obj34.getgxTv_SdtPedido_Disarttr3() ;
      A344DisArtPt1 = obj34.getgxTv_SdtPedido_Disartpt1() ;
      A345DisArtPt2 = obj34.getgxTv_SdtPedido_Disartpt2() ;
      A346DisArtPt3 = obj34.getgxTv_SdtPedido_Disartpt3() ;
      A350DisArtRdt = obj34.getgxTv_SdtPedido_Disartrdt() ;
      A359DisArtUrg = obj34.getgxTv_SdtPedido_Disarturg() ;
      A356DisArtUr1 = obj34.getgxTv_SdtPedido_Disartur1() ;
      A357DisArtUr2 = obj34.getgxTv_SdtPedido_Disartur2() ;
      A358DisArtUr3 = obj34.getgxTv_SdtPedido_Disartur3() ;
      A347DisArtPu1 = obj34.getgxTv_SdtPedido_Disartpu1() ;
      A348DisArtPu2 = obj34.getgxTv_SdtPedido_Disartpu2() ;
      A349DisArtPu3 = obj34.getgxTv_SdtPedido_Disartpu3() ;
      n349DisArtPu3 = false ;
      A342DisArtPes = obj34.getgxTv_SdtPedido_Disartpes() ;
      A1225DisGraCru = obj34.getgxTv_SdtPedido_Disgracru() ;
      A334DisArtAnh = obj34.getgxTv_SdtPedido_Disartanh() ;
      A1231DisArtAn1 = obj34.getgxTv_SdtPedido_Disartan1() ;
      A1232DisArtAcb = obj34.getgxTv_SdtPedido_Disartacb() ;
      A1233DisArtAc2 = obj34.getgxTv_SdtPedido_Disartac2() ;
      A1197DisEncCom = obj34.getgxTv_SdtPedido_Disenccom() ;
      A1198DisEncAnh = obj34.getgxTv_SdtPedido_Disencanh() ;
      A3127DisNumCor = obj34.getgxTv_SdtPedido_Disnumcor() ;
      A3128DisAncSal1 = obj34.getgxTv_SdtPedido_Disancsal1() ;
      A3129DisAncSal2 = obj34.getgxTv_SdtPedido_Disancsal2() ;
      A3130DisAncSal3 = obj34.getgxTv_SdtPedido_Disancsal3() ;
      A3131DisGraAca2 = obj34.getgxTv_SdtPedido_Disgraaca2() ;
      A3132DisGraCru2 = obj34.getgxTv_SdtPedido_Disgracru2() ;
      A1906DisGraAca = obj34.getgxTv_SdtPedido_Disgraaca() ;
      A1908DisRdoA = obj34.getgxTv_SdtPedido_Disrdoa() ;
      A1907DisRdoN = obj34.getgxTv_SdtPedido_Disrdon() ;
      A5349DisObsGrm = obj34.getgxTv_SdtPedido_Disobsgrm() ;
      A5350DisObsAnc = obj34.getgxTv_SdtPedido_Disobsanc() ;
      A9786DisItem5 = obj34.getgxTv_SdtPedido_Disitem5() ;
      A392DisUniMed = obj34.getgxTv_SdtPedido_Disunimed() ;
      A12115DisArtTipD = obj34.getgxTv_SdtPedido_Disarttipd() ;
      A13994E_DisCliDe = obj34.getgxTv_SdtPedido_E_disclides() ;
      n13994E_DisCliDe = false ;
      A13995E_DisArtCo = obj34.getgxTv_SdtPedido_E_disartcod() ;
      n13995E_DisArtCo = false ;
      A14003CliNomDes = obj34.getgxTv_SdtPedido_Clinomdes() ;
      A407EmprNom = obj34.getgxTv_SdtPedido_Emprnom() ;
      n407EmprNom = false ;
      A4813DisEncCli = obj34.getgxTv_SdtPedido_Disenccli() ;
      A252CliCod = obj34.getgxTv_SdtPedido_Clicod() ;
      A279CliNom = obj34.getgxTv_SdtPedido_Clinom() ;
      A371DisFecEnt = obj34.getgxTv_SdtPedido_Disfecent() ;
      A335DisArtCod = obj34.getgxTv_SdtPedido_Disartcod() ;
      A362DisColNom = obj34.getgxTv_SdtPedido_Discolnom() ;
      n362DisColNom = false ;
      A363DisColNum = obj34.getgxTv_SdtPedido_Discolnum() ;
      n363DisColNum = false ;
      A390DisTipCol = obj34.getgxTv_SdtPedido_Distipcol() ;
      n390DisTipCol = false ;
      A13987DisArtDsc2 = obj34.getgxTv_SdtPedido_Disartdsc2() ;
      A10887Cod_Idtx = obj34.getgxTv_SdtPedido_Cod_idtx() ;
      n10887Cod_Idtx = false ;
      A10888Dsc_Idtx = obj34.getgxTv_SdtPedido_Dsc_idtx() ;
      n10888Dsc_Idtx = false ;
      A11661DisOrdComp = obj34.getgxTv_SdtPedido_Disordcomp() ;
      A12328RevenID = obj34.getgxTv_SdtPedido_Revenid() ;
      n12328RevenID = false ;
      A12327RevenNm = obj34.getgxTv_SdtPedido_Revennm() ;
      n12327RevenNm = false ;
      A11659MarcaId = obj34.getgxTv_SdtPedido_Marcaid() ;
      n11659MarcaId = false ;
      A11660MarcaDsc = obj34.getgxTv_SdtPedido_Marcadsc() ;
      n11660MarcaDsc = false ;
      A13986DisIdtx2 = obj34.getgxTv_SdtPedido_Disidtx2() ;
      n13986DisIdtx2 = false ;
      A12765DisPriorid = obj34.getgxTv_SdtPedido_Dispriorid() ;
      A11859Nxt_modelo = obj34.getgxTv_SdtPedido_Nxt_modelo() ;
      A11860CpteId = obj34.getgxTv_SdtPedido_Cpteid() ;
      n11860CpteId = false ;
      A11865CpteDsc = obj34.getgxTv_SdtPedido_Cptedsc() ;
      n11865CpteDsc = false ;
      A11861Nxt_statio = obj34.getgxTv_SdtPedido_Nxt_statio() ;
      A11862DesaID = obj34.getgxTv_SdtPedido_Desaid() ;
      n11862DesaID = false ;
      A11866DesaDsc = obj34.getgxTv_SdtPedido_Desadsc() ;
      n11866DesaDsc = false ;
      A11863DptoID = obj34.getgxTv_SdtPedido_Dptoid() ;
      n11863DptoID = false ;
      A11867DptoDsc = obj34.getgxTv_SdtPedido_Dptodsc() ;
      n11867DptoDsc = false ;
      A11864Nxt_artcli = obj34.getgxTv_SdtPedido_Nxt_artcli() ;
      A757PriCod = obj34.getgxTv_SdtPedido_Pricod() ;
      A369DisFec = obj34.getgxTv_SdtPedido_Disfec() ;
      A370DisFecCli = obj34.getgxTv_SdtPedido_Disfeccli() ;
      A367DisEst = obj34.getgxTv_SdtPedido_Disest() ;
      A365DisDes = obj34.getgxTv_SdtPedido_Disdes() ;
      A7739DisExp = obj34.getgxTv_SdtPedido_Disexp() ;
      A396EmprCod = obj34.getgxTv_SdtPedido_Emprcod() ;
      A361DisCod = obj34.getgxTv_SdtPedido_Discod() ;
      Z396EmprCod = obj34.getgxTv_SdtPedido_Emprcod_Z() ;
      Z407EmprNom = obj34.getgxTv_SdtPedido_Emprnom_Z() ;
      Z757PriCod = obj34.getgxTv_SdtPedido_Pricod_Z() ;
      Z361DisCod = obj34.getgxTv_SdtPedido_Discod_Z() ;
      Z2009DisTipDis = obj34.getgxTv_SdtPedido_Distipdis_Z() ;
      Z4813DisEncCli = obj34.getgxTv_SdtPedido_Disenccli_Z() ;
      Z252CliCod = obj34.getgxTv_SdtPedido_Clicod_Z() ;
      Z279CliNom = obj34.getgxTv_SdtPedido_Clinom_Z() ;
      Z2310DisCliDes = obj34.getgxTv_SdtPedido_Disclides_Z() ;
      Z14003CliNomDes = obj34.getgxTv_SdtPedido_Clinomdes_Z() ;
      Z13994E_DisCliDe = obj34.getgxTv_SdtPedido_E_disclides_Z() ;
      Z369DisFec = obj34.getgxTv_SdtPedido_Disfec_Z() ;
      Z370DisFecCli = obj34.getgxTv_SdtPedido_Disfeccli_Z() ;
      Z371DisFecEnt = obj34.getgxTv_SdtPedido_Disfecent_Z() ;
      Z335DisArtCod = obj34.getgxTv_SdtPedido_Disartcod_Z() ;
      O335DisArtCod = obj34.getgxTv_SdtPedido_Disartcod_Z() ;
      Z13995E_DisArtCo = obj34.getgxTv_SdtPedido_E_disartcod_Z() ;
      Z337DisArtDsc = obj34.getgxTv_SdtPedido_Disartdsc_Z() ;
      Z352DisArtTip = obj34.getgxTv_SdtPedido_Disarttip_Z() ;
      Z12115DisArtTipD = obj34.getgxTv_SdtPedido_Disarttipd_Z() ;
      Z340DisArtMat = obj34.getgxTv_SdtPedido_Disartmat_Z() ;
      Z353DisArtTr1 = obj34.getgxTv_SdtPedido_Disarttr1_Z() ;
      Z344DisArtPt1 = obj34.getgxTv_SdtPedido_Disartpt1_Z() ;
      Z354DisArtTr2 = obj34.getgxTv_SdtPedido_Disarttr2_Z() ;
      Z345DisArtPt2 = obj34.getgxTv_SdtPedido_Disartpt2_Z() ;
      Z355DisArtTr3 = obj34.getgxTv_SdtPedido_Disarttr3_Z() ;
      Z346DisArtPt3 = obj34.getgxTv_SdtPedido_Disartpt3_Z() ;
      Z356DisArtUr1 = obj34.getgxTv_SdtPedido_Disartur1_Z() ;
      Z347DisArtPu1 = obj34.getgxTv_SdtPedido_Disartpu1_Z() ;
      Z357DisArtUr2 = obj34.getgxTv_SdtPedido_Disartur2_Z() ;
      Z348DisArtPu2 = obj34.getgxTv_SdtPedido_Disartpu2_Z() ;
      Z358DisArtUr3 = obj34.getgxTv_SdtPedido_Disartur3_Z() ;
      Z349DisArtPu3 = obj34.getgxTv_SdtPedido_Disartpu3_Z() ;
      Z362DisColNom = obj34.getgxTv_SdtPedido_Discolnom_Z() ;
      Z363DisColNum = obj34.getgxTv_SdtPedido_Discolnum_Z() ;
      Z390DisTipCol = obj34.getgxTv_SdtPedido_Distipcol_Z() ;
      Z367DisEst = obj34.getgxTv_SdtPedido_Disest_Z() ;
      Z365DisDes = obj34.getgxTv_SdtPedido_Disdes_Z() ;
      Z13987DisArtDsc2 = obj34.getgxTv_SdtPedido_Disartdsc2_Z() ;
      Z2835DisPle2 = obj34.getgxTv_SdtPedido_Disple2_Z() ;
      Z339DisArtLar = obj34.getgxTv_SdtPedido_Disartlar_Z() ;
      Z351DisArtSua = obj34.getgxTv_SdtPedido_Disartsua_Z() ;
      Z333DisArtAca = obj34.getgxTv_SdtPedido_Disartaca_Z() ;
      Z338DisArtEnc = obj34.getgxTv_SdtPedido_Disartenc_Z() ;
      Z336DisArtCor = obj34.getgxTv_SdtPedido_Disartcor_Z() ;
      Z342DisArtPes = obj34.getgxTv_SdtPedido_Disartpes_Z() ;
      Z350DisArtRdt = obj34.getgxTv_SdtPedido_Disartrdt_Z() ;
      Z359DisArtUrg = obj34.getgxTv_SdtPedido_Disarturg_Z() ;
      Z1225DisGraCru = obj34.getgxTv_SdtPedido_Disgracru_Z() ;
      Z334DisArtAnh = obj34.getgxTv_SdtPedido_Disartanh_Z() ;
      Z1231DisArtAn1 = obj34.getgxTv_SdtPedido_Disartan1_Z() ;
      Z1232DisArtAcb = obj34.getgxTv_SdtPedido_Disartacb_Z() ;
      Z1233DisArtAc2 = obj34.getgxTv_SdtPedido_Disartac2_Z() ;
      Z1197DisEncCom = obj34.getgxTv_SdtPedido_Disenccom_Z() ;
      Z1198DisEncAnh = obj34.getgxTv_SdtPedido_Disencanh_Z() ;
      Z3127DisNumCor = obj34.getgxTv_SdtPedido_Disnumcor_Z() ;
      Z3128DisAncSal1 = obj34.getgxTv_SdtPedido_Disancsal1_Z() ;
      Z3129DisAncSal2 = obj34.getgxTv_SdtPedido_Disancsal2_Z() ;
      Z3130DisAncSal3 = obj34.getgxTv_SdtPedido_Disancsal3_Z() ;
      Z3131DisGraAca2 = obj34.getgxTv_SdtPedido_Disgraaca2_Z() ;
      Z3132DisGraCru2 = obj34.getgxTv_SdtPedido_Disgracru2_Z() ;
      Z1906DisGraAca = obj34.getgxTv_SdtPedido_Disgraaca_Z() ;
      Z1908DisRdoA = obj34.getgxTv_SdtPedido_Disrdoa_Z() ;
      Z1907DisRdoN = obj34.getgxTv_SdtPedido_Disrdon_Z() ;
      Z5349DisObsGrm = obj34.getgxTv_SdtPedido_Disobsgrm_Z() ;
      Z5350DisObsAnc = obj34.getgxTv_SdtPedido_Disobsanc_Z() ;
      Z9786DisItem5 = obj34.getgxTv_SdtPedido_Disitem5_Z() ;
      Z343DisArtPle = obj34.getgxTv_SdtPedido_Disartple_Z() ;
      Z392DisUniMed = obj34.getgxTv_SdtPedido_Disunimed_Z() ;
      Z10887Cod_Idtx = obj34.getgxTv_SdtPedido_Cod_idtx_Z() ;
      Z10888Dsc_Idtx = obj34.getgxTv_SdtPedido_Dsc_idtx_Z() ;
      Z11661DisOrdComp = obj34.getgxTv_SdtPedido_Disordcomp_Z() ;
      Z12328RevenID = obj34.getgxTv_SdtPedido_Revenid_Z() ;
      Z12327RevenNm = obj34.getgxTv_SdtPedido_Revennm_Z() ;
      Z11659MarcaId = obj34.getgxTv_SdtPedido_Marcaid_Z() ;
      Z11660MarcaDsc = obj34.getgxTv_SdtPedido_Marcadsc_Z() ;
      Z13986DisIdtx2 = obj34.getgxTv_SdtPedido_Disidtx2_Z() ;
      Z12765DisPriorid = obj34.getgxTv_SdtPedido_Dispriorid_Z() ;
      Z11859Nxt_modelo = obj34.getgxTv_SdtPedido_Nxt_modelo_Z() ;
      Z11860CpteId = obj34.getgxTv_SdtPedido_Cpteid_Z() ;
      Z11865CpteDsc = obj34.getgxTv_SdtPedido_Cptedsc_Z() ;
      Z11861Nxt_statio = obj34.getgxTv_SdtPedido_Nxt_statio_Z() ;
      Z11862DesaID = obj34.getgxTv_SdtPedido_Desaid_Z() ;
      Z11866DesaDsc = obj34.getgxTv_SdtPedido_Desadsc_Z() ;
      Z11863DptoID = obj34.getgxTv_SdtPedido_Dptoid_Z() ;
      Z11867DptoDsc = obj34.getgxTv_SdtPedido_Dptodsc_Z() ;
      Z11864Nxt_artcli = obj34.getgxTv_SdtPedido_Nxt_artcli_Z() ;
      Z7739DisExp = obj34.getgxTv_SdtPedido_Disexp_Z() ;
      n407EmprNom = (boolean)((obj34.getgxTv_SdtPedido_Emprnom_N()==0)?false:true) ;
      n2009DisTipDis = (boolean)((obj34.getgxTv_SdtPedido_Distipdis_N()==0)?false:true) ;
      n13994E_DisCliDe = (boolean)((obj34.getgxTv_SdtPedido_E_disclides_N()==0)?false:true) ;
      n13995E_DisArtCo = (boolean)((obj34.getgxTv_SdtPedido_E_disartcod_N()==0)?false:true) ;
      n349DisArtPu3 = (boolean)((obj34.getgxTv_SdtPedido_Disartpu3_N()==0)?false:true) ;
      n362DisColNom = (boolean)((obj34.getgxTv_SdtPedido_Discolnom_N()==0)?false:true) ;
      n363DisColNum = (boolean)((obj34.getgxTv_SdtPedido_Discolnum_N()==0)?false:true) ;
      n390DisTipCol = (boolean)((obj34.getgxTv_SdtPedido_Distipcol_N()==0)?false:true) ;
      n10887Cod_Idtx = (boolean)((obj34.getgxTv_SdtPedido_Cod_idtx_N()==0)?false:true) ;
      n10888Dsc_Idtx = (boolean)((obj34.getgxTv_SdtPedido_Dsc_idtx_N()==0)?false:true) ;
      n12328RevenID = (boolean)((obj34.getgxTv_SdtPedido_Revenid_N()==0)?false:true) ;
      n12327RevenNm = (boolean)((obj34.getgxTv_SdtPedido_Revennm_N()==0)?false:true) ;
      n11659MarcaId = (boolean)((obj34.getgxTv_SdtPedido_Marcaid_N()==0)?false:true) ;
      n11660MarcaDsc = (boolean)((obj34.getgxTv_SdtPedido_Marcadsc_N()==0)?false:true) ;
      n13986DisIdtx2 = (boolean)((obj34.getgxTv_SdtPedido_Disidtx2_N()==0)?false:true) ;
      n11860CpteId = (boolean)((obj34.getgxTv_SdtPedido_Cpteid_N()==0)?false:true) ;
      n11865CpteDsc = (boolean)((obj34.getgxTv_SdtPedido_Cptedsc_N()==0)?false:true) ;
      n11862DesaID = (boolean)((obj34.getgxTv_SdtPedido_Desaid_N()==0)?false:true) ;
      n11866DesaDsc = (boolean)((obj34.getgxTv_SdtPedido_Desadsc_N()==0)?false:true) ;
      n11863DptoID = (boolean)((obj34.getgxTv_SdtPedido_Dptoid_N()==0)?false:true) ;
      n11867DptoDsc = (boolean)((obj34.getgxTv_SdtPedido_Dptodsc_N()==0)?false:true) ;
      Gx_mode = obj34.getgxTv_SdtPedido_Mode() ;
   }

   public void VarsToRow1812( app.pedidosclientesindetalle.SdtPedido_Norma obj1812 )
   {
      obj1812.setgxTv_SdtPedido_Norma_Mode( Gx_mode );
      obj1812.setgxTv_SdtPedido_Norma_Disnormdsc( A13216DisNormDsc );
      obj1812.setgxTv_SdtPedido_Norma_Disnormst( A13214DisNormSt );
      obj1812.setgxTv_SdtPedido_Norma_Disnormnc( A13215DisNormNC );
      obj1812.setgxTv_SdtPedido_Norma_Disnormid( A13213DisNormID );
      obj1812.setgxTv_SdtPedido_Norma_Disnormid_Z( Z13213DisNormID );
      obj1812.setgxTv_SdtPedido_Norma_Disnormdsc_Z( Z13216DisNormDsc );
      obj1812.setgxTv_SdtPedido_Norma_Disnormst_Z( Z13214DisNormSt );
      obj1812.setgxTv_SdtPedido_Norma_Disnormnc_Z( Z13215DisNormNC );
      obj1812.setgxTv_SdtPedido_Norma_Disnormdsc_N( (byte)((byte)((n13216DisNormDsc)?1:0)) );
      obj1812.setgxTv_SdtPedido_Norma_Modified( nIsMod_1812 );
   }

   public void KeyVarsToRow1812( app.pedidosclientesindetalle.SdtPedido_Norma obj1812 )
   {
      obj1812.setgxTv_SdtPedido_Norma_Disnormid( A13213DisNormID );
   }

   public void RowToVars1812( app.pedidosclientesindetalle.SdtPedido_Norma obj1812 ,
                              int forceLoad )
   {
      Gx_mode = obj1812.getgxTv_SdtPedido_Norma_Mode() ;
      A13216DisNormDsc = obj1812.getgxTv_SdtPedido_Norma_Disnormdsc() ;
      n13216DisNormDsc = false ;
      A13214DisNormSt = obj1812.getgxTv_SdtPedido_Norma_Disnormst() ;
      A13215DisNormNC = obj1812.getgxTv_SdtPedido_Norma_Disnormnc() ;
      A13213DisNormID = obj1812.getgxTv_SdtPedido_Norma_Disnormid() ;
      Z13213DisNormID = obj1812.getgxTv_SdtPedido_Norma_Disnormid_Z() ;
      Z13216DisNormDsc = obj1812.getgxTv_SdtPedido_Norma_Disnormdsc_Z() ;
      Z13214DisNormSt = obj1812.getgxTv_SdtPedido_Norma_Disnormst_Z() ;
      Z13215DisNormNC = obj1812.getgxTv_SdtPedido_Norma_Disnormnc_Z() ;
      n13216DisNormDsc = (boolean)((obj1812.getgxTv_SdtPedido_Norma_Disnormdsc_N()==0)?false:true) ;
      nIsMod_1812 = obj1812.getgxTv_SdtPedido_Norma_Modified() ;
   }

   public void VarsToRow35( app.pedidosclientesindetalle.SdtPedido_AlmacenTejido obj35 )
   {
      obj35.setgxTv_SdtPedido_AlmacenTejido_Mode( Gx_mode );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrefdsc( A3613AlbRefDsc );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrreo( A55AlbRReo );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Piezas( A673Piezas );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrpiedis( A51AlbRPieDis );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Kilos( A595Kilos );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Metros( A631Metros );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrunidis( A57AlbRUniDis );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albreccod( A44AlbRecCod );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albreccod_Z( Z44AlbRecCod );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z( Z3613AlbRefDsc );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrreo_Z( Z55AlbRReo );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Piezas_Z( Z673Piezas );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z( Z51AlbRPieDis );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Kilos_Z( Z595Kilos );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Metros_Z( Z631Metros );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z( Z57AlbRUniDis );
      obj35.setgxTv_SdtPedido_AlmacenTejido_Modified( nIsMod_35 );
   }

   public void KeyVarsToRow35( app.pedidosclientesindetalle.SdtPedido_AlmacenTejido obj35 )
   {
      obj35.setgxTv_SdtPedido_AlmacenTejido_Albreccod( A44AlbRecCod );
   }

   public void RowToVars35( app.pedidosclientesindetalle.SdtPedido_AlmacenTejido obj35 ,
                            int forceLoad )
   {
      Gx_mode = obj35.getgxTv_SdtPedido_AlmacenTejido_Mode() ;
      A3613AlbRefDsc = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrefdsc() ;
      A55AlbRReo = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrreo() ;
      A673Piezas = obj35.getgxTv_SdtPedido_AlmacenTejido_Piezas() ;
      A51AlbRPieDis = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrpiedis() ;
      A595Kilos = obj35.getgxTv_SdtPedido_AlmacenTejido_Kilos() ;
      A631Metros = obj35.getgxTv_SdtPedido_AlmacenTejido_Metros() ;
      A57AlbRUniDis = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrunidis() ;
      A44AlbRecCod = obj35.getgxTv_SdtPedido_AlmacenTejido_Albreccod() ;
      Z44AlbRecCod = obj35.getgxTv_SdtPedido_AlmacenTejido_Albreccod_Z() ;
      Z3613AlbRefDsc = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z() ;
      Z55AlbRReo = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrreo_Z() ;
      Z673Piezas = obj35.getgxTv_SdtPedido_AlmacenTejido_Piezas_Z() ;
      Z51AlbRPieDis = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z() ;
      Z595Kilos = obj35.getgxTv_SdtPedido_AlmacenTejido_Kilos_Z() ;
      Z631Metros = obj35.getgxTv_SdtPedido_AlmacenTejido_Metros_Z() ;
      Z57AlbRUniDis = obj35.getgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z() ;
      nIsMod_35 = obj35.getgxTv_SdtPedido_AlmacenTejido_Modified() ;
   }

   public void VarsToRow37( app.pedidosclientesindetalle.SdtPedido_Defecto obj37 )
   {
      obj37.setgxTv_SdtPedido_Defecto_Mode( Gx_mode );
      obj37.setgxTv_SdtPedido_Defecto_Tipdefdsc( A834TipDefDsc );
      obj37.setgxTv_SdtPedido_Defecto_Defpor( A319DefPor );
      obj37.setgxTv_SdtPedido_Defecto_Tipdefcod( A833TipDefCod );
      obj37.setgxTv_SdtPedido_Defecto_Tipdefcod_Z( Z833TipDefCod );
      obj37.setgxTv_SdtPedido_Defecto_Tipdefdsc_Z( Z834TipDefDsc );
      obj37.setgxTv_SdtPedido_Defecto_Defpor_Z( Z319DefPor );
      obj37.setgxTv_SdtPedido_Defecto_Tipdefcod_N( (byte)((byte)((n833TipDefCod)?1:0)) );
      obj37.setgxTv_SdtPedido_Defecto_Tipdefdsc_N( (byte)((byte)((n834TipDefDsc)?1:0)) );
      obj37.setgxTv_SdtPedido_Defecto_Modified( nIsMod_37 );
   }

   public void KeyVarsToRow37( app.pedidosclientesindetalle.SdtPedido_Defecto obj37 )
   {
      obj37.setgxTv_SdtPedido_Defecto_Tipdefcod( A833TipDefCod );
   }

   public void RowToVars37( app.pedidosclientesindetalle.SdtPedido_Defecto obj37 ,
                            int forceLoad )
   {
      Gx_mode = obj37.getgxTv_SdtPedido_Defecto_Mode() ;
      A834TipDefDsc = obj37.getgxTv_SdtPedido_Defecto_Tipdefdsc() ;
      n834TipDefDsc = false ;
      A319DefPor = obj37.getgxTv_SdtPedido_Defecto_Defpor() ;
      A833TipDefCod = obj37.getgxTv_SdtPedido_Defecto_Tipdefcod() ;
      n833TipDefCod = false ;
      Z833TipDefCod = obj37.getgxTv_SdtPedido_Defecto_Tipdefcod_Z() ;
      Z834TipDefDsc = obj37.getgxTv_SdtPedido_Defecto_Tipdefdsc_Z() ;
      Z319DefPor = obj37.getgxTv_SdtPedido_Defecto_Defpor_Z() ;
      n833TipDefCod = (boolean)((obj37.getgxTv_SdtPedido_Defecto_Tipdefcod_N()==0)?false:true) ;
      n834TipDefDsc = (boolean)((obj37.getgxTv_SdtPedido_Defecto_Tipdefdsc_N()==0)?false:true) ;
      nIsMod_37 = obj37.getgxTv_SdtPedido_Defecto_Modified() ;
   }

   public void VarsToRow38( app.pedidosclientesindetalle.SdtPedido_Proceso obj38 )
   {
      obj38.setgxTv_SdtPedido_Proceso_Mode( Gx_mode );
      obj38.setgxTv_SdtPedido_Proceso_Prodsc( A759ProDsc );
      obj38.setgxTv_SdtPedido_Proceso_Ultfaslin( A846UltFasLin );
      obj38.setgxTv_SdtPedido_Proceso_Procod( A758ProCod );
      obj38.setgxTv_SdtPedido_Proceso_Procod_Z( Z758ProCod );
      obj38.setgxTv_SdtPedido_Proceso_Prodsc_Z( Z759ProDsc );
      obj38.setgxTv_SdtPedido_Proceso_Ultfaslin_Z( Z846UltFasLin );
      obj38.setgxTv_SdtPedido_Proceso_Modified( nIsMod_38 );
   }

   public void KeyVarsToRow38( app.pedidosclientesindetalle.SdtPedido_Proceso obj38 )
   {
      obj38.setgxTv_SdtPedido_Proceso_Procod( A758ProCod );
   }

   public void RowToVars38( app.pedidosclientesindetalle.SdtPedido_Proceso obj38 ,
                            int forceLoad )
   {
      Gx_mode = obj38.getgxTv_SdtPedido_Proceso_Mode() ;
      A759ProDsc = obj38.getgxTv_SdtPedido_Proceso_Prodsc() ;
      A846UltFasLin = obj38.getgxTv_SdtPedido_Proceso_Ultfaslin() ;
      A758ProCod = obj38.getgxTv_SdtPedido_Proceso_Procod() ;
      Z758ProCod = obj38.getgxTv_SdtPedido_Proceso_Procod_Z() ;
      Z759ProDsc = obj38.getgxTv_SdtPedido_Proceso_Prodsc_Z() ;
      Z846UltFasLin = obj38.getgxTv_SdtPedido_Proceso_Ultfaslin_Z() ;
      nIsMod_38 = obj38.getgxTv_SdtPedido_Proceso_Modified() ;
   }

   public void VarsToRow39( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase obj39 )
   {
      obj39.setgxTv_SdtPedido_Proceso_Fase_Mode( Gx_mode );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Fascod( A457FasCod );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Fasdsc( A460FasDsc );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Disquiul( A5376DisQuiUl );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Disfaslin( A368DisFasLin );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z( Z368DisFasLin );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Fascod_Z( Z457FasCod );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z( Z460FasDsc );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Disquiul_Z( Z5376DisQuiUl );
      obj39.setgxTv_SdtPedido_Proceso_Fase_Modified( nIsMod_39 );
   }

   public void KeyVarsToRow39( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase obj39 )
   {
      obj39.setgxTv_SdtPedido_Proceso_Fase_Disfaslin( A368DisFasLin );
   }

   public void RowToVars39( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase obj39 ,
                            int forceLoad )
   {
      Gx_mode = obj39.getgxTv_SdtPedido_Proceso_Fase_Mode() ;
      A457FasCod = obj39.getgxTv_SdtPedido_Proceso_Fase_Fascod() ;
      A460FasDsc = obj39.getgxTv_SdtPedido_Proceso_Fase_Fasdsc() ;
      A5376DisQuiUl = obj39.getgxTv_SdtPedido_Proceso_Fase_Disquiul() ;
      A368DisFasLin = obj39.getgxTv_SdtPedido_Proceso_Fase_Disfaslin() ;
      Z368DisFasLin = obj39.getgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z() ;
      Z457FasCod = obj39.getgxTv_SdtPedido_Proceso_Fase_Fascod_Z() ;
      Z460FasDsc = obj39.getgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z() ;
      Z5376DisQuiUl = obj39.getgxTv_SdtPedido_Proceso_Fase_Disquiul_Z() ;
      nIsMod_39 = obj39.getgxTv_SdtPedido_Proceso_Fase_Modified() ;
   }

   public void VarsToRow780( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico obj780 )
   {
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode( Gx_mode );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod( A764ProForCod );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc( A766ProForDsc );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin( A5377DisQuiLin );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z( Z5377DisQuiLin );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z( Z764ProForCod );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z( Z766ProForDsc );
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified( nIsMod_780 );
   }

   public void KeyVarsToRow780( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico obj780 )
   {
      obj780.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin( A5377DisQuiLin );
   }

   public void RowToVars780( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico obj780 ,
                             int forceLoad )
   {
      Gx_mode = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode() ;
      A764ProForCod = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod() ;
      A766ProForDsc = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc() ;
      A5377DisQuiLin = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin() ;
      Z5377DisQuiLin = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z() ;
      Z764ProForCod = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z() ;
      Z766ProForDsc = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z() ;
      nIsMod_780 = obj780.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified() ;
   }

   public void VarsToRow517( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro obj517 )
   {
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Mode( Gx_mode );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2( A12672DisParVl2 );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs( A3686DisParObs );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod( A1664ParFasCod );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z( Z1664ParFasCod );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z( Z12672DisParVl2 );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z( Z3686DisParObs );
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Modified( nIsMod_517 );
   }

   public void KeyVarsToRow517( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro obj517 )
   {
      obj517.setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod( A1664ParFasCod );
   }

   public void RowToVars517( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro obj517 ,
                             int forceLoad )
   {
      Gx_mode = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Mode() ;
      A12672DisParVl2 = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2() ;
      A3686DisParObs = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs() ;
      A1664ParFasCod = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod() ;
      Z1664ParFasCod = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z() ;
      Z12672DisParVl2 = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z() ;
      Z3686DisParObs = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z() ;
      nIsMod_517 = obj517.getgxTv_SdtPedido_Proceso_Fase_Parametro_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1S034( ) ;
      scanKeyStart1S034( ) ;
      if ( RcdFound34 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01S0171 */
         pr_default.execute(153, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(153) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01S0171_A407EmprNom[0] ;
         n407EmprNom = BC01S0171_n407EmprNom[0] ;
         pr_default.close(153);
         /* Using cursor BC01S0174 */
         pr_default.execute(154, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(154) != 101) )
         {
            A13994E_DisCliDe = BC01S0174_A13994E_DisCliDe[0] ;
            n13994E_DisCliDe = BC01S0174_n13994E_DisCliDe[0] ;
         }
         else
         {
            A13994E_DisCliDe = (short)(0) ;
            n13994E_DisCliDe = false ;
         }
         pr_default.close(154);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         O335DisArtCod = A335DisArtCod ;
      }
      zm1S034( -35) ;
      onLoadActions1S034( ) ;
      addRow1S034( ) ;
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S01812( ) ;
         nGXsfl_1812_idx = 1 ;
         while ( RcdFound1812 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z13213DisNormID = A13213DisNormID ;
            zm1S01812( -48) ;
            onLoadActions1S01812( ) ;
            nRcdExists_1812 = (short)(1) ;
            nIsMod_1812 = (short)(0) ;
            addRow1S01812( ) ;
            nGXsfl_1812_idx = (int)(nGXsfl_1812_idx+1) ;
            scanKeyNext1S01812( ) ;
         }
         scanKeyEnd1S01812( ) ;
      }
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S035( ) ;
         nGXsfl_35_idx = 1 ;
         while ( RcdFound35 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z44AlbRecCod = A44AlbRecCod ;
            zm1S035( -50) ;
            onLoadActions1S035( ) ;
            nRcdExists_35 = (short)(1) ;
            nIsMod_35 = (short)(0) ;
            addRow1S035( ) ;
            nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
            scanKeyNext1S035( ) ;
         }
         scanKeyEnd1S035( ) ;
      }
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S037( ) ;
         nGXsfl_37_idx = 1 ;
         while ( RcdFound37 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z833TipDefCod = A833TipDefCod ;
            zm1S037( -52) ;
            onLoadActions1S037( ) ;
            nRcdExists_37 = (short)(1) ;
            nIsMod_37 = (short)(0) ;
            addRow1S037( ) ;
            nGXsfl_37_idx = (int)(nGXsfl_37_idx+1) ;
            scanKeyNext1S037( ) ;
         }
         scanKeyEnd1S037( ) ;
      }
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S038( ) ;
         nGXsfl_38_idx = 1 ;
         while ( RcdFound38 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z758ProCod = A758ProCod ;
            zm1S038( -54) ;
            onLoadActions1S038( ) ;
            nRcdExists_38 = (short)(1) ;
            nIsMod_38 = (short)(0) ;
            addRow1S038( ) ;
            ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().clearCollection();
            if ( RcdFound38 == 1 )
            {
               scanKeyStart1S039( ) ;
               nGXsfl_39_idx = 1 ;
               while ( RcdFound39 != 0 )
               {
                  Z396EmprCod = A396EmprCod ;
                  Z361DisCod = A361DisCod ;
                  Z758ProCod = A758ProCod ;
                  Z368DisFasLin = A368DisFasLin ;
                  zm1S039( -56) ;
                  onLoadActions1S039( ) ;
                  nRcdExists_39 = (short)(1) ;
                  nIsMod_39 = (short)(0) ;
                  addRow1S039( ) ;
                  ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().clearCollection();
                  if ( RcdFound39 == 1 )
                  {
                     scanKeyStart1S0780( ) ;
                     nGXsfl_780_idx = 1 ;
                     while ( RcdFound780 != 0 )
                     {
                        Z396EmprCod = A396EmprCod ;
                        Z361DisCod = A361DisCod ;
                        Z758ProCod = A758ProCod ;
                        Z368DisFasLin = A368DisFasLin ;
                        Z5377DisQuiLin = A5377DisQuiLin ;
                        zm1S0780( -58) ;
                        onLoadActions1S0780( ) ;
                        nRcdExists_780 = (short)(1) ;
                        nIsMod_780 = (short)(0) ;
                        addRow1S0780( ) ;
                        nGXsfl_780_idx = (int)(nGXsfl_780_idx+1) ;
                        scanKeyNext1S0780( ) ;
                     }
                     scanKeyEnd1S0780( ) ;
                  }
                  ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().clearCollection();
                  if ( RcdFound39 == 1 )
                  {
                     scanKeyStart1S0517( ) ;
                     nGXsfl_517_idx = 1 ;
                     while ( RcdFound517 != 0 )
                     {
                        Z396EmprCod = A396EmprCod ;
                        Z361DisCod = A361DisCod ;
                        Z758ProCod = A758ProCod ;
                        Z368DisFasLin = A368DisFasLin ;
                        Z1664ParFasCod = A1664ParFasCod ;
                        zm1S0517( -60) ;
                        onLoadActions1S0517( ) ;
                        nRcdExists_517 = (short)(1) ;
                        nIsMod_517 = (short)(0) ;
                        addRow1S0517( ) ;
                        nGXsfl_517_idx = (int)(nGXsfl_517_idx+1) ;
                        scanKeyNext1S0517( ) ;
                     }
                     scanKeyEnd1S0517( ) ;
                  }
                  nGXsfl_39_idx = (int)(nGXsfl_39_idx+1) ;
                  scanKeyNext1S039( ) ;
               }
               scanKeyEnd1S039( ) ;
            }
            nGXsfl_38_idx = (int)(nGXsfl_38_idx+1) ;
            scanKeyNext1S038( ) ;
         }
         scanKeyEnd1S038( ) ;
      }
      scanKeyEnd1S034( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars34( bcpedidosclientesindetalle_Pedido, 0) ;
      scanKeyStart1S034( ) ;
      if ( RcdFound34 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01S0175 */
         pr_default.execute(155, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(155) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01S0175_A407EmprNom[0] ;
         n407EmprNom = BC01S0175_n407EmprNom[0] ;
         pr_default.close(155);
         /* Using cursor BC01S0178 */
         pr_default.execute(156, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(156) != 101) )
         {
            A13994E_DisCliDe = BC01S0178_A13994E_DisCliDe[0] ;
            n13994E_DisCliDe = BC01S0178_n13994E_DisCliDe[0] ;
         }
         else
         {
            A13994E_DisCliDe = (short)(0) ;
            n13994E_DisCliDe = false ;
         }
         pr_default.close(156);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         O335DisArtCod = A335DisArtCod ;
      }
      zm1S034( -35) ;
      onLoadActions1S034( ) ;
      addRow1S034( ) ;
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Norma().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S01812( ) ;
         nGXsfl_1812_idx = 1 ;
         while ( RcdFound1812 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z13213DisNormID = A13213DisNormID ;
            zm1S01812( -48) ;
            onLoadActions1S01812( ) ;
            nRcdExists_1812 = (short)(1) ;
            nIsMod_1812 = (short)(0) ;
            addRow1S01812( ) ;
            nGXsfl_1812_idx = (int)(nGXsfl_1812_idx+1) ;
            scanKeyNext1S01812( ) ;
         }
         scanKeyEnd1S01812( ) ;
      }
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Almacentejido().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S035( ) ;
         nGXsfl_35_idx = 1 ;
         while ( RcdFound35 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z44AlbRecCod = A44AlbRecCod ;
            zm1S035( -50) ;
            onLoadActions1S035( ) ;
            nRcdExists_35 = (short)(1) ;
            nIsMod_35 = (short)(0) ;
            addRow1S035( ) ;
            nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
            scanKeyNext1S035( ) ;
         }
         scanKeyEnd1S035( ) ;
      }
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Defecto().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S037( ) ;
         nGXsfl_37_idx = 1 ;
         while ( RcdFound37 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z833TipDefCod = A833TipDefCod ;
            zm1S037( -52) ;
            onLoadActions1S037( ) ;
            nRcdExists_37 = (short)(1) ;
            nIsMod_37 = (short)(0) ;
            addRow1S037( ) ;
            nGXsfl_37_idx = (int)(nGXsfl_37_idx+1) ;
            scanKeyNext1S037( ) ;
         }
         scanKeyEnd1S037( ) ;
      }
      bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().clearCollection();
      if ( RcdFound34 == 1 )
      {
         scanKeyStart1S038( ) ;
         nGXsfl_38_idx = 1 ;
         while ( RcdFound38 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z361DisCod = A361DisCod ;
            Z758ProCod = A758ProCod ;
            zm1S038( -54) ;
            onLoadActions1S038( ) ;
            nRcdExists_38 = (short)(1) ;
            nIsMod_38 = (short)(0) ;
            addRow1S038( ) ;
            ((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().clearCollection();
            if ( RcdFound38 == 1 )
            {
               scanKeyStart1S039( ) ;
               nGXsfl_39_idx = 1 ;
               while ( RcdFound39 != 0 )
               {
                  Z396EmprCod = A396EmprCod ;
                  Z361DisCod = A361DisCod ;
                  Z758ProCod = A758ProCod ;
                  Z368DisFasLin = A368DisFasLin ;
                  zm1S039( -56) ;
                  onLoadActions1S039( ) ;
                  nRcdExists_39 = (short)(1) ;
                  nIsMod_39 = (short)(0) ;
                  addRow1S039( ) ;
                  ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().clearCollection();
                  if ( RcdFound39 == 1 )
                  {
                     scanKeyStart1S0780( ) ;
                     nGXsfl_780_idx = 1 ;
                     while ( RcdFound780 != 0 )
                     {
                        Z396EmprCod = A396EmprCod ;
                        Z361DisCod = A361DisCod ;
                        Z758ProCod = A758ProCod ;
                        Z368DisFasLin = A368DisFasLin ;
                        Z5377DisQuiLin = A5377DisQuiLin ;
                        zm1S0780( -58) ;
                        onLoadActions1S0780( ) ;
                        nRcdExists_780 = (short)(1) ;
                        nIsMod_780 = (short)(0) ;
                        addRow1S0780( ) ;
                        nGXsfl_780_idx = (int)(nGXsfl_780_idx+1) ;
                        scanKeyNext1S0780( ) ;
                     }
                     scanKeyEnd1S0780( ) ;
                  }
                  ((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso)bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Proceso().elementAt(-1+nGXsfl_38_idx)).getgxTv_SdtPedido_Proceso_Fase().elementAt(-1+nGXsfl_39_idx)).getgxTv_SdtPedido_Proceso_Fase_Parametro().clearCollection();
                  if ( RcdFound39 == 1 )
                  {
                     scanKeyStart1S0517( ) ;
                     nGXsfl_517_idx = 1 ;
                     while ( RcdFound517 != 0 )
                     {
                        Z396EmprCod = A396EmprCod ;
                        Z361DisCod = A361DisCod ;
                        Z758ProCod = A758ProCod ;
                        Z368DisFasLin = A368DisFasLin ;
                        Z1664ParFasCod = A1664ParFasCod ;
                        zm1S0517( -60) ;
                        onLoadActions1S0517( ) ;
                        nRcdExists_517 = (short)(1) ;
                        nIsMod_517 = (short)(0) ;
                        addRow1S0517( ) ;
                        nGXsfl_517_idx = (int)(nGXsfl_517_idx+1) ;
                        scanKeyNext1S0517( ) ;
                     }
                     scanKeyEnd1S0517( ) ;
                  }
                  nGXsfl_39_idx = (int)(nGXsfl_39_idx+1) ;
                  scanKeyNext1S039( ) ;
               }
               scanKeyEnd1S039( ) ;
            }
            nGXsfl_38_idx = (int)(nGXsfl_38_idx+1) ;
            scanKeyNext1S038( ) ;
         }
         scanKeyEnd1S038( ) ;
      }
      scanKeyEnd1S034( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1S034( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1S034( ) ;
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               A361DisCod = Z361DisCod ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update1S034( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1S034( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1S034( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars34( bcpedidosclientesindetalle_Pedido, 1) ;
      saveImpl( ) ;
      VarsToRow34( bcpedidosclientesindetalle_Pedido) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars34( bcpedidosclientesindetalle_Pedido, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1S034( ) ;
      afterTrn( ) ;
      VarsToRow34( bcpedidosclientesindetalle_Pedido) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
      }
      else
      {
         app.pedidosclientesindetalle.SdtPedido auxBC = new app.pedidosclientesindetalle.SdtPedido( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A361DisCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcpedidosclientesindetalle_Pedido);
            auxBC.Save();
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars34( bcpedidosclientesindetalle_Pedido, 1) ;
      updateImpl( ) ;
      VarsToRow34( bcpedidosclientesindetalle_Pedido) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars34( bcpedidosclientesindetalle_Pedido, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1S034( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow34( bcpedidosclientesindetalle_Pedido) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars34( bcpedidosclientesindetalle_Pedido, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1S034( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
         {
            A361DisCod = Z361DisCod ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.pedido_bc");
      VarsToRow34( bcpedidosclientesindetalle_Pedido) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcpedidosclientesindetalle_Pedido.setgxTv_SdtPedido_Mode( Gx_mode );
   }

   public void SetSDT( app.pedidosclientesindetalle.SdtPedido sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcpedidosclientesindetalle_Pedido )
      {
         bcpedidosclientesindetalle_Pedido = sdt ;
         if ( GXutil.strcmp(bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Mode(), "") == 0 )
         {
            bcpedidosclientesindetalle_Pedido.setgxTv_SdtPedido_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow34( bcpedidosclientesindetalle_Pedido) ;
         }
         else
         {
            RowToVars34( bcpedidosclientesindetalle_Pedido, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcpedidosclientesindetalle_Pedido.getgxTv_SdtPedido_Mode(), "") == 0 )
         {
            bcpedidosclientesindetalle_Pedido.setgxTv_SdtPedido_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars34( bcpedidosclientesindetalle_Pedido, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtPedido getPedido_BC( )
   {
      return bcpedidosclientesindetalle_Pedido ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      sMode34 = "" ;
      sMode39 = "" ;
      sMode38 = "" ;
      AV13Station = "" ;
      AV12EmprNom = "" ;
      AV14UsurCod = "" ;
      Z2009DisTipDis = "" ;
      A2009DisTipDis = "" ;
      Z337DisArtDsc = "" ;
      A337DisArtDsc = "" ;
      Z340DisArtMat = "" ;
      A340DisArtMat = "" ;
      Z2835DisPle2 = "" ;
      A2835DisPle2 = "" ;
      Z339DisArtLar = "" ;
      A339DisArtLar = "" ;
      Z351DisArtSua = "" ;
      A351DisArtSua = "" ;
      Z333DisArtAca = "" ;
      A333DisArtAca = "" ;
      Z343DisArtPle = "" ;
      A343DisArtPle = "" ;
      Z338DisArtEnc = "" ;
      A338DisArtEnc = "" ;
      Z336DisArtCor = "" ;
      A336DisArtCor = "" ;
      Z353DisArtTr1 = "" ;
      A353DisArtTr1 = "" ;
      Z354DisArtTr2 = "" ;
      A354DisArtTr2 = "" ;
      Z355DisArtTr3 = "" ;
      A355DisArtTr3 = "" ;
      Z350DisArtRdt = DecimalUtil.ZERO ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      Z356DisArtUr1 = "" ;
      A356DisArtUr1 = "" ;
      Z357DisArtUr2 = "" ;
      A357DisArtUr2 = "" ;
      Z358DisArtUr3 = "" ;
      A358DisArtUr3 = "" ;
      Z1197DisEncCom = DecimalUtil.ZERO ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      Z1198DisEncAnh = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      Z1908DisRdoA = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      Z1907DisRdoN = DecimalUtil.ZERO ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      Z5349DisObsGrm = "" ;
      A5349DisObsGrm = "" ;
      Z5350DisObsAnc = "" ;
      A5350DisObsAnc = "" ;
      Z9786DisItem5 = "" ;
      A9786DisItem5 = "" ;
      Z392DisUniMed = "" ;
      A392DisUniMed = "" ;
      Z757PriCod = "" ;
      A757PriCod = "" ;
      Z4813DisEncCli = "" ;
      A4813DisEncCli = "" ;
      Z369DisFec = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      Z370DisFecCli = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      A335DisArtCod = "" ;
      Z362DisColNom = "" ;
      A362DisColNom = "" ;
      Z365DisDes = "" ;
      A365DisDes = "" ;
      Z13987DisArtDsc2 = "" ;
      A13987DisArtDsc2 = "" ;
      Z11661DisOrdComp = "" ;
      A11661DisOrdComp = "" ;
      Z11859Nxt_modelo = "" ;
      A11859Nxt_modelo = "" ;
      Z11861Nxt_statio = "" ;
      A11861Nxt_statio = "" ;
      Z11864Nxt_artcli = "" ;
      A11864Nxt_artcli = "" ;
      Z7739DisExp = "" ;
      A7739DisExp = "" ;
      Z10887Cod_Idtx = "" ;
      A10887Cod_Idtx = "" ;
      Z13986DisIdtx2 = "" ;
      A13986DisIdtx2 = "" ;
      Z11659MarcaId = "" ;
      A11659MarcaId = "" ;
      Z12328RevenID = "" ;
      A12328RevenID = "" ;
      Z14003CliNomDes = "" ;
      A14003CliNomDes = "" ;
      Z12115DisArtTipD = "" ;
      A12115DisArtTipD = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z279CliNom = "" ;
      A279CliNom = "" ;
      Z10888Dsc_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      Z11660MarcaDsc = "" ;
      A11660MarcaDsc = "" ;
      Z11867DptoDsc = "" ;
      A11867DptoDsc = "" ;
      Z11865CpteDsc = "" ;
      A11865CpteDsc = "" ;
      Z11866DesaDsc = "" ;
      A11866DesaDsc = "" ;
      Z12327RevenNm = "" ;
      A12327RevenNm = "" ;
      BC01S041_A407EmprNom = new String[] {""} ;
      BC01S041_n407EmprNom = new boolean[] {false} ;
      AV7Codigo = "" ;
      BC01S042_A361DisCod = new int[1] ;
      BC01S042_A2310DisCliDes = new int[1] ;
      BC01S042_A2009DisTipDis = new String[] {""} ;
      BC01S042_n2009DisTipDis = new boolean[] {false} ;
      BC01S042_A337DisArtDsc = new String[] {""} ;
      BC01S042_A340DisArtMat = new String[] {""} ;
      BC01S042_A2835DisPle2 = new String[] {""} ;
      BC01S042_A339DisArtLar = new String[] {""} ;
      BC01S042_A351DisArtSua = new String[] {""} ;
      BC01S042_A333DisArtAca = new String[] {""} ;
      BC01S042_A343DisArtPle = new String[] {""} ;
      BC01S042_A352DisArtTip = new short[1] ;
      BC01S042_A338DisArtEnc = new String[] {""} ;
      BC01S042_A336DisArtCor = new String[] {""} ;
      BC01S042_A353DisArtTr1 = new String[] {""} ;
      BC01S042_A354DisArtTr2 = new String[] {""} ;
      BC01S042_A355DisArtTr3 = new String[] {""} ;
      BC01S042_A344DisArtPt1 = new short[1] ;
      BC01S042_A345DisArtPt2 = new short[1] ;
      BC01S042_A346DisArtPt3 = new short[1] ;
      BC01S042_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S042_A359DisArtUrg = new byte[1] ;
      BC01S042_A356DisArtUr1 = new String[] {""} ;
      BC01S042_A357DisArtUr2 = new String[] {""} ;
      BC01S042_A358DisArtUr3 = new String[] {""} ;
      BC01S042_A347DisArtPu1 = new short[1] ;
      BC01S042_A348DisArtPu2 = new short[1] ;
      BC01S042_A349DisArtPu3 = new short[1] ;
      BC01S042_n349DisArtPu3 = new boolean[] {false} ;
      BC01S042_A342DisArtPes = new short[1] ;
      BC01S042_A1225DisGraCru = new short[1] ;
      BC01S042_A334DisArtAnh = new short[1] ;
      BC01S042_A1231DisArtAn1 = new short[1] ;
      BC01S042_A1232DisArtAcb = new short[1] ;
      BC01S042_A1233DisArtAc2 = new short[1] ;
      BC01S042_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S042_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S042_A3127DisNumCor = new short[1] ;
      BC01S042_A3128DisAncSal1 = new short[1] ;
      BC01S042_A3129DisAncSal2 = new short[1] ;
      BC01S042_A3130DisAncSal3 = new short[1] ;
      BC01S042_A3131DisGraAca2 = new short[1] ;
      BC01S042_A3132DisGraCru2 = new short[1] ;
      BC01S042_A1906DisGraAca = new short[1] ;
      BC01S042_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S042_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S042_A5349DisObsGrm = new String[] {""} ;
      BC01S042_A5350DisObsAnc = new String[] {""} ;
      BC01S042_A9786DisItem5 = new String[] {""} ;
      BC01S042_A392DisUniMed = new String[] {""} ;
      BC01S042_A407EmprNom = new String[] {""} ;
      BC01S042_n407EmprNom = new boolean[] {false} ;
      BC01S042_A757PriCod = new String[] {""} ;
      BC01S042_A4813DisEncCli = new String[] {""} ;
      BC01S042_A279CliNom = new String[] {""} ;
      BC01S042_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S042_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S042_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S042_A335DisArtCod = new String[] {""} ;
      BC01S042_A362DisColNom = new String[] {""} ;
      BC01S042_n362DisColNom = new boolean[] {false} ;
      BC01S042_A363DisColNum = new int[1] ;
      BC01S042_n363DisColNum = new boolean[] {false} ;
      BC01S042_A367DisEst = new byte[1] ;
      BC01S042_A365DisDes = new String[] {""} ;
      BC01S042_A13987DisArtDsc2 = new String[] {""} ;
      BC01S042_A10888Dsc_Idtx = new String[] {""} ;
      BC01S042_n10888Dsc_Idtx = new boolean[] {false} ;
      BC01S042_A11661DisOrdComp = new String[] {""} ;
      BC01S042_A12327RevenNm = new String[] {""} ;
      BC01S042_n12327RevenNm = new boolean[] {false} ;
      BC01S042_A11660MarcaDsc = new String[] {""} ;
      BC01S042_n11660MarcaDsc = new boolean[] {false} ;
      BC01S042_A12765DisPriorid = new byte[1] ;
      BC01S042_A11859Nxt_modelo = new String[] {""} ;
      BC01S042_A11865CpteDsc = new String[] {""} ;
      BC01S042_n11865CpteDsc = new boolean[] {false} ;
      BC01S042_A11861Nxt_statio = new String[] {""} ;
      BC01S042_A11866DesaDsc = new String[] {""} ;
      BC01S042_n11866DesaDsc = new boolean[] {false} ;
      BC01S042_A11867DptoDsc = new String[] {""} ;
      BC01S042_n11867DptoDsc = new boolean[] {false} ;
      BC01S042_A11864Nxt_artcli = new String[] {""} ;
      BC01S042_A7739DisExp = new String[] {""} ;
      BC01S042_A396EmprCod = new String[] {""} ;
      BC01S042_A252CliCod = new int[1] ;
      BC01S042_A390DisTipCol = new byte[1] ;
      BC01S042_n390DisTipCol = new boolean[] {false} ;
      BC01S042_A10887Cod_Idtx = new String[] {""} ;
      BC01S042_n10887Cod_Idtx = new boolean[] {false} ;
      BC01S042_A13986DisIdtx2 = new String[] {""} ;
      BC01S042_n13986DisIdtx2 = new boolean[] {false} ;
      BC01S042_A11659MarcaId = new String[] {""} ;
      BC01S042_n11659MarcaId = new boolean[] {false} ;
      BC01S042_A11863DptoID = new short[1] ;
      BC01S042_n11863DptoID = new boolean[] {false} ;
      BC01S042_A11860CpteId = new short[1] ;
      BC01S042_n11860CpteId = new boolean[] {false} ;
      BC01S042_A11862DesaID = new short[1] ;
      BC01S042_n11862DesaID = new boolean[] {false} ;
      BC01S042_A12328RevenID = new String[] {""} ;
      BC01S042_n12328RevenID = new boolean[] {false} ;
      BC01S045_A13994E_DisCliDe = new short[1] ;
      BC01S045_n13994E_DisCliDe = new boolean[] {false} ;
      BC01S048_A13995E_DisArtCo = new short[1] ;
      BC01S048_n13995E_DisArtCo = new boolean[] {false} ;
      BC01S049_A279CliNom = new String[] {""} ;
      BC01S050_A396EmprCod = new String[] {""} ;
      BC01S051_A10888Dsc_Idtx = new String[] {""} ;
      BC01S051_n10888Dsc_Idtx = new boolean[] {false} ;
      BC01S052_A396EmprCod = new String[] {""} ;
      BC01S053_A11660MarcaDsc = new String[] {""} ;
      BC01S053_n11660MarcaDsc = new boolean[] {false} ;
      BC01S054_A11867DptoDsc = new String[] {""} ;
      BC01S054_n11867DptoDsc = new boolean[] {false} ;
      BC01S055_A11865CpteDsc = new String[] {""} ;
      BC01S055_n11865CpteDsc = new boolean[] {false} ;
      BC01S056_A11866DesaDsc = new String[] {""} ;
      BC01S056_n11866DesaDsc = new boolean[] {false} ;
      BC01S057_A12327RevenNm = new String[] {""} ;
      BC01S057_n12327RevenNm = new boolean[] {false} ;
      O335DisArtCod = "" ;
      BC01S060_A13994E_DisCliDe = new short[1] ;
      BC01S060_n13994E_DisCliDe = new boolean[] {false} ;
      BC01S063_A13995E_DisArtCo = new short[1] ;
      BC01S063_n13995E_DisArtCo = new boolean[] {false} ;
      BC01S064_A396EmprCod = new String[] {""} ;
      BC01S064_A361DisCod = new int[1] ;
      BC01S065_A361DisCod = new int[1] ;
      BC01S065_A2310DisCliDes = new int[1] ;
      BC01S065_A2009DisTipDis = new String[] {""} ;
      BC01S065_n2009DisTipDis = new boolean[] {false} ;
      BC01S065_A337DisArtDsc = new String[] {""} ;
      BC01S065_A340DisArtMat = new String[] {""} ;
      BC01S065_A2835DisPle2 = new String[] {""} ;
      BC01S065_A339DisArtLar = new String[] {""} ;
      BC01S065_A351DisArtSua = new String[] {""} ;
      BC01S065_A333DisArtAca = new String[] {""} ;
      BC01S065_A343DisArtPle = new String[] {""} ;
      BC01S065_A352DisArtTip = new short[1] ;
      BC01S065_A338DisArtEnc = new String[] {""} ;
      BC01S065_A336DisArtCor = new String[] {""} ;
      BC01S065_A353DisArtTr1 = new String[] {""} ;
      BC01S065_A354DisArtTr2 = new String[] {""} ;
      BC01S065_A355DisArtTr3 = new String[] {""} ;
      BC01S065_A344DisArtPt1 = new short[1] ;
      BC01S065_A345DisArtPt2 = new short[1] ;
      BC01S065_A346DisArtPt3 = new short[1] ;
      BC01S065_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S065_A359DisArtUrg = new byte[1] ;
      BC01S065_A356DisArtUr1 = new String[] {""} ;
      BC01S065_A357DisArtUr2 = new String[] {""} ;
      BC01S065_A358DisArtUr3 = new String[] {""} ;
      BC01S065_A347DisArtPu1 = new short[1] ;
      BC01S065_A348DisArtPu2 = new short[1] ;
      BC01S065_A349DisArtPu3 = new short[1] ;
      BC01S065_n349DisArtPu3 = new boolean[] {false} ;
      BC01S065_A342DisArtPes = new short[1] ;
      BC01S065_A1225DisGraCru = new short[1] ;
      BC01S065_A334DisArtAnh = new short[1] ;
      BC01S065_A1231DisArtAn1 = new short[1] ;
      BC01S065_A1232DisArtAcb = new short[1] ;
      BC01S065_A1233DisArtAc2 = new short[1] ;
      BC01S065_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S065_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S065_A3127DisNumCor = new short[1] ;
      BC01S065_A3128DisAncSal1 = new short[1] ;
      BC01S065_A3129DisAncSal2 = new short[1] ;
      BC01S065_A3130DisAncSal3 = new short[1] ;
      BC01S065_A3131DisGraAca2 = new short[1] ;
      BC01S065_A3132DisGraCru2 = new short[1] ;
      BC01S065_A1906DisGraAca = new short[1] ;
      BC01S065_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S065_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S065_A5349DisObsGrm = new String[] {""} ;
      BC01S065_A5350DisObsAnc = new String[] {""} ;
      BC01S065_A9786DisItem5 = new String[] {""} ;
      BC01S065_A392DisUniMed = new String[] {""} ;
      BC01S065_A757PriCod = new String[] {""} ;
      BC01S065_A4813DisEncCli = new String[] {""} ;
      BC01S065_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S065_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S065_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S065_A335DisArtCod = new String[] {""} ;
      BC01S065_A362DisColNom = new String[] {""} ;
      BC01S065_n362DisColNom = new boolean[] {false} ;
      BC01S065_A363DisColNum = new int[1] ;
      BC01S065_n363DisColNum = new boolean[] {false} ;
      BC01S065_A367DisEst = new byte[1] ;
      BC01S065_A365DisDes = new String[] {""} ;
      BC01S065_A13987DisArtDsc2 = new String[] {""} ;
      BC01S065_A11661DisOrdComp = new String[] {""} ;
      BC01S065_A12765DisPriorid = new byte[1] ;
      BC01S065_A11859Nxt_modelo = new String[] {""} ;
      BC01S065_A11861Nxt_statio = new String[] {""} ;
      BC01S065_A11864Nxt_artcli = new String[] {""} ;
      BC01S065_A7739DisExp = new String[] {""} ;
      BC01S065_A396EmprCod = new String[] {""} ;
      BC01S065_A252CliCod = new int[1] ;
      BC01S065_A390DisTipCol = new byte[1] ;
      BC01S065_n390DisTipCol = new boolean[] {false} ;
      BC01S065_A10887Cod_Idtx = new String[] {""} ;
      BC01S065_n10887Cod_Idtx = new boolean[] {false} ;
      BC01S065_A13986DisIdtx2 = new String[] {""} ;
      BC01S065_n13986DisIdtx2 = new boolean[] {false} ;
      BC01S065_A11659MarcaId = new String[] {""} ;
      BC01S065_n11659MarcaId = new boolean[] {false} ;
      BC01S065_A11863DptoID = new short[1] ;
      BC01S065_n11863DptoID = new boolean[] {false} ;
      BC01S065_A11860CpteId = new short[1] ;
      BC01S065_n11860CpteId = new boolean[] {false} ;
      BC01S065_A11862DesaID = new short[1] ;
      BC01S065_n11862DesaID = new boolean[] {false} ;
      BC01S065_A12328RevenID = new String[] {""} ;
      BC01S065_n12328RevenID = new boolean[] {false} ;
      BC01S066_A361DisCod = new int[1] ;
      BC01S066_A2310DisCliDes = new int[1] ;
      BC01S066_A2009DisTipDis = new String[] {""} ;
      BC01S066_n2009DisTipDis = new boolean[] {false} ;
      BC01S066_A337DisArtDsc = new String[] {""} ;
      BC01S066_A340DisArtMat = new String[] {""} ;
      BC01S066_A2835DisPle2 = new String[] {""} ;
      BC01S066_A339DisArtLar = new String[] {""} ;
      BC01S066_A351DisArtSua = new String[] {""} ;
      BC01S066_A333DisArtAca = new String[] {""} ;
      BC01S066_A343DisArtPle = new String[] {""} ;
      BC01S066_A352DisArtTip = new short[1] ;
      BC01S066_A338DisArtEnc = new String[] {""} ;
      BC01S066_A336DisArtCor = new String[] {""} ;
      BC01S066_A353DisArtTr1 = new String[] {""} ;
      BC01S066_A354DisArtTr2 = new String[] {""} ;
      BC01S066_A355DisArtTr3 = new String[] {""} ;
      BC01S066_A344DisArtPt1 = new short[1] ;
      BC01S066_A345DisArtPt2 = new short[1] ;
      BC01S066_A346DisArtPt3 = new short[1] ;
      BC01S066_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S066_A359DisArtUrg = new byte[1] ;
      BC01S066_A356DisArtUr1 = new String[] {""} ;
      BC01S066_A357DisArtUr2 = new String[] {""} ;
      BC01S066_A358DisArtUr3 = new String[] {""} ;
      BC01S066_A347DisArtPu1 = new short[1] ;
      BC01S066_A348DisArtPu2 = new short[1] ;
      BC01S066_A349DisArtPu3 = new short[1] ;
      BC01S066_n349DisArtPu3 = new boolean[] {false} ;
      BC01S066_A342DisArtPes = new short[1] ;
      BC01S066_A1225DisGraCru = new short[1] ;
      BC01S066_A334DisArtAnh = new short[1] ;
      BC01S066_A1231DisArtAn1 = new short[1] ;
      BC01S066_A1232DisArtAcb = new short[1] ;
      BC01S066_A1233DisArtAc2 = new short[1] ;
      BC01S066_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S066_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S066_A3127DisNumCor = new short[1] ;
      BC01S066_A3128DisAncSal1 = new short[1] ;
      BC01S066_A3129DisAncSal2 = new short[1] ;
      BC01S066_A3130DisAncSal3 = new short[1] ;
      BC01S066_A3131DisGraAca2 = new short[1] ;
      BC01S066_A3132DisGraCru2 = new short[1] ;
      BC01S066_A1906DisGraAca = new short[1] ;
      BC01S066_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S066_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S066_A5349DisObsGrm = new String[] {""} ;
      BC01S066_A5350DisObsAnc = new String[] {""} ;
      BC01S066_A9786DisItem5 = new String[] {""} ;
      BC01S066_A392DisUniMed = new String[] {""} ;
      BC01S066_A757PriCod = new String[] {""} ;
      BC01S066_A4813DisEncCli = new String[] {""} ;
      BC01S066_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S066_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S066_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S066_A335DisArtCod = new String[] {""} ;
      BC01S066_A362DisColNom = new String[] {""} ;
      BC01S066_n362DisColNom = new boolean[] {false} ;
      BC01S066_A363DisColNum = new int[1] ;
      BC01S066_n363DisColNum = new boolean[] {false} ;
      BC01S066_A367DisEst = new byte[1] ;
      BC01S066_A365DisDes = new String[] {""} ;
      BC01S066_A13987DisArtDsc2 = new String[] {""} ;
      BC01S066_A11661DisOrdComp = new String[] {""} ;
      BC01S066_A12765DisPriorid = new byte[1] ;
      BC01S066_A11859Nxt_modelo = new String[] {""} ;
      BC01S066_A11861Nxt_statio = new String[] {""} ;
      BC01S066_A11864Nxt_artcli = new String[] {""} ;
      BC01S066_A7739DisExp = new String[] {""} ;
      BC01S066_A396EmprCod = new String[] {""} ;
      BC01S066_A252CliCod = new int[1] ;
      BC01S066_A390DisTipCol = new byte[1] ;
      BC01S066_n390DisTipCol = new boolean[] {false} ;
      BC01S066_A10887Cod_Idtx = new String[] {""} ;
      BC01S066_n10887Cod_Idtx = new boolean[] {false} ;
      BC01S066_A13986DisIdtx2 = new String[] {""} ;
      BC01S066_n13986DisIdtx2 = new boolean[] {false} ;
      BC01S066_A11659MarcaId = new String[] {""} ;
      BC01S066_n11659MarcaId = new boolean[] {false} ;
      BC01S066_A11863DptoID = new short[1] ;
      BC01S066_n11863DptoID = new boolean[] {false} ;
      BC01S066_A11860CpteId = new short[1] ;
      BC01S066_n11860CpteId = new boolean[] {false} ;
      BC01S066_A11862DesaID = new short[1] ;
      BC01S066_n11862DesaID = new boolean[] {false} ;
      BC01S066_A12328RevenID = new String[] {""} ;
      BC01S066_n12328RevenID = new boolean[] {false} ;
      GXv_char46 = new String[1] ;
      GXv_char45 = new String[1] ;
      GXv_char44 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_int41 = new short[1] ;
      GXv_char16 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int40 = new short[1] ;
      GXv_int39 = new short[1] ;
      GXv_int38 = new short[1] ;
      GXv_decimal48 = new java.math.BigDecimal[1] ;
      GXv_int49 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int37 = new short[1] ;
      GXv_int36 = new short[1] ;
      GXv_int35 = new short[1] ;
      GXv_int34 = new short[1] ;
      GXv_int33 = new short[1] ;
      GXv_int32 = new short[1] ;
      GXv_int31 = new short[1] ;
      GXv_int30 = new short[1] ;
      GXv_int29 = new short[1] ;
      GXv_int28 = new short[1] ;
      GXv_int27 = new short[1] ;
      GXv_int26 = new short[1] ;
      GXv_int25 = new short[1] ;
      GXv_int24 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_decimal43 = new java.math.BigDecimal[1] ;
      GXv_decimal42 = new java.math.BigDecimal[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      BC01S072_A13994E_DisCliDe = new short[1] ;
      BC01S072_n13994E_DisCliDe = new boolean[] {false} ;
      BC01S073_A279CliNom = new String[] {""} ;
      BC01S076_A13995E_DisArtCo = new short[1] ;
      BC01S076_n13995E_DisArtCo = new boolean[] {false} ;
      GXt_char1 = "" ;
      BC01S077_A10888Dsc_Idtx = new String[] {""} ;
      BC01S077_n10888Dsc_Idtx = new boolean[] {false} ;
      BC01S078_A12327RevenNm = new String[] {""} ;
      BC01S078_n12327RevenNm = new boolean[] {false} ;
      BC01S079_A11660MarcaDsc = new String[] {""} ;
      BC01S079_n11660MarcaDsc = new boolean[] {false} ;
      BC01S080_A11865CpteDsc = new String[] {""} ;
      BC01S080_n11865CpteDsc = new boolean[] {false} ;
      BC01S081_A11866DesaDsc = new String[] {""} ;
      BC01S081_n11866DesaDsc = new boolean[] {false} ;
      BC01S082_A11867DptoDsc = new String[] {""} ;
      BC01S082_n11867DptoDsc = new boolean[] {false} ;
      BC01S083_A396EmprCod = new String[] {""} ;
      BC01S083_A361DisCod = new int[1] ;
      BC01S083_A13376DisTraID = new String[] {""} ;
      BC01S084_A396EmprCod = new String[] {""} ;
      BC01S084_A361DisCod = new int[1] ;
      BC01S084_A13081DisDGLin = new byte[1] ;
      BC01S084_A13082DisDGDibCl = new String[] {""} ;
      BC01S084_A13083DisDGDibIn = new int[1] ;
      BC01S084_A13084DisDGComb = new String[] {""} ;
      BC01S084_A13085DisDGFondo = new String[] {""} ;
      BC01S085_A396EmprCod = new String[] {""} ;
      BC01S085_A361DisCod = new int[1] ;
      BC01S085_A7068DisNotLin = new byte[1] ;
      BC01S086_A396EmprCod = new String[] {""} ;
      BC01S086_A361DisCod = new int[1] ;
      BC01S086_A10197ProEspCod = new String[] {""} ;
      BC01S087_A396EmprCod = new String[] {""} ;
      BC01S087_A361DisCod = new int[1] ;
      BC01S087_A4594AccCod = new short[1] ;
      BC01S088_A396EmprCod = new String[] {""} ;
      BC01S088_A361DisCod = new int[1] ;
      BC01S088_A2524DisComLin = new byte[1] ;
      BC01S088_A1056DisComCod = new String[] {""} ;
      BC01S088_A1032FonCod = new String[] {""} ;
      BC01S089_A396EmprCod = new String[] {""} ;
      BC01S089_A361DisCod = new int[1] ;
      BC01S089_A3398DisRefBarC = new int[1] ;
      BC01S089_A3399DisRefBCRe = new byte[1] ;
      BC01S089_A3400DisRefBCPa = new String[] {""} ;
      BC01S089_A3607DisRefBPie = new String[] {""} ;
      BC01S090_A396EmprCod = new String[] {""} ;
      BC01S090_A361DisCod = new int[1] ;
      BC01S090_A376DisObsLin = new byte[1] ;
      BC01S091_A396EmprCod = new String[] {""} ;
      BC01S091_A361DisCod = new int[1] ;
      BC01S091_A758ProCod = new String[] {""} ;
      BC01S092_A396EmprCod = new String[] {""} ;
      BC01S092_A129BarCod = new int[1] ;
      BC01S092_A132BarCodReo = new byte[1] ;
      BC01S092_A130BarCodPar = new String[] {""} ;
      BC01S093_A396EmprCod = new String[] {""} ;
      BC01S093_A361DisCod = new int[1] ;
      BC01S093_A44AlbRecCod = new int[1] ;
      BC01S093_A380DisPieCod = new String[] {""} ;
      BC01S094_A361DisCod = new int[1] ;
      BC01S094_A2310DisCliDes = new int[1] ;
      BC01S094_A2009DisTipDis = new String[] {""} ;
      BC01S094_n2009DisTipDis = new boolean[] {false} ;
      BC01S094_A337DisArtDsc = new String[] {""} ;
      BC01S094_A340DisArtMat = new String[] {""} ;
      BC01S094_A2835DisPle2 = new String[] {""} ;
      BC01S094_A339DisArtLar = new String[] {""} ;
      BC01S094_A351DisArtSua = new String[] {""} ;
      BC01S094_A333DisArtAca = new String[] {""} ;
      BC01S094_A343DisArtPle = new String[] {""} ;
      BC01S094_A352DisArtTip = new short[1] ;
      BC01S094_A338DisArtEnc = new String[] {""} ;
      BC01S094_A336DisArtCor = new String[] {""} ;
      BC01S094_A353DisArtTr1 = new String[] {""} ;
      BC01S094_A354DisArtTr2 = new String[] {""} ;
      BC01S094_A355DisArtTr3 = new String[] {""} ;
      BC01S094_A344DisArtPt1 = new short[1] ;
      BC01S094_A345DisArtPt2 = new short[1] ;
      BC01S094_A346DisArtPt3 = new short[1] ;
      BC01S094_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S094_A359DisArtUrg = new byte[1] ;
      BC01S094_A356DisArtUr1 = new String[] {""} ;
      BC01S094_A357DisArtUr2 = new String[] {""} ;
      BC01S094_A358DisArtUr3 = new String[] {""} ;
      BC01S094_A347DisArtPu1 = new short[1] ;
      BC01S094_A348DisArtPu2 = new short[1] ;
      BC01S094_A349DisArtPu3 = new short[1] ;
      BC01S094_n349DisArtPu3 = new boolean[] {false} ;
      BC01S094_A342DisArtPes = new short[1] ;
      BC01S094_A1225DisGraCru = new short[1] ;
      BC01S094_A334DisArtAnh = new short[1] ;
      BC01S094_A1231DisArtAn1 = new short[1] ;
      BC01S094_A1232DisArtAcb = new short[1] ;
      BC01S094_A1233DisArtAc2 = new short[1] ;
      BC01S094_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S094_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S094_A3127DisNumCor = new short[1] ;
      BC01S094_A3128DisAncSal1 = new short[1] ;
      BC01S094_A3129DisAncSal2 = new short[1] ;
      BC01S094_A3130DisAncSal3 = new short[1] ;
      BC01S094_A3131DisGraAca2 = new short[1] ;
      BC01S094_A3132DisGraCru2 = new short[1] ;
      BC01S094_A1906DisGraAca = new short[1] ;
      BC01S094_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S094_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S094_A5349DisObsGrm = new String[] {""} ;
      BC01S094_A5350DisObsAnc = new String[] {""} ;
      BC01S094_A9786DisItem5 = new String[] {""} ;
      BC01S094_A392DisUniMed = new String[] {""} ;
      BC01S094_A407EmprNom = new String[] {""} ;
      BC01S094_n407EmprNom = new boolean[] {false} ;
      BC01S094_A757PriCod = new String[] {""} ;
      BC01S094_A4813DisEncCli = new String[] {""} ;
      BC01S094_A279CliNom = new String[] {""} ;
      BC01S094_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S094_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S094_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01S094_A335DisArtCod = new String[] {""} ;
      BC01S094_A362DisColNom = new String[] {""} ;
      BC01S094_n362DisColNom = new boolean[] {false} ;
      BC01S094_A363DisColNum = new int[1] ;
      BC01S094_n363DisColNum = new boolean[] {false} ;
      BC01S094_A367DisEst = new byte[1] ;
      BC01S094_A365DisDes = new String[] {""} ;
      BC01S094_A13987DisArtDsc2 = new String[] {""} ;
      BC01S094_A10888Dsc_Idtx = new String[] {""} ;
      BC01S094_n10888Dsc_Idtx = new boolean[] {false} ;
      BC01S094_A11661DisOrdComp = new String[] {""} ;
      BC01S094_A12327RevenNm = new String[] {""} ;
      BC01S094_n12327RevenNm = new boolean[] {false} ;
      BC01S094_A11660MarcaDsc = new String[] {""} ;
      BC01S094_n11660MarcaDsc = new boolean[] {false} ;
      BC01S094_A12765DisPriorid = new byte[1] ;
      BC01S094_A11859Nxt_modelo = new String[] {""} ;
      BC01S094_A11865CpteDsc = new String[] {""} ;
      BC01S094_n11865CpteDsc = new boolean[] {false} ;
      BC01S094_A11861Nxt_statio = new String[] {""} ;
      BC01S094_A11866DesaDsc = new String[] {""} ;
      BC01S094_n11866DesaDsc = new boolean[] {false} ;
      BC01S094_A11867DptoDsc = new String[] {""} ;
      BC01S094_n11867DptoDsc = new boolean[] {false} ;
      BC01S094_A11864Nxt_artcli = new String[] {""} ;
      BC01S094_A7739DisExp = new String[] {""} ;
      BC01S094_A396EmprCod = new String[] {""} ;
      BC01S094_A252CliCod = new int[1] ;
      BC01S094_A390DisTipCol = new byte[1] ;
      BC01S094_n390DisTipCol = new boolean[] {false} ;
      BC01S094_A10887Cod_Idtx = new String[] {""} ;
      BC01S094_n10887Cod_Idtx = new boolean[] {false} ;
      BC01S094_A13986DisIdtx2 = new String[] {""} ;
      BC01S094_n13986DisIdtx2 = new boolean[] {false} ;
      BC01S094_A11659MarcaId = new String[] {""} ;
      BC01S094_n11659MarcaId = new boolean[] {false} ;
      BC01S094_A11863DptoID = new short[1] ;
      BC01S094_n11863DptoID = new boolean[] {false} ;
      BC01S094_A11860CpteId = new short[1] ;
      BC01S094_n11860CpteId = new boolean[] {false} ;
      BC01S094_A11862DesaID = new short[1] ;
      BC01S094_n11862DesaID = new boolean[] {false} ;
      BC01S094_A12328RevenID = new String[] {""} ;
      BC01S094_n12328RevenID = new boolean[] {false} ;
      Z13214DisNormSt = "" ;
      A13214DisNormSt = "" ;
      Z13215DisNormNC = "" ;
      A13215DisNormNC = "" ;
      Z13216DisNormDsc = "" ;
      A13216DisNormDsc = "" ;
      Z13213DisNormID = "" ;
      A13213DisNormID = "" ;
      BC01S095_A361DisCod = new int[1] ;
      BC01S095_A13216DisNormDsc = new String[] {""} ;
      BC01S095_n13216DisNormDsc = new boolean[] {false} ;
      BC01S095_A13214DisNormSt = new String[] {""} ;
      BC01S095_A13215DisNormNC = new String[] {""} ;
      BC01S095_A396EmprCod = new String[] {""} ;
      BC01S095_A13213DisNormID = new String[] {""} ;
      BC01S096_A13216DisNormDsc = new String[] {""} ;
      BC01S096_n13216DisNormDsc = new boolean[] {false} ;
      BC01S097_A396EmprCod = new String[] {""} ;
      BC01S097_A361DisCod = new int[1] ;
      BC01S097_A13213DisNormID = new String[] {""} ;
      BC01S098_A361DisCod = new int[1] ;
      BC01S098_A13214DisNormSt = new String[] {""} ;
      BC01S098_A13215DisNormNC = new String[] {""} ;
      BC01S098_A396EmprCod = new String[] {""} ;
      BC01S098_A13213DisNormID = new String[] {""} ;
      sMode1812 = "" ;
      BC01S099_A361DisCod = new int[1] ;
      BC01S099_A13214DisNormSt = new String[] {""} ;
      BC01S099_A13215DisNormNC = new String[] {""} ;
      BC01S099_A396EmprCod = new String[] {""} ;
      BC01S099_A13213DisNormID = new String[] {""} ;
      BC01S0103_A13216DisNormDsc = new String[] {""} ;
      BC01S0103_n13216DisNormDsc = new boolean[] {false} ;
      BC01S0104_A361DisCod = new int[1] ;
      BC01S0104_A13216DisNormDsc = new String[] {""} ;
      BC01S0104_n13216DisNormDsc = new boolean[] {false} ;
      BC01S0104_A13214DisNormSt = new String[] {""} ;
      BC01S0104_A13215DisNormNC = new String[] {""} ;
      BC01S0104_A396EmprCod = new String[] {""} ;
      BC01S0104_A13213DisNormID = new String[] {""} ;
      Z595Kilos = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Z3613AlbRefDsc = "" ;
      A3613AlbRefDsc = "" ;
      Z55AlbRReo = "" ;
      A55AlbRReo = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      BC01S0105_A361DisCod = new int[1] ;
      BC01S0105_A3613AlbRefDsc = new String[] {""} ;
      BC01S0105_A55AlbRReo = new String[] {""} ;
      BC01S0105_A673Piezas = new int[1] ;
      BC01S0105_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0105_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0105_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0105_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0105_A52AlbRPieEnt = new int[1] ;
      BC01S0105_A54AlbRPieUti = new int[1] ;
      BC01S0105_A396EmprCod = new String[] {""} ;
      BC01S0105_A44AlbRecCod = new int[1] ;
      BC01S0106_A3613AlbRefDsc = new String[] {""} ;
      BC01S0106_A55AlbRReo = new String[] {""} ;
      BC01S0106_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0106_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0106_A52AlbRPieEnt = new int[1] ;
      BC01S0106_A54AlbRPieUti = new int[1] ;
      BC01S0107_A396EmprCod = new String[] {""} ;
      BC01S0107_A361DisCod = new int[1] ;
      BC01S0107_A44AlbRecCod = new int[1] ;
      BC01S0108_A361DisCod = new int[1] ;
      BC01S0108_A673Piezas = new int[1] ;
      BC01S0108_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0108_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0108_A396EmprCod = new String[] {""} ;
      BC01S0108_A44AlbRecCod = new int[1] ;
      sMode35 = "" ;
      BC01S0109_A361DisCod = new int[1] ;
      BC01S0109_A673Piezas = new int[1] ;
      BC01S0109_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0109_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0109_A396EmprCod = new String[] {""} ;
      BC01S0109_A44AlbRecCod = new int[1] ;
      BC01S0113_A3613AlbRefDsc = new String[] {""} ;
      BC01S0113_A55AlbRReo = new String[] {""} ;
      BC01S0113_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0113_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0113_A52AlbRPieEnt = new int[1] ;
      BC01S0113_A54AlbRPieUti = new int[1] ;
      BC01S0114_A396EmprCod = new String[] {""} ;
      BC01S0114_A361DisCod = new int[1] ;
      BC01S0114_A44AlbRecCod = new int[1] ;
      BC01S0114_A9756Dis_CUb = new String[] {""} ;
      BC01S0115_A396EmprCod = new String[] {""} ;
      BC01S0115_A361DisCod = new int[1] ;
      BC01S0115_A44AlbRecCod = new int[1] ;
      BC01S0115_A380DisPieCod = new String[] {""} ;
      BC01S0116_A361DisCod = new int[1] ;
      BC01S0116_A3613AlbRefDsc = new String[] {""} ;
      BC01S0116_A55AlbRReo = new String[] {""} ;
      BC01S0116_A673Piezas = new int[1] ;
      BC01S0116_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0116_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0116_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0116_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01S0116_A52AlbRPieEnt = new int[1] ;
      BC01S0116_A54AlbRPieUti = new int[1] ;
      BC01S0116_A396EmprCod = new String[] {""} ;
      BC01S0116_A44AlbRecCod = new int[1] ;
      Z834TipDefDsc = "" ;
      A834TipDefDsc = "" ;
      BC01S0117_A361DisCod = new int[1] ;
      BC01S0117_A834TipDefDsc = new String[] {""} ;
      BC01S0117_n834TipDefDsc = new boolean[] {false} ;
      BC01S0117_A319DefPor = new short[1] ;
      BC01S0117_A396EmprCod = new String[] {""} ;
      BC01S0117_A833TipDefCod = new short[1] ;
      BC01S0117_n833TipDefCod = new boolean[] {false} ;
      BC01S0118_A834TipDefDsc = new String[] {""} ;
      BC01S0118_n834TipDefDsc = new boolean[] {false} ;
      BC01S0119_A396EmprCod = new String[] {""} ;
      BC01S0119_A361DisCod = new int[1] ;
      BC01S0119_A833TipDefCod = new short[1] ;
      BC01S0119_n833TipDefCod = new boolean[] {false} ;
      BC01S0120_A361DisCod = new int[1] ;
      BC01S0120_A319DefPor = new short[1] ;
      BC01S0120_A396EmprCod = new String[] {""} ;
      BC01S0120_A833TipDefCod = new short[1] ;
      BC01S0120_n833TipDefCod = new boolean[] {false} ;
      sMode37 = "" ;
      BC01S0121_A361DisCod = new int[1] ;
      BC01S0121_A319DefPor = new short[1] ;
      BC01S0121_A396EmprCod = new String[] {""} ;
      BC01S0121_A833TipDefCod = new short[1] ;
      BC01S0121_n833TipDefCod = new boolean[] {false} ;
      BC01S0125_A834TipDefDsc = new String[] {""} ;
      BC01S0125_n834TipDefDsc = new boolean[] {false} ;
      BC01S0126_A396EmprCod = new String[] {""} ;
      BC01S0126_A129BarCod = new int[1] ;
      BC01S0126_A132BarCodReo = new byte[1] ;
      BC01S0126_A130BarCodPar = new String[] {""} ;
      BC01S0127_A361DisCod = new int[1] ;
      BC01S0127_A834TipDefDsc = new String[] {""} ;
      BC01S0127_n834TipDefDsc = new boolean[] {false} ;
      BC01S0127_A319DefPor = new short[1] ;
      BC01S0127_A396EmprCod = new String[] {""} ;
      BC01S0127_A833TipDefCod = new short[1] ;
      BC01S0127_n833TipDefCod = new boolean[] {false} ;
      Z759ProDsc = "" ;
      A759ProDsc = "" ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      BC01S0128_A361DisCod = new int[1] ;
      BC01S0128_A759ProDsc = new String[] {""} ;
      BC01S0128_A846UltFasLin = new short[1] ;
      BC01S0128_A396EmprCod = new String[] {""} ;
      BC01S0128_A758ProCod = new String[] {""} ;
      BC01S0129_A759ProDsc = new String[] {""} ;
      BC01S0130_A396EmprCod = new String[] {""} ;
      BC01S0130_A361DisCod = new int[1] ;
      BC01S0130_A758ProCod = new String[] {""} ;
      BC01S0131_A361DisCod = new int[1] ;
      BC01S0131_A846UltFasLin = new short[1] ;
      BC01S0131_A396EmprCod = new String[] {""} ;
      BC01S0131_A758ProCod = new String[] {""} ;
      BC01S0132_A361DisCod = new int[1] ;
      BC01S0132_A846UltFasLin = new short[1] ;
      BC01S0132_A396EmprCod = new String[] {""} ;
      BC01S0132_A758ProCod = new String[] {""} ;
      BC01S0136_A759ProDsc = new String[] {""} ;
      BC01S0137_A396EmprCod = new String[] {""} ;
      BC01S0137_A361DisCod = new int[1] ;
      BC01S0137_A758ProCod = new String[] {""} ;
      BC01S0137_A368DisFasLin = new short[1] ;
      BC01S0138_A361DisCod = new int[1] ;
      BC01S0138_A759ProDsc = new String[] {""} ;
      BC01S0138_A846UltFasLin = new short[1] ;
      BC01S0138_A396EmprCod = new String[] {""} ;
      BC01S0138_A758ProCod = new String[] {""} ;
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z460FasDsc = "" ;
      A460FasDsc = "" ;
      BC01S0139_A361DisCod = new int[1] ;
      BC01S0139_A758ProCod = new String[] {""} ;
      BC01S0139_A368DisFasLin = new short[1] ;
      BC01S0139_A460FasDsc = new String[] {""} ;
      BC01S0139_A5376DisQuiUl = new short[1] ;
      BC01S0139_A7744FasPreObl = new byte[1] ;
      BC01S0139_n7744FasPreObl = new boolean[] {false} ;
      BC01S0139_A396EmprCod = new String[] {""} ;
      BC01S0139_A457FasCod = new String[] {""} ;
      BC01S0140_A460FasDsc = new String[] {""} ;
      BC01S0140_A7744FasPreObl = new byte[1] ;
      BC01S0140_n7744FasPreObl = new boolean[] {false} ;
      BC01S0141_A396EmprCod = new String[] {""} ;
      BC01S0141_A361DisCod = new int[1] ;
      BC01S0141_A758ProCod = new String[] {""} ;
      BC01S0141_A368DisFasLin = new short[1] ;
      BC01S0142_A361DisCod = new int[1] ;
      BC01S0142_A758ProCod = new String[] {""} ;
      BC01S0142_A368DisFasLin = new short[1] ;
      BC01S0142_A5376DisQuiUl = new short[1] ;
      BC01S0142_A396EmprCod = new String[] {""} ;
      BC01S0142_A457FasCod = new String[] {""} ;
      BC01S0143_A361DisCod = new int[1] ;
      BC01S0143_A758ProCod = new String[] {""} ;
      BC01S0143_A368DisFasLin = new short[1] ;
      BC01S0143_A5376DisQuiUl = new short[1] ;
      BC01S0143_A396EmprCod = new String[] {""} ;
      BC01S0143_A457FasCod = new String[] {""} ;
      BC01S0147_A460FasDsc = new String[] {""} ;
      BC01S0147_A7744FasPreObl = new byte[1] ;
      BC01S0147_n7744FasPreObl = new boolean[] {false} ;
      BC01S0148_A396EmprCod = new String[] {""} ;
      BC01S0148_A361DisCod = new int[1] ;
      BC01S0148_A758ProCod = new String[] {""} ;
      BC01S0148_A368DisFasLin = new short[1] ;
      BC01S0148_A7919Dta_Ordl = new short[1] ;
      BC01S0149_A396EmprCod = new String[] {""} ;
      BC01S0149_A361DisCod = new int[1] ;
      BC01S0149_A758ProCod = new String[] {""} ;
      BC01S0149_A368DisFasLin = new short[1] ;
      BC01S0149_A7727ArtAdiCod = new short[1] ;
      BC01S0150_A396EmprCod = new String[] {""} ;
      BC01S0150_A361DisCod = new int[1] ;
      BC01S0150_A758ProCod = new String[] {""} ;
      BC01S0150_A368DisFasLin = new short[1] ;
      BC01S0150_A5035A_Discod = new int[1] ;
      BC01S0150_A5038A_DProcod = new String[] {""} ;
      BC01S0150_A5039A_DOrdlin = new short[1] ;
      BC01S0151_A361DisCod = new int[1] ;
      BC01S0151_A758ProCod = new String[] {""} ;
      BC01S0151_A368DisFasLin = new short[1] ;
      BC01S0151_A460FasDsc = new String[] {""} ;
      BC01S0151_A5376DisQuiUl = new short[1] ;
      BC01S0151_A7744FasPreObl = new byte[1] ;
      BC01S0151_n7744FasPreObl = new boolean[] {false} ;
      BC01S0151_A396EmprCod = new String[] {""} ;
      BC01S0151_A457FasCod = new String[] {""} ;
      Z764ProForCod = "" ;
      A764ProForCod = "" ;
      Z766ProForDsc = "" ;
      A766ProForDsc = "" ;
      BC01S0152_A361DisCod = new int[1] ;
      BC01S0152_A758ProCod = new String[] {""} ;
      BC01S0152_A368DisFasLin = new short[1] ;
      BC01S0152_A5377DisQuiLin = new short[1] ;
      BC01S0152_A766ProForDsc = new String[] {""} ;
      BC01S0152_A396EmprCod = new String[] {""} ;
      BC01S0152_A764ProForCod = new String[] {""} ;
      BC01S0153_A766ProForDsc = new String[] {""} ;
      BC01S0154_A396EmprCod = new String[] {""} ;
      BC01S0154_A361DisCod = new int[1] ;
      BC01S0154_A758ProCod = new String[] {""} ;
      BC01S0154_A368DisFasLin = new short[1] ;
      BC01S0154_A5377DisQuiLin = new short[1] ;
      BC01S0155_A361DisCod = new int[1] ;
      BC01S0155_A758ProCod = new String[] {""} ;
      BC01S0155_A368DisFasLin = new short[1] ;
      BC01S0155_A5377DisQuiLin = new short[1] ;
      BC01S0155_A396EmprCod = new String[] {""} ;
      BC01S0155_A764ProForCod = new String[] {""} ;
      sMode780 = "" ;
      BC01S0156_A361DisCod = new int[1] ;
      BC01S0156_A758ProCod = new String[] {""} ;
      BC01S0156_A368DisFasLin = new short[1] ;
      BC01S0156_A5377DisQuiLin = new short[1] ;
      BC01S0156_A396EmprCod = new String[] {""} ;
      BC01S0156_A764ProForCod = new String[] {""} ;
      BC01S0160_A766ProForDsc = new String[] {""} ;
      BC01S0161_A361DisCod = new int[1] ;
      BC01S0161_A758ProCod = new String[] {""} ;
      BC01S0161_A368DisFasLin = new short[1] ;
      BC01S0161_A5377DisQuiLin = new short[1] ;
      BC01S0161_A766ProForDsc = new String[] {""} ;
      BC01S0161_A396EmprCod = new String[] {""} ;
      BC01S0161_A764ProForCod = new String[] {""} ;
      Z12672DisParVl2 = "" ;
      A12672DisParVl2 = "" ;
      Z3686DisParObs = "" ;
      A3686DisParObs = "" ;
      BC01S0162_A361DisCod = new int[1] ;
      BC01S0162_A758ProCod = new String[] {""} ;
      BC01S0162_A368DisFasLin = new short[1] ;
      BC01S0162_A12672DisParVl2 = new String[] {""} ;
      BC01S0162_A3686DisParObs = new String[] {""} ;
      BC01S0162_A396EmprCod = new String[] {""} ;
      BC01S0162_A1664ParFasCod = new short[1] ;
      BC01S0163_A396EmprCod = new String[] {""} ;
      BC01S0164_A396EmprCod = new String[] {""} ;
      BC01S0164_A361DisCod = new int[1] ;
      BC01S0164_A758ProCod = new String[] {""} ;
      BC01S0164_A368DisFasLin = new short[1] ;
      BC01S0164_A1664ParFasCod = new short[1] ;
      BC01S0165_A361DisCod = new int[1] ;
      BC01S0165_A758ProCod = new String[] {""} ;
      BC01S0165_A368DisFasLin = new short[1] ;
      BC01S0165_A12672DisParVl2 = new String[] {""} ;
      BC01S0165_A3686DisParObs = new String[] {""} ;
      BC01S0165_A396EmprCod = new String[] {""} ;
      BC01S0165_A1664ParFasCod = new short[1] ;
      sMode517 = "" ;
      BC01S0166_A361DisCod = new int[1] ;
      BC01S0166_A758ProCod = new String[] {""} ;
      BC01S0166_A368DisFasLin = new short[1] ;
      BC01S0166_A12672DisParVl2 = new String[] {""} ;
      BC01S0166_A3686DisParObs = new String[] {""} ;
      BC01S0166_A396EmprCod = new String[] {""} ;
      BC01S0166_A1664ParFasCod = new short[1] ;
      GXv_char47 = new String[1] ;
      GXv_int50 = new int[1] ;
      BC01S0170_A361DisCod = new int[1] ;
      BC01S0170_A758ProCod = new String[] {""} ;
      BC01S0170_A368DisFasLin = new short[1] ;
      BC01S0170_A12672DisParVl2 = new String[] {""} ;
      BC01S0170_A3686DisParObs = new String[] {""} ;
      BC01S0170_A396EmprCod = new String[] {""} ;
      BC01S0170_A1664ParFasCod = new short[1] ;
      i369DisFec = GXutil.nullDate() ;
      i370DisFecCli = GXutil.nullDate() ;
      i365DisDes = "" ;
      i757PriCod = "" ;
      i7739DisExp = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01S0171_A407EmprNom = new String[] {""} ;
      BC01S0171_n407EmprNom = new boolean[] {false} ;
      BC01S0174_A13994E_DisCliDe = new short[1] ;
      BC01S0174_n13994E_DisCliDe = new boolean[] {false} ;
      BC01S0175_A407EmprNom = new String[] {""} ;
      BC01S0175_n407EmprNom = new boolean[] {false} ;
      BC01S0178_A13994E_DisCliDe = new short[1] ;
      BC01S0178_n13994E_DisCliDe = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.pedido_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.pedido_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.pedido_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.pedido_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.pedido_bc__default(),
         new Object[] {
             new Object[] {
            BC01S02_A361DisCod, BC01S02_A758ProCod, BC01S02_A368DisFasLin, BC01S02_A12672DisParVl2, BC01S02_A3686DisParObs, BC01S02_A396EmprCod, BC01S02_A1664ParFasCod
            }
            , new Object[] {
            BC01S03_A361DisCod, BC01S03_A758ProCod, BC01S03_A368DisFasLin, BC01S03_A12672DisParVl2, BC01S03_A3686DisParObs, BC01S03_A396EmprCod, BC01S03_A1664ParFasCod
            }
            , new Object[] {
            BC01S04_A396EmprCod
            }
            , new Object[] {
            BC01S05_A361DisCod, BC01S05_A758ProCod, BC01S05_A368DisFasLin, BC01S05_A5377DisQuiLin, BC01S05_A396EmprCod, BC01S05_A764ProForCod
            }
            , new Object[] {
            BC01S06_A361DisCod, BC01S06_A758ProCod, BC01S06_A368DisFasLin, BC01S06_A5377DisQuiLin, BC01S06_A396EmprCod, BC01S06_A764ProForCod
            }
            , new Object[] {
            BC01S07_A766ProForDsc
            }
            , new Object[] {
            BC01S08_A361DisCod, BC01S08_A758ProCod, BC01S08_A368DisFasLin, BC01S08_A5376DisQuiUl, BC01S08_A396EmprCod, BC01S08_A457FasCod, BC01S08_A7744FasPreObl, BC01S08_n7744FasPreObl
            }
            , new Object[] {
            BC01S09_A361DisCod, BC01S09_A758ProCod, BC01S09_A368DisFasLin, BC01S09_A5376DisQuiUl, BC01S09_A396EmprCod, BC01S09_A457FasCod, BC01S09_A7744FasPreObl, BC01S09_n7744FasPreObl
            }
            , new Object[] {
            BC01S010_A460FasDsc, BC01S010_A7744FasPreObl, BC01S010_n7744FasPreObl
            }
            , new Object[] {
            BC01S011_A361DisCod, BC01S011_A846UltFasLin, BC01S011_A396EmprCod, BC01S011_A758ProCod
            }
            , new Object[] {
            BC01S012_A361DisCod, BC01S012_A846UltFasLin, BC01S012_A396EmprCod, BC01S012_A758ProCod
            }
            , new Object[] {
            BC01S013_A759ProDsc
            }
            , new Object[] {
            BC01S014_A361DisCod, BC01S014_A319DefPor, BC01S014_A396EmprCod, BC01S014_A833TipDefCod
            }
            , new Object[] {
            BC01S015_A361DisCod, BC01S015_A319DefPor, BC01S015_A396EmprCod, BC01S015_A833TipDefCod
            }
            , new Object[] {
            BC01S016_A834TipDefDsc, BC01S016_n834TipDefDsc
            }
            , new Object[] {
            BC01S017_A361DisCod, BC01S017_A673Piezas, BC01S017_A595Kilos, BC01S017_A631Metros, BC01S017_A396EmprCod, BC01S017_A44AlbRecCod
            }
            , new Object[] {
            BC01S018_A361DisCod, BC01S018_A673Piezas, BC01S018_A595Kilos, BC01S018_A631Metros, BC01S018_A396EmprCod, BC01S018_A44AlbRecCod
            }
            , new Object[] {
            BC01S019_A3613AlbRefDsc, BC01S019_A55AlbRReo, BC01S019_A58AlbRUniEnt, BC01S019_A60AlbRUniUti, BC01S019_A52AlbRPieEnt, BC01S019_A54AlbRPieUti
            }
            , new Object[] {
            BC01S020_A361DisCod, BC01S020_A13214DisNormSt, BC01S020_A13215DisNormNC, BC01S020_A396EmprCod, BC01S020_A13213DisNormID
            }
            , new Object[] {
            BC01S021_A361DisCod, BC01S021_A13214DisNormSt, BC01S021_A13215DisNormNC, BC01S021_A396EmprCod, BC01S021_A13213DisNormID
            }
            , new Object[] {
            BC01S022_A13216DisNormDsc, BC01S022_n13216DisNormDsc
            }
            , new Object[] {
            BC01S023_A361DisCod, BC01S023_A2310DisCliDes, BC01S023_A2009DisTipDis, BC01S023_n2009DisTipDis, BC01S023_A337DisArtDsc, BC01S023_A340DisArtMat, BC01S023_A2835DisPle2, BC01S023_A339DisArtLar, BC01S023_A351DisArtSua, BC01S023_A333DisArtAca,
            BC01S023_A343DisArtPle, BC01S023_A352DisArtTip, BC01S023_A338DisArtEnc, BC01S023_A336DisArtCor, BC01S023_A353DisArtTr1, BC01S023_A354DisArtTr2, BC01S023_A355DisArtTr3, BC01S023_A344DisArtPt1, BC01S023_A345DisArtPt2, BC01S023_A346DisArtPt3,
            BC01S023_A350DisArtRdt, BC01S023_A359DisArtUrg, BC01S023_A356DisArtUr1, BC01S023_A357DisArtUr2, BC01S023_A358DisArtUr3, BC01S023_A347DisArtPu1, BC01S023_A348DisArtPu2, BC01S023_A349DisArtPu3, BC01S023_n349DisArtPu3, BC01S023_A342DisArtPes,
            BC01S023_A1225DisGraCru, BC01S023_A334DisArtAnh, BC01S023_A1231DisArtAn1, BC01S023_A1232DisArtAcb, BC01S023_A1233DisArtAc2, BC01S023_A1197DisEncCom, BC01S023_A1198DisEncAnh, BC01S023_A3127DisNumCor, BC01S023_A3128DisAncSal1, BC01S023_A3129DisAncSal2,
            BC01S023_A3130DisAncSal3, BC01S023_A3131DisGraAca2, BC01S023_A3132DisGraCru2, BC01S023_A1906DisGraAca, BC01S023_A1908DisRdoA, BC01S023_A1907DisRdoN, BC01S023_A5349DisObsGrm, BC01S023_A5350DisObsAnc, BC01S023_A9786DisItem5, BC01S023_A392DisUniMed,
            BC01S023_A757PriCod, BC01S023_A4813DisEncCli, BC01S023_A369DisFec, BC01S023_A370DisFecCli, BC01S023_A371DisFecEnt, BC01S023_A335DisArtCod, BC01S023_A362DisColNom, BC01S023_n362DisColNom, BC01S023_A363DisColNum, BC01S023_n363DisColNum,
            BC01S023_A367DisEst, BC01S023_A365DisDes, BC01S023_A13987DisArtDsc2, BC01S023_A11661DisOrdComp, BC01S023_A12765DisPriorid, BC01S023_A11859Nxt_modelo, BC01S023_A11861Nxt_statio, BC01S023_A11864Nxt_artcli, BC01S023_A7739DisExp, BC01S023_A396EmprCod,
            BC01S023_A252CliCod, BC01S023_A390DisTipCol, BC01S023_n390DisTipCol, BC01S023_A10887Cod_Idtx, BC01S023_n10887Cod_Idtx, BC01S023_A13986DisIdtx2, BC01S023_n13986DisIdtx2, BC01S023_A11659MarcaId, BC01S023_n11659MarcaId, BC01S023_A11863DptoID,
            BC01S023_n11863DptoID, BC01S023_A11860CpteId, BC01S023_n11860CpteId, BC01S023_A11862DesaID, BC01S023_n11862DesaID, BC01S023_A12328RevenID, BC01S023_n12328RevenID
            }
            , new Object[] {
            BC01S024_A361DisCod, BC01S024_A2310DisCliDes, BC01S024_A2009DisTipDis, BC01S024_n2009DisTipDis, BC01S024_A337DisArtDsc, BC01S024_A340DisArtMat, BC01S024_A2835DisPle2, BC01S024_A339DisArtLar, BC01S024_A351DisArtSua, BC01S024_A333DisArtAca,
            BC01S024_A343DisArtPle, BC01S024_A352DisArtTip, BC01S024_A338DisArtEnc, BC01S024_A336DisArtCor, BC01S024_A353DisArtTr1, BC01S024_A354DisArtTr2, BC01S024_A355DisArtTr3, BC01S024_A344DisArtPt1, BC01S024_A345DisArtPt2, BC01S024_A346DisArtPt3,
            BC01S024_A350DisArtRdt, BC01S024_A359DisArtUrg, BC01S024_A356DisArtUr1, BC01S024_A357DisArtUr2, BC01S024_A358DisArtUr3, BC01S024_A347DisArtPu1, BC01S024_A348DisArtPu2, BC01S024_A349DisArtPu3, BC01S024_n349DisArtPu3, BC01S024_A342DisArtPes,
            BC01S024_A1225DisGraCru, BC01S024_A334DisArtAnh, BC01S024_A1231DisArtAn1, BC01S024_A1232DisArtAcb, BC01S024_A1233DisArtAc2, BC01S024_A1197DisEncCom, BC01S024_A1198DisEncAnh, BC01S024_A3127DisNumCor, BC01S024_A3128DisAncSal1, BC01S024_A3129DisAncSal2,
            BC01S024_A3130DisAncSal3, BC01S024_A3131DisGraAca2, BC01S024_A3132DisGraCru2, BC01S024_A1906DisGraAca, BC01S024_A1908DisRdoA, BC01S024_A1907DisRdoN, BC01S024_A5349DisObsGrm, BC01S024_A5350DisObsAnc, BC01S024_A9786DisItem5, BC01S024_A392DisUniMed,
            BC01S024_A757PriCod, BC01S024_A4813DisEncCli, BC01S024_A369DisFec, BC01S024_A370DisFecCli, BC01S024_A371DisFecEnt, BC01S024_A335DisArtCod, BC01S024_A362DisColNom, BC01S024_n362DisColNom, BC01S024_A363DisColNum, BC01S024_n363DisColNum,
            BC01S024_A367DisEst, BC01S024_A365DisDes, BC01S024_A13987DisArtDsc2, BC01S024_A11661DisOrdComp, BC01S024_A12765DisPriorid, BC01S024_A11859Nxt_modelo, BC01S024_A11861Nxt_statio, BC01S024_A11864Nxt_artcli, BC01S024_A7739DisExp, BC01S024_A396EmprCod,
            BC01S024_A252CliCod, BC01S024_A390DisTipCol, BC01S024_n390DisTipCol, BC01S024_A10887Cod_Idtx, BC01S024_n10887Cod_Idtx, BC01S024_A13986DisIdtx2, BC01S024_n13986DisIdtx2, BC01S024_A11659MarcaId, BC01S024_n11659MarcaId, BC01S024_A11863DptoID,
            BC01S024_n11863DptoID, BC01S024_A11860CpteId, BC01S024_n11860CpteId, BC01S024_A11862DesaID, BC01S024_n11862DesaID, BC01S024_A12328RevenID, BC01S024_n12328RevenID
            }
            , new Object[] {
            BC01S027_A13994E_DisCliDe, BC01S027_n13994E_DisCliDe
            }
            , new Object[] {
            BC01S030_A13995E_DisArtCo, BC01S030_n13995E_DisArtCo
            }
            , new Object[] {
            BC01S031_A407EmprNom, BC01S031_n407EmprNom
            }
            , new Object[] {
            BC01S032_A279CliNom
            }
            , new Object[] {
            BC01S033_A396EmprCod
            }
            , new Object[] {
            BC01S034_A10888Dsc_Idtx, BC01S034_n10888Dsc_Idtx
            }
            , new Object[] {
            BC01S035_A396EmprCod
            }
            , new Object[] {
            BC01S036_A11660MarcaDsc, BC01S036_n11660MarcaDsc
            }
            , new Object[] {
            BC01S037_A11867DptoDsc, BC01S037_n11867DptoDsc
            }
            , new Object[] {
            BC01S038_A11865CpteDsc, BC01S038_n11865CpteDsc
            }
            , new Object[] {
            BC01S039_A11866DesaDsc, BC01S039_n11866DesaDsc
            }
            , new Object[] {
            BC01S040_A12327RevenNm, BC01S040_n12327RevenNm
            }
            , new Object[] {
            BC01S041_A407EmprNom, BC01S041_n407EmprNom
            }
            , new Object[] {
            BC01S042_A361DisCod, BC01S042_A2310DisCliDes, BC01S042_A2009DisTipDis, BC01S042_n2009DisTipDis, BC01S042_A337DisArtDsc, BC01S042_A340DisArtMat, BC01S042_A2835DisPle2, BC01S042_A339DisArtLar, BC01S042_A351DisArtSua, BC01S042_A333DisArtAca,
            BC01S042_A343DisArtPle, BC01S042_A352DisArtTip, BC01S042_A338DisArtEnc, BC01S042_A336DisArtCor, BC01S042_A353DisArtTr1, BC01S042_A354DisArtTr2, BC01S042_A355DisArtTr3, BC01S042_A344DisArtPt1, BC01S042_A345DisArtPt2, BC01S042_A346DisArtPt3,
            BC01S042_A350DisArtRdt, BC01S042_A359DisArtUrg, BC01S042_A356DisArtUr1, BC01S042_A357DisArtUr2, BC01S042_A358DisArtUr3, BC01S042_A347DisArtPu1, BC01S042_A348DisArtPu2, BC01S042_A349DisArtPu3, BC01S042_n349DisArtPu3, BC01S042_A342DisArtPes,
            BC01S042_A1225DisGraCru, BC01S042_A334DisArtAnh, BC01S042_A1231DisArtAn1, BC01S042_A1232DisArtAcb, BC01S042_A1233DisArtAc2, BC01S042_A1197DisEncCom, BC01S042_A1198DisEncAnh, BC01S042_A3127DisNumCor, BC01S042_A3128DisAncSal1, BC01S042_A3129DisAncSal2,
            BC01S042_A3130DisAncSal3, BC01S042_A3131DisGraAca2, BC01S042_A3132DisGraCru2, BC01S042_A1906DisGraAca, BC01S042_A1908DisRdoA, BC01S042_A1907DisRdoN, BC01S042_A5349DisObsGrm, BC01S042_A5350DisObsAnc, BC01S042_A9786DisItem5, BC01S042_A392DisUniMed,
            BC01S042_A407EmprNom, BC01S042_n407EmprNom, BC01S042_A757PriCod, BC01S042_A4813DisEncCli, BC01S042_A279CliNom, BC01S042_A369DisFec, BC01S042_A370DisFecCli, BC01S042_A371DisFecEnt, BC01S042_A335DisArtCod, BC01S042_A362DisColNom,
            BC01S042_n362DisColNom, BC01S042_A363DisColNum, BC01S042_n363DisColNum, BC01S042_A367DisEst, BC01S042_A365DisDes, BC01S042_A13987DisArtDsc2, BC01S042_A10888Dsc_Idtx, BC01S042_n10888Dsc_Idtx, BC01S042_A11661DisOrdComp, BC01S042_A12327RevenNm,
            BC01S042_n12327RevenNm, BC01S042_A11660MarcaDsc, BC01S042_n11660MarcaDsc, BC01S042_A12765DisPriorid, BC01S042_A11859Nxt_modelo, BC01S042_A11865CpteDsc, BC01S042_n11865CpteDsc, BC01S042_A11861Nxt_statio, BC01S042_A11866DesaDsc, BC01S042_n11866DesaDsc,
            BC01S042_A11867DptoDsc, BC01S042_n11867DptoDsc, BC01S042_A11864Nxt_artcli, BC01S042_A7739DisExp, BC01S042_A396EmprCod, BC01S042_A252CliCod, BC01S042_A390DisTipCol, BC01S042_n390DisTipCol, BC01S042_A10887Cod_Idtx, BC01S042_n10887Cod_Idtx,
            BC01S042_A13986DisIdtx2, BC01S042_n13986DisIdtx2, BC01S042_A11659MarcaId, BC01S042_n11659MarcaId, BC01S042_A11863DptoID, BC01S042_n11863DptoID, BC01S042_A11860CpteId, BC01S042_n11860CpteId, BC01S042_A11862DesaID, BC01S042_n11862DesaID,
            BC01S042_A12328RevenID, BC01S042_n12328RevenID
            }
            , new Object[] {
            BC01S045_A13994E_DisCliDe, BC01S045_n13994E_DisCliDe
            }
            , new Object[] {
            BC01S048_A13995E_DisArtCo, BC01S048_n13995E_DisArtCo
            }
            , new Object[] {
            BC01S049_A279CliNom
            }
            , new Object[] {
            BC01S050_A396EmprCod
            }
            , new Object[] {
            BC01S051_A10888Dsc_Idtx, BC01S051_n10888Dsc_Idtx
            }
            , new Object[] {
            BC01S052_A396EmprCod
            }
            , new Object[] {
            BC01S053_A11660MarcaDsc, BC01S053_n11660MarcaDsc
            }
            , new Object[] {
            BC01S054_A11867DptoDsc, BC01S054_n11867DptoDsc
            }
            , new Object[] {
            BC01S055_A11865CpteDsc, BC01S055_n11865CpteDsc
            }
            , new Object[] {
            BC01S056_A11866DesaDsc, BC01S056_n11866DesaDsc
            }
            , new Object[] {
            BC01S057_A12327RevenNm, BC01S057_n12327RevenNm
            }
            , new Object[] {
            BC01S060_A13994E_DisCliDe, BC01S060_n13994E_DisCliDe
            }
            , new Object[] {
            BC01S063_A13995E_DisArtCo, BC01S063_n13995E_DisArtCo
            }
            , new Object[] {
            BC01S064_A396EmprCod, BC01S064_A361DisCod
            }
            , new Object[] {
            BC01S065_A361DisCod, BC01S065_A2310DisCliDes, BC01S065_A2009DisTipDis, BC01S065_n2009DisTipDis, BC01S065_A337DisArtDsc, BC01S065_A340DisArtMat, BC01S065_A2835DisPle2, BC01S065_A339DisArtLar, BC01S065_A351DisArtSua, BC01S065_A333DisArtAca,
            BC01S065_A343DisArtPle, BC01S065_A352DisArtTip, BC01S065_A338DisArtEnc, BC01S065_A336DisArtCor, BC01S065_A353DisArtTr1, BC01S065_A354DisArtTr2, BC01S065_A355DisArtTr3, BC01S065_A344DisArtPt1, BC01S065_A345DisArtPt2, BC01S065_A346DisArtPt3,
            BC01S065_A350DisArtRdt, BC01S065_A359DisArtUrg, BC01S065_A356DisArtUr1, BC01S065_A357DisArtUr2, BC01S065_A358DisArtUr3, BC01S065_A347DisArtPu1, BC01S065_A348DisArtPu2, BC01S065_A349DisArtPu3, BC01S065_n349DisArtPu3, BC01S065_A342DisArtPes,
            BC01S065_A1225DisGraCru, BC01S065_A334DisArtAnh, BC01S065_A1231DisArtAn1, BC01S065_A1232DisArtAcb, BC01S065_A1233DisArtAc2, BC01S065_A1197DisEncCom, BC01S065_A1198DisEncAnh, BC01S065_A3127DisNumCor, BC01S065_A3128DisAncSal1, BC01S065_A3129DisAncSal2,
            BC01S065_A3130DisAncSal3, BC01S065_A3131DisGraAca2, BC01S065_A3132DisGraCru2, BC01S065_A1906DisGraAca, BC01S065_A1908DisRdoA, BC01S065_A1907DisRdoN, BC01S065_A5349DisObsGrm, BC01S065_A5350DisObsAnc, BC01S065_A9786DisItem5, BC01S065_A392DisUniMed,
            BC01S065_A757PriCod, BC01S065_A4813DisEncCli, BC01S065_A369DisFec, BC01S065_A370DisFecCli, BC01S065_A371DisFecEnt, BC01S065_A335DisArtCod, BC01S065_A362DisColNom, BC01S065_n362DisColNom, BC01S065_A363DisColNum, BC01S065_n363DisColNum,
            BC01S065_A367DisEst, BC01S065_A365DisDes, BC01S065_A13987DisArtDsc2, BC01S065_A11661DisOrdComp, BC01S065_A12765DisPriorid, BC01S065_A11859Nxt_modelo, BC01S065_A11861Nxt_statio, BC01S065_A11864Nxt_artcli, BC01S065_A7739DisExp, BC01S065_A396EmprCod,
            BC01S065_A252CliCod, BC01S065_A390DisTipCol, BC01S065_n390DisTipCol, BC01S065_A10887Cod_Idtx, BC01S065_n10887Cod_Idtx, BC01S065_A13986DisIdtx2, BC01S065_n13986DisIdtx2, BC01S065_A11659MarcaId, BC01S065_n11659MarcaId, BC01S065_A11863DptoID,
            BC01S065_n11863DptoID, BC01S065_A11860CpteId, BC01S065_n11860CpteId, BC01S065_A11862DesaID, BC01S065_n11862DesaID, BC01S065_A12328RevenID, BC01S065_n12328RevenID
            }
            , new Object[] {
            BC01S066_A361DisCod, BC01S066_A2310DisCliDes, BC01S066_A2009DisTipDis, BC01S066_n2009DisTipDis, BC01S066_A337DisArtDsc, BC01S066_A340DisArtMat, BC01S066_A2835DisPle2, BC01S066_A339DisArtLar, BC01S066_A351DisArtSua, BC01S066_A333DisArtAca,
            BC01S066_A343DisArtPle, BC01S066_A352DisArtTip, BC01S066_A338DisArtEnc, BC01S066_A336DisArtCor, BC01S066_A353DisArtTr1, BC01S066_A354DisArtTr2, BC01S066_A355DisArtTr3, BC01S066_A344DisArtPt1, BC01S066_A345DisArtPt2, BC01S066_A346DisArtPt3,
            BC01S066_A350DisArtRdt, BC01S066_A359DisArtUrg, BC01S066_A356DisArtUr1, BC01S066_A357DisArtUr2, BC01S066_A358DisArtUr3, BC01S066_A347DisArtPu1, BC01S066_A348DisArtPu2, BC01S066_A349DisArtPu3, BC01S066_n349DisArtPu3, BC01S066_A342DisArtPes,
            BC01S066_A1225DisGraCru, BC01S066_A334DisArtAnh, BC01S066_A1231DisArtAn1, BC01S066_A1232DisArtAcb, BC01S066_A1233DisArtAc2, BC01S066_A1197DisEncCom, BC01S066_A1198DisEncAnh, BC01S066_A3127DisNumCor, BC01S066_A3128DisAncSal1, BC01S066_A3129DisAncSal2,
            BC01S066_A3130DisAncSal3, BC01S066_A3131DisGraAca2, BC01S066_A3132DisGraCru2, BC01S066_A1906DisGraAca, BC01S066_A1908DisRdoA, BC01S066_A1907DisRdoN, BC01S066_A5349DisObsGrm, BC01S066_A5350DisObsAnc, BC01S066_A9786DisItem5, BC01S066_A392DisUniMed,
            BC01S066_A757PriCod, BC01S066_A4813DisEncCli, BC01S066_A369DisFec, BC01S066_A370DisFecCli, BC01S066_A371DisFecEnt, BC01S066_A335DisArtCod, BC01S066_A362DisColNom, BC01S066_n362DisColNom, BC01S066_A363DisColNum, BC01S066_n363DisColNum,
            BC01S066_A367DisEst, BC01S066_A365DisDes, BC01S066_A13987DisArtDsc2, BC01S066_A11661DisOrdComp, BC01S066_A12765DisPriorid, BC01S066_A11859Nxt_modelo, BC01S066_A11861Nxt_statio, BC01S066_A11864Nxt_artcli, BC01S066_A7739DisExp, BC01S066_A396EmprCod,
            BC01S066_A252CliCod, BC01S066_A390DisTipCol, BC01S066_n390DisTipCol, BC01S066_A10887Cod_Idtx, BC01S066_n10887Cod_Idtx, BC01S066_A13986DisIdtx2, BC01S066_n13986DisIdtx2, BC01S066_A11659MarcaId, BC01S066_n11659MarcaId, BC01S066_A11863DptoID,
            BC01S066_n11863DptoID, BC01S066_A11860CpteId, BC01S066_n11860CpteId, BC01S066_A11862DesaID, BC01S066_n11862DesaID, BC01S066_A12328RevenID, BC01S066_n12328RevenID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S072_A13994E_DisCliDe, BC01S072_n13994E_DisCliDe
            }
            , new Object[] {
            BC01S073_A279CliNom
            }
            , new Object[] {
            BC01S076_A13995E_DisArtCo, BC01S076_n13995E_DisArtCo
            }
            , new Object[] {
            BC01S077_A10888Dsc_Idtx, BC01S077_n10888Dsc_Idtx
            }
            , new Object[] {
            BC01S078_A12327RevenNm, BC01S078_n12327RevenNm
            }
            , new Object[] {
            BC01S079_A11660MarcaDsc, BC01S079_n11660MarcaDsc
            }
            , new Object[] {
            BC01S080_A11865CpteDsc, BC01S080_n11865CpteDsc
            }
            , new Object[] {
            BC01S081_A11866DesaDsc, BC01S081_n11866DesaDsc
            }
            , new Object[] {
            BC01S082_A11867DptoDsc, BC01S082_n11867DptoDsc
            }
            , new Object[] {
            BC01S083_A396EmprCod, BC01S083_A361DisCod, BC01S083_A13376DisTraID
            }
            , new Object[] {
            BC01S084_A396EmprCod, BC01S084_A361DisCod, BC01S084_A13081DisDGLin, BC01S084_A13082DisDGDibCl, BC01S084_A13083DisDGDibIn, BC01S084_A13084DisDGComb, BC01S084_A13085DisDGFondo
            }
            , new Object[] {
            BC01S085_A396EmprCod, BC01S085_A361DisCod, BC01S085_A7068DisNotLin
            }
            , new Object[] {
            BC01S086_A396EmprCod, BC01S086_A361DisCod, BC01S086_A10197ProEspCod
            }
            , new Object[] {
            BC01S087_A396EmprCod, BC01S087_A361DisCod, BC01S087_A4594AccCod
            }
            , new Object[] {
            BC01S088_A396EmprCod, BC01S088_A361DisCod, BC01S088_A2524DisComLin, BC01S088_A1056DisComCod, BC01S088_A1032FonCod
            }
            , new Object[] {
            BC01S089_A396EmprCod, BC01S089_A361DisCod, BC01S089_A3398DisRefBarC, BC01S089_A3399DisRefBCRe, BC01S089_A3400DisRefBCPa, BC01S089_A3607DisRefBPie
            }
            , new Object[] {
            BC01S090_A396EmprCod, BC01S090_A361DisCod, BC01S090_A376DisObsLin
            }
            , new Object[] {
            BC01S091_A396EmprCod, BC01S091_A361DisCod, BC01S091_A758ProCod
            }
            , new Object[] {
            BC01S092_A396EmprCod, BC01S092_A129BarCod, BC01S092_A132BarCodReo, BC01S092_A130BarCodPar
            }
            , new Object[] {
            BC01S093_A396EmprCod, BC01S093_A361DisCod, BC01S093_A44AlbRecCod, BC01S093_A380DisPieCod
            }
            , new Object[] {
            BC01S094_A361DisCod, BC01S094_A2310DisCliDes, BC01S094_A2009DisTipDis, BC01S094_n2009DisTipDis, BC01S094_A337DisArtDsc, BC01S094_A340DisArtMat, BC01S094_A2835DisPle2, BC01S094_A339DisArtLar, BC01S094_A351DisArtSua, BC01S094_A333DisArtAca,
            BC01S094_A343DisArtPle, BC01S094_A352DisArtTip, BC01S094_A338DisArtEnc, BC01S094_A336DisArtCor, BC01S094_A353DisArtTr1, BC01S094_A354DisArtTr2, BC01S094_A355DisArtTr3, BC01S094_A344DisArtPt1, BC01S094_A345DisArtPt2, BC01S094_A346DisArtPt3,
            BC01S094_A350DisArtRdt, BC01S094_A359DisArtUrg, BC01S094_A356DisArtUr1, BC01S094_A357DisArtUr2, BC01S094_A358DisArtUr3, BC01S094_A347DisArtPu1, BC01S094_A348DisArtPu2, BC01S094_A349DisArtPu3, BC01S094_n349DisArtPu3, BC01S094_A342DisArtPes,
            BC01S094_A1225DisGraCru, BC01S094_A334DisArtAnh, BC01S094_A1231DisArtAn1, BC01S094_A1232DisArtAcb, BC01S094_A1233DisArtAc2, BC01S094_A1197DisEncCom, BC01S094_A1198DisEncAnh, BC01S094_A3127DisNumCor, BC01S094_A3128DisAncSal1, BC01S094_A3129DisAncSal2,
            BC01S094_A3130DisAncSal3, BC01S094_A3131DisGraAca2, BC01S094_A3132DisGraCru2, BC01S094_A1906DisGraAca, BC01S094_A1908DisRdoA, BC01S094_A1907DisRdoN, BC01S094_A5349DisObsGrm, BC01S094_A5350DisObsAnc, BC01S094_A9786DisItem5, BC01S094_A392DisUniMed,
            BC01S094_A407EmprNom, BC01S094_n407EmprNom, BC01S094_A757PriCod, BC01S094_A4813DisEncCli, BC01S094_A279CliNom, BC01S094_A369DisFec, BC01S094_A370DisFecCli, BC01S094_A371DisFecEnt, BC01S094_A335DisArtCod, BC01S094_A362DisColNom,
            BC01S094_n362DisColNom, BC01S094_A363DisColNum, BC01S094_n363DisColNum, BC01S094_A367DisEst, BC01S094_A365DisDes, BC01S094_A13987DisArtDsc2, BC01S094_A10888Dsc_Idtx, BC01S094_n10888Dsc_Idtx, BC01S094_A11661DisOrdComp, BC01S094_A12327RevenNm,
            BC01S094_n12327RevenNm, BC01S094_A11660MarcaDsc, BC01S094_n11660MarcaDsc, BC01S094_A12765DisPriorid, BC01S094_A11859Nxt_modelo, BC01S094_A11865CpteDsc, BC01S094_n11865CpteDsc, BC01S094_A11861Nxt_statio, BC01S094_A11866DesaDsc, BC01S094_n11866DesaDsc,
            BC01S094_A11867DptoDsc, BC01S094_n11867DptoDsc, BC01S094_A11864Nxt_artcli, BC01S094_A7739DisExp, BC01S094_A396EmprCod, BC01S094_A252CliCod, BC01S094_A390DisTipCol, BC01S094_n390DisTipCol, BC01S094_A10887Cod_Idtx, BC01S094_n10887Cod_Idtx,
            BC01S094_A13986DisIdtx2, BC01S094_n13986DisIdtx2, BC01S094_A11659MarcaId, BC01S094_n11659MarcaId, BC01S094_A11863DptoID, BC01S094_n11863DptoID, BC01S094_A11860CpteId, BC01S094_n11860CpteId, BC01S094_A11862DesaID, BC01S094_n11862DesaID,
            BC01S094_A12328RevenID, BC01S094_n12328RevenID
            }
            , new Object[] {
            BC01S095_A361DisCod, BC01S095_A13216DisNormDsc, BC01S095_n13216DisNormDsc, BC01S095_A13214DisNormSt, BC01S095_A13215DisNormNC, BC01S095_A396EmprCod, BC01S095_A13213DisNormID
            }
            , new Object[] {
            BC01S096_A13216DisNormDsc, BC01S096_n13216DisNormDsc
            }
            , new Object[] {
            BC01S097_A396EmprCod, BC01S097_A361DisCod, BC01S097_A13213DisNormID
            }
            , new Object[] {
            BC01S098_A361DisCod, BC01S098_A13214DisNormSt, BC01S098_A13215DisNormNC, BC01S098_A396EmprCod, BC01S098_A13213DisNormID
            }
            , new Object[] {
            BC01S099_A361DisCod, BC01S099_A13214DisNormSt, BC01S099_A13215DisNormNC, BC01S099_A396EmprCod, BC01S099_A13213DisNormID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S0103_A13216DisNormDsc, BC01S0103_n13216DisNormDsc
            }
            , new Object[] {
            BC01S0104_A361DisCod, BC01S0104_A13216DisNormDsc, BC01S0104_n13216DisNormDsc, BC01S0104_A13214DisNormSt, BC01S0104_A13215DisNormNC, BC01S0104_A396EmprCod, BC01S0104_A13213DisNormID
            }
            , new Object[] {
            BC01S0105_A361DisCod, BC01S0105_A3613AlbRefDsc, BC01S0105_A55AlbRReo, BC01S0105_A673Piezas, BC01S0105_A595Kilos, BC01S0105_A631Metros, BC01S0105_A58AlbRUniEnt, BC01S0105_A60AlbRUniUti, BC01S0105_A52AlbRPieEnt, BC01S0105_A54AlbRPieUti,
            BC01S0105_A396EmprCod, BC01S0105_A44AlbRecCod
            }
            , new Object[] {
            BC01S0106_A3613AlbRefDsc, BC01S0106_A55AlbRReo, BC01S0106_A58AlbRUniEnt, BC01S0106_A60AlbRUniUti, BC01S0106_A52AlbRPieEnt, BC01S0106_A54AlbRPieUti
            }
            , new Object[] {
            BC01S0107_A396EmprCod, BC01S0107_A361DisCod, BC01S0107_A44AlbRecCod
            }
            , new Object[] {
            BC01S0108_A361DisCod, BC01S0108_A673Piezas, BC01S0108_A595Kilos, BC01S0108_A631Metros, BC01S0108_A396EmprCod, BC01S0108_A44AlbRecCod
            }
            , new Object[] {
            BC01S0109_A361DisCod, BC01S0109_A673Piezas, BC01S0109_A595Kilos, BC01S0109_A631Metros, BC01S0109_A396EmprCod, BC01S0109_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S0113_A3613AlbRefDsc, BC01S0113_A55AlbRReo, BC01S0113_A58AlbRUniEnt, BC01S0113_A60AlbRUniUti, BC01S0113_A52AlbRPieEnt, BC01S0113_A54AlbRPieUti
            }
            , new Object[] {
            BC01S0114_A396EmprCod, BC01S0114_A361DisCod, BC01S0114_A44AlbRecCod, BC01S0114_A9756Dis_CUb
            }
            , new Object[] {
            BC01S0115_A396EmprCod, BC01S0115_A361DisCod, BC01S0115_A44AlbRecCod, BC01S0115_A380DisPieCod
            }
            , new Object[] {
            BC01S0116_A361DisCod, BC01S0116_A3613AlbRefDsc, BC01S0116_A55AlbRReo, BC01S0116_A673Piezas, BC01S0116_A595Kilos, BC01S0116_A631Metros, BC01S0116_A58AlbRUniEnt, BC01S0116_A60AlbRUniUti, BC01S0116_A52AlbRPieEnt, BC01S0116_A54AlbRPieUti,
            BC01S0116_A396EmprCod, BC01S0116_A44AlbRecCod
            }
            , new Object[] {
            BC01S0117_A361DisCod, BC01S0117_A834TipDefDsc, BC01S0117_n834TipDefDsc, BC01S0117_A319DefPor, BC01S0117_A396EmprCod, BC01S0117_A833TipDefCod
            }
            , new Object[] {
            BC01S0118_A834TipDefDsc, BC01S0118_n834TipDefDsc
            }
            , new Object[] {
            BC01S0119_A396EmprCod, BC01S0119_A361DisCod, BC01S0119_A833TipDefCod
            }
            , new Object[] {
            BC01S0120_A361DisCod, BC01S0120_A319DefPor, BC01S0120_A396EmprCod, BC01S0120_A833TipDefCod
            }
            , new Object[] {
            BC01S0121_A361DisCod, BC01S0121_A319DefPor, BC01S0121_A396EmprCod, BC01S0121_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S0125_A834TipDefDsc, BC01S0125_n834TipDefDsc
            }
            , new Object[] {
            BC01S0126_A396EmprCod, BC01S0126_A129BarCod, BC01S0126_A132BarCodReo, BC01S0126_A130BarCodPar
            }
            , new Object[] {
            BC01S0127_A361DisCod, BC01S0127_A834TipDefDsc, BC01S0127_n834TipDefDsc, BC01S0127_A319DefPor, BC01S0127_A396EmprCod, BC01S0127_A833TipDefCod
            }
            , new Object[] {
            BC01S0128_A361DisCod, BC01S0128_A759ProDsc, BC01S0128_A846UltFasLin, BC01S0128_A396EmprCod, BC01S0128_A758ProCod
            }
            , new Object[] {
            BC01S0129_A759ProDsc
            }
            , new Object[] {
            BC01S0130_A396EmprCod, BC01S0130_A361DisCod, BC01S0130_A758ProCod
            }
            , new Object[] {
            BC01S0131_A361DisCod, BC01S0131_A846UltFasLin, BC01S0131_A396EmprCod, BC01S0131_A758ProCod
            }
            , new Object[] {
            BC01S0132_A361DisCod, BC01S0132_A846UltFasLin, BC01S0132_A396EmprCod, BC01S0132_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S0136_A759ProDsc
            }
            , new Object[] {
            BC01S0137_A396EmprCod, BC01S0137_A361DisCod, BC01S0137_A758ProCod, BC01S0137_A368DisFasLin
            }
            , new Object[] {
            BC01S0138_A361DisCod, BC01S0138_A759ProDsc, BC01S0138_A846UltFasLin, BC01S0138_A396EmprCod, BC01S0138_A758ProCod
            }
            , new Object[] {
            BC01S0139_A361DisCod, BC01S0139_A758ProCod, BC01S0139_A368DisFasLin, BC01S0139_A460FasDsc, BC01S0139_A5376DisQuiUl, BC01S0139_A7744FasPreObl, BC01S0139_n7744FasPreObl, BC01S0139_A396EmprCod, BC01S0139_A457FasCod
            }
            , new Object[] {
            BC01S0140_A460FasDsc, BC01S0140_A7744FasPreObl, BC01S0140_n7744FasPreObl
            }
            , new Object[] {
            BC01S0141_A396EmprCod, BC01S0141_A361DisCod, BC01S0141_A758ProCod, BC01S0141_A368DisFasLin
            }
            , new Object[] {
            BC01S0142_A361DisCod, BC01S0142_A758ProCod, BC01S0142_A368DisFasLin, BC01S0142_A5376DisQuiUl, BC01S0142_A396EmprCod, BC01S0142_A457FasCod
            }
            , new Object[] {
            BC01S0143_A361DisCod, BC01S0143_A758ProCod, BC01S0143_A368DisFasLin, BC01S0143_A5376DisQuiUl, BC01S0143_A396EmprCod, BC01S0143_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S0147_A460FasDsc, BC01S0147_A7744FasPreObl, BC01S0147_n7744FasPreObl
            }
            , new Object[] {
            BC01S0148_A396EmprCod, BC01S0148_A361DisCod, BC01S0148_A758ProCod, BC01S0148_A368DisFasLin, BC01S0148_A7919Dta_Ordl
            }
            , new Object[] {
            BC01S0149_A396EmprCod, BC01S0149_A361DisCod, BC01S0149_A758ProCod, BC01S0149_A368DisFasLin, BC01S0149_A7727ArtAdiCod
            }
            , new Object[] {
            BC01S0150_A396EmprCod, BC01S0150_A361DisCod, BC01S0150_A758ProCod, BC01S0150_A368DisFasLin, BC01S0150_A5035A_Discod, BC01S0150_A5038A_DProcod, BC01S0150_A5039A_DOrdlin
            }
            , new Object[] {
            BC01S0151_A361DisCod, BC01S0151_A758ProCod, BC01S0151_A368DisFasLin, BC01S0151_A460FasDsc, BC01S0151_A5376DisQuiUl, BC01S0151_A7744FasPreObl, BC01S0151_n7744FasPreObl, BC01S0151_A396EmprCod, BC01S0151_A457FasCod
            }
            , new Object[] {
            BC01S0152_A361DisCod, BC01S0152_A758ProCod, BC01S0152_A368DisFasLin, BC01S0152_A5377DisQuiLin, BC01S0152_A766ProForDsc, BC01S0152_A396EmprCod, BC01S0152_A764ProForCod
            }
            , new Object[] {
            BC01S0153_A766ProForDsc
            }
            , new Object[] {
            BC01S0154_A396EmprCod, BC01S0154_A361DisCod, BC01S0154_A758ProCod, BC01S0154_A368DisFasLin, BC01S0154_A5377DisQuiLin
            }
            , new Object[] {
            BC01S0155_A361DisCod, BC01S0155_A758ProCod, BC01S0155_A368DisFasLin, BC01S0155_A5377DisQuiLin, BC01S0155_A396EmprCod, BC01S0155_A764ProForCod
            }
            , new Object[] {
            BC01S0156_A361DisCod, BC01S0156_A758ProCod, BC01S0156_A368DisFasLin, BC01S0156_A5377DisQuiLin, BC01S0156_A396EmprCod, BC01S0156_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S0160_A766ProForDsc
            }
            , new Object[] {
            BC01S0161_A361DisCod, BC01S0161_A758ProCod, BC01S0161_A368DisFasLin, BC01S0161_A5377DisQuiLin, BC01S0161_A766ProForDsc, BC01S0161_A396EmprCod, BC01S0161_A764ProForCod
            }
            , new Object[] {
            BC01S0162_A361DisCod, BC01S0162_A758ProCod, BC01S0162_A368DisFasLin, BC01S0162_A12672DisParVl2, BC01S0162_A3686DisParObs, BC01S0162_A396EmprCod, BC01S0162_A1664ParFasCod
            }
            , new Object[] {
            BC01S0163_A396EmprCod
            }
            , new Object[] {
            BC01S0164_A396EmprCod, BC01S0164_A361DisCod, BC01S0164_A758ProCod, BC01S0164_A368DisFasLin, BC01S0164_A1664ParFasCod
            }
            , new Object[] {
            BC01S0165_A361DisCod, BC01S0165_A758ProCod, BC01S0165_A368DisFasLin, BC01S0165_A12672DisParVl2, BC01S0165_A3686DisParObs, BC01S0165_A396EmprCod, BC01S0165_A1664ParFasCod
            }
            , new Object[] {
            BC01S0166_A361DisCod, BC01S0166_A758ProCod, BC01S0166_A368DisFasLin, BC01S0166_A12672DisParVl2, BC01S0166_A3686DisParObs, BC01S0166_A396EmprCod, BC01S0166_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01S0170_A361DisCod, BC01S0170_A758ProCod, BC01S0170_A368DisFasLin, BC01S0170_A12672DisParVl2, BC01S0170_A3686DisParObs, BC01S0170_A396EmprCod, BC01S0170_A1664ParFasCod
            }
            , new Object[] {
            BC01S0171_A407EmprNom, BC01S0171_n407EmprNom
            }
            , new Object[] {
            BC01S0174_A13994E_DisCliDe, BC01S0174_n13994E_DisCliDe
            }
            , new Object[] {
            BC01S0175_A407EmprNom, BC01S0175_n407EmprNom
            }
            , new Object[] {
            BC01S0178_A13994E_DisCliDe, BC01S0178_n13994E_DisCliDe
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z7739DisExp = httpContext.getMessage( "N", "") ;
      A7739DisExp = httpContext.getMessage( "N", "") ;
      i7739DisExp = httpContext.getMessage( "N", "") ;
      Z757PriCod = "1" ;
      A757PriCod = "1" ;
      i757PriCod = "1" ;
      Z365DisDes = httpContext.getMessage( "N", "") ;
      A365DisDes = httpContext.getMessage( "N", "") ;
      i365DisDes = httpContext.getMessage( "N", "") ;
      Z367DisEst = (byte)(0) ;
      A367DisEst = (byte)(0) ;
      i367DisEst = (byte)(0) ;
      Z370DisFecCli = GXutil.today( ) ;
      A370DisFecCli = GXutil.today( ) ;
      i370DisFecCli = GXutil.today( ) ;
      Z369DisFec = GXutil.today( ) ;
      A369DisFec = GXutil.today( ) ;
      i369DisFec = GXutil.today( ) ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e111S02 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte Z359DisArtUrg ;
   private byte A359DisArtUrg ;
   private byte Z367DisEst ;
   private byte A367DisEst ;
   private byte Z12765DisPriorid ;
   private byte A12765DisPriorid ;
   private byte Z390DisTipCol ;
   private byte A390DisTipCol ;
   private byte Gx_BScreen ;
   private byte GXv_int49[] ;
   private byte GXv_int6[] ;
   private byte Gxremove1812 ;
   private byte Gxremove35 ;
   private byte Gxremove37 ;
   private byte Gxremove38 ;
   private byte Gxremove39 ;
   private byte Z7744FasPreObl ;
   private byte A7744FasPreObl ;
   private byte Gxremove780 ;
   private byte Gxremove517 ;
   private byte i367DisEst ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nIsMod_517 ;
   private short RcdFound517 ;
   private short nIsMod_780 ;
   private short RcdFound780 ;
   private short nIsMod_39 ;
   private short RcdFound39 ;
   private short nIsMod_38 ;
   private short RcdFound38 ;
   private short nIsMod_37 ;
   private short RcdFound37 ;
   private short nIsMod_35 ;
   private short RcdFound35 ;
   private short nIsMod_1812 ;
   private short RcdFound1812 ;
   private short AV8Prio1 ;
   private short AV15moda21 ;
   private short AV10ExisteArticulo ;
   private short Z352DisArtTip ;
   private short A352DisArtTip ;
   private short Z344DisArtPt1 ;
   private short A344DisArtPt1 ;
   private short Z345DisArtPt2 ;
   private short A345DisArtPt2 ;
   private short Z346DisArtPt3 ;
   private short A346DisArtPt3 ;
   private short Z347DisArtPu1 ;
   private short A347DisArtPu1 ;
   private short Z348DisArtPu2 ;
   private short A348DisArtPu2 ;
   private short Z349DisArtPu3 ;
   private short A349DisArtPu3 ;
   private short Z342DisArtPes ;
   private short A342DisArtPes ;
   private short Z1225DisGraCru ;
   private short A1225DisGraCru ;
   private short Z334DisArtAnh ;
   private short A334DisArtAnh ;
   private short Z1231DisArtAn1 ;
   private short A1231DisArtAn1 ;
   private short Z1232DisArtAcb ;
   private short A1232DisArtAcb ;
   private short Z1233DisArtAc2 ;
   private short A1233DisArtAc2 ;
   private short Z3127DisNumCor ;
   private short A3127DisNumCor ;
   private short Z3128DisAncSal1 ;
   private short A3128DisAncSal1 ;
   private short Z3129DisAncSal2 ;
   private short A3129DisAncSal2 ;
   private short Z3130DisAncSal3 ;
   private short A3130DisAncSal3 ;
   private short Z3131DisGraAca2 ;
   private short A3131DisGraAca2 ;
   private short Z3132DisGraCru2 ;
   private short A3132DisGraCru2 ;
   private short Z1906DisGraAca ;
   private short A1906DisGraAca ;
   private short Z11863DptoID ;
   private short A11863DptoID ;
   private short Z11860CpteId ;
   private short A11860CpteId ;
   private short Z11862DesaID ;
   private short A11862DesaID ;
   private short Z13994E_DisCliDe ;
   private short A13994E_DisCliDe ;
   private short Z13995E_DisArtCo ;
   private short A13995E_DisArtCo ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short GXv_int41[] ;
   private short GXv_int40[] ;
   private short GXv_int39[] ;
   private short GXv_int38[] ;
   private short GXv_int37[] ;
   private short GXv_int36[] ;
   private short GXv_int35[] ;
   private short GXv_int34[] ;
   private short GXv_int33[] ;
   private short GXv_int32[] ;
   private short GXv_int31[] ;
   private short GXv_int30[] ;
   private short GXv_int29[] ;
   private short GXv_int28[] ;
   private short GXv_int27[] ;
   private short GXv_int26[] ;
   private short GXv_int25[] ;
   private short GXv_int24[] ;
   private short GXv_int19[] ;
   private short GXv_int18[] ;
   private short GXv_int17[] ;
   private short GXv_int11[] ;
   private short nRcdExists_1812 ;
   private short nRcdExists_35 ;
   private short nRcdExists_37 ;
   private short nRcdExists_38 ;
   private short nIsDirty_1812 ;
   private short nIsDirty_35 ;
   private short Z319DefPor ;
   private short A319DefPor ;
   private short Z833TipDefCod ;
   private short A833TipDefCod ;
   private short nIsDirty_37 ;
   private short Z846UltFasLin ;
   private short A846UltFasLin ;
   private short nIsDirty_38 ;
   private short nRcdExists_39 ;
   private short Z5376DisQuiUl ;
   private short A5376DisQuiUl ;
   private short Z368DisFasLin ;
   private short A368DisFasLin ;
   private short nIsDirty_39 ;
   private short nRcdExists_780 ;
   private short nRcdExists_517 ;
   private short Z5377DisQuiLin ;
   private short A5377DisQuiLin ;
   private short nIsDirty_780 ;
   private short Z1664ParFasCod ;
   private short A1664ParFasCod ;
   private short nIsDirty_517 ;
   private int trnEnded ;
   private int Z361DisCod ;
   private int A361DisCod ;
   private int nGXsfl_517_idx=1 ;
   private int nGXsfl_38_idx=1 ;
   private int nGXsfl_39_idx=1 ;
   private int nGXsfl_780_idx=1 ;
   private int nGXsfl_37_idx=1 ;
   private int nGXsfl_35_idx=1 ;
   private int nGXsfl_1812_idx=1 ;
   private int GX_JID ;
   private int Z2310DisCliDes ;
   private int A2310DisCliDes ;
   private int Z363DisColNum ;
   private int A363DisColNum ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int Z673Piezas ;
   private int A673Piezas ;
   private int Z51AlbRPieDis ;
   private int A51AlbRPieDis ;
   private int Z52AlbRPieEnt ;
   private int A52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int A54AlbRPieUti ;
   private int Z44AlbRecCod ;
   private int A44AlbRecCod ;
   private int GXv_int50[] ;
   private java.math.BigDecimal Z350DisArtRdt ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal Z1197DisEncCom ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal Z1198DisEncAnh ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal Z1908DisRdoA ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal Z1907DisRdoN ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal GXv_decimal48[] ;
   private java.math.BigDecimal GXv_decimal43[] ;
   private java.math.BigDecimal GXv_decimal42[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal Z595Kilos ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal Z631Metros ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String sMode34 ;
   private String sMode39 ;
   private String sMode38 ;
   private String AV13Station ;
   private String AV12EmprNom ;
   private String AV14UsurCod ;
   private String Z2009DisTipDis ;
   private String A2009DisTipDis ;
   private String Z337DisArtDsc ;
   private String A337DisArtDsc ;
   private String Z340DisArtMat ;
   private String A340DisArtMat ;
   private String Z2835DisPle2 ;
   private String A2835DisPle2 ;
   private String Z339DisArtLar ;
   private String A339DisArtLar ;
   private String Z351DisArtSua ;
   private String A351DisArtSua ;
   private String Z333DisArtAca ;
   private String A333DisArtAca ;
   private String Z343DisArtPle ;
   private String A343DisArtPle ;
   private String Z338DisArtEnc ;
   private String A338DisArtEnc ;
   private String Z336DisArtCor ;
   private String A336DisArtCor ;
   private String Z353DisArtTr1 ;
   private String A353DisArtTr1 ;
   private String Z354DisArtTr2 ;
   private String A354DisArtTr2 ;
   private String Z355DisArtTr3 ;
   private String A355DisArtTr3 ;
   private String Z356DisArtUr1 ;
   private String A356DisArtUr1 ;
   private String Z357DisArtUr2 ;
   private String A357DisArtUr2 ;
   private String Z358DisArtUr3 ;
   private String A358DisArtUr3 ;
   private String Z5349DisObsGrm ;
   private String A5349DisObsGrm ;
   private String Z5350DisObsAnc ;
   private String A5350DisObsAnc ;
   private String Z9786DisItem5 ;
   private String A9786DisItem5 ;
   private String Z392DisUniMed ;
   private String A392DisUniMed ;
   private String Z757PriCod ;
   private String A757PriCod ;
   private String Z4813DisEncCli ;
   private String A4813DisEncCli ;
   private String Z335DisArtCod ;
   private String A335DisArtCod ;
   private String Z362DisColNom ;
   private String A362DisColNom ;
   private String Z365DisDes ;
   private String A365DisDes ;
   private String Z11859Nxt_modelo ;
   private String A11859Nxt_modelo ;
   private String Z11861Nxt_statio ;
   private String A11861Nxt_statio ;
   private String Z11864Nxt_artcli ;
   private String A11864Nxt_artcli ;
   private String Z7739DisExp ;
   private String A7739DisExp ;
   private String Z10887Cod_Idtx ;
   private String A10887Cod_Idtx ;
   private String Z13986DisIdtx2 ;
   private String A13986DisIdtx2 ;
   private String Z11659MarcaId ;
   private String A11659MarcaId ;
   private String Z12328RevenID ;
   private String A12328RevenID ;
   private String Z14003CliNomDes ;
   private String A14003CliNomDes ;
   private String Z12115DisArtTipD ;
   private String A12115DisArtTipD ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z279CliNom ;
   private String A279CliNom ;
   private String Z10888Dsc_Idtx ;
   private String A10888Dsc_Idtx ;
   private String Z11660MarcaDsc ;
   private String A11660MarcaDsc ;
   private String Z11867DptoDsc ;
   private String A11867DptoDsc ;
   private String Z11865CpteDsc ;
   private String A11865CpteDsc ;
   private String Z11866DesaDsc ;
   private String A11866DesaDsc ;
   private String Z12327RevenNm ;
   private String A12327RevenNm ;
   private String AV7Codigo ;
   private String O335DisArtCod ;
   private String GXv_char46[] ;
   private String GXv_char45[] ;
   private String GXv_char44[] ;
   private String GXv_char23[] ;
   private String GXv_char22[] ;
   private String GXv_char21[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Z13214DisNormSt ;
   private String A13214DisNormSt ;
   private String Z13215DisNormNC ;
   private String A13215DisNormNC ;
   private String Z13216DisNormDsc ;
   private String A13216DisNormDsc ;
   private String Z13213DisNormID ;
   private String A13213DisNormID ;
   private String sMode1812 ;
   private String Z3613AlbRefDsc ;
   private String A3613AlbRefDsc ;
   private String Z55AlbRReo ;
   private String A55AlbRReo ;
   private String sMode35 ;
   private String Z834TipDefDsc ;
   private String A834TipDefDsc ;
   private String sMode37 ;
   private String Z759ProDsc ;
   private String A759ProDsc ;
   private String Z758ProCod ;
   private String A758ProCod ;
   private String Z457FasCod ;
   private String A457FasCod ;
   private String Z460FasDsc ;
   private String A460FasDsc ;
   private String Z764ProForCod ;
   private String A764ProForCod ;
   private String Z766ProForDsc ;
   private String A766ProForDsc ;
   private String sMode780 ;
   private String Z12672DisParVl2 ;
   private String A12672DisParVl2 ;
   private String Z3686DisParObs ;
   private String A3686DisParObs ;
   private String sMode517 ;
   private String GXv_char47[] ;
   private String i365DisDes ;
   private String i757PriCod ;
   private String i7739DisExp ;
   private java.util.Date Z369DisFec ;
   private java.util.Date A369DisFec ;
   private java.util.Date Z370DisFecCli ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date Z371DisFecEnt ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date i369DisFec ;
   private java.util.Date i370DisFecCli ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n2009DisTipDis ;
   private boolean n349DisArtPu3 ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12327RevenNm ;
   private boolean n11660MarcaDsc ;
   private boolean n11865CpteDsc ;
   private boolean n11866DesaDsc ;
   private boolean n11867DptoDsc ;
   private boolean n390DisTipCol ;
   private boolean n10887Cod_Idtx ;
   private boolean n13986DisIdtx2 ;
   private boolean n11659MarcaId ;
   private boolean n11863DptoID ;
   private boolean n11860CpteId ;
   private boolean n11862DesaID ;
   private boolean n12328RevenID ;
   private boolean n13994E_DisCliDe ;
   private boolean n13995E_DisArtCo ;
   private boolean Gx_longc ;
   private boolean n13216DisNormDsc ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n7744FasPreObl ;
   private boolean mustCommit ;
   private String Z13987DisArtDsc2 ;
   private String A13987DisArtDsc2 ;
   private String Z11661DisOrdComp ;
   private String A11661DisOrdComp ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.pedidosclientesindetalle.SdtPedido bcpedidosclientesindetalle_Pedido ;
   private IDataStoreProvider pr_default ;
   private String[] BC01S041_A407EmprNom ;
   private boolean[] BC01S041_n407EmprNom ;
   private int[] BC01S042_A361DisCod ;
   private int[] BC01S042_A2310DisCliDes ;
   private String[] BC01S042_A2009DisTipDis ;
   private boolean[] BC01S042_n2009DisTipDis ;
   private String[] BC01S042_A337DisArtDsc ;
   private String[] BC01S042_A340DisArtMat ;
   private String[] BC01S042_A2835DisPle2 ;
   private String[] BC01S042_A339DisArtLar ;
   private String[] BC01S042_A351DisArtSua ;
   private String[] BC01S042_A333DisArtAca ;
   private String[] BC01S042_A343DisArtPle ;
   private short[] BC01S042_A352DisArtTip ;
   private String[] BC01S042_A338DisArtEnc ;
   private String[] BC01S042_A336DisArtCor ;
   private String[] BC01S042_A353DisArtTr1 ;
   private String[] BC01S042_A354DisArtTr2 ;
   private String[] BC01S042_A355DisArtTr3 ;
   private short[] BC01S042_A344DisArtPt1 ;
   private short[] BC01S042_A345DisArtPt2 ;
   private short[] BC01S042_A346DisArtPt3 ;
   private java.math.BigDecimal[] BC01S042_A350DisArtRdt ;
   private byte[] BC01S042_A359DisArtUrg ;
   private String[] BC01S042_A356DisArtUr1 ;
   private String[] BC01S042_A357DisArtUr2 ;
   private String[] BC01S042_A358DisArtUr3 ;
   private short[] BC01S042_A347DisArtPu1 ;
   private short[] BC01S042_A348DisArtPu2 ;
   private short[] BC01S042_A349DisArtPu3 ;
   private boolean[] BC01S042_n349DisArtPu3 ;
   private short[] BC01S042_A342DisArtPes ;
   private short[] BC01S042_A1225DisGraCru ;
   private short[] BC01S042_A334DisArtAnh ;
   private short[] BC01S042_A1231DisArtAn1 ;
   private short[] BC01S042_A1232DisArtAcb ;
   private short[] BC01S042_A1233DisArtAc2 ;
   private java.math.BigDecimal[] BC01S042_A1197DisEncCom ;
   private java.math.BigDecimal[] BC01S042_A1198DisEncAnh ;
   private short[] BC01S042_A3127DisNumCor ;
   private short[] BC01S042_A3128DisAncSal1 ;
   private short[] BC01S042_A3129DisAncSal2 ;
   private short[] BC01S042_A3130DisAncSal3 ;
   private short[] BC01S042_A3131DisGraAca2 ;
   private short[] BC01S042_A3132DisGraCru2 ;
   private short[] BC01S042_A1906DisGraAca ;
   private java.math.BigDecimal[] BC01S042_A1908DisRdoA ;
   private java.math.BigDecimal[] BC01S042_A1907DisRdoN ;
   private String[] BC01S042_A5349DisObsGrm ;
   private String[] BC01S042_A5350DisObsAnc ;
   private String[] BC01S042_A9786DisItem5 ;
   private String[] BC01S042_A392DisUniMed ;
   private String[] BC01S042_A407EmprNom ;
   private boolean[] BC01S042_n407EmprNom ;
   private String[] BC01S042_A757PriCod ;
   private String[] BC01S042_A4813DisEncCli ;
   private String[] BC01S042_A279CliNom ;
   private java.util.Date[] BC01S042_A369DisFec ;
   private java.util.Date[] BC01S042_A370DisFecCli ;
   private java.util.Date[] BC01S042_A371DisFecEnt ;
   private String[] BC01S042_A335DisArtCod ;
   private String[] BC01S042_A362DisColNom ;
   private boolean[] BC01S042_n362DisColNom ;
   private int[] BC01S042_A363DisColNum ;
   private boolean[] BC01S042_n363DisColNum ;
   private byte[] BC01S042_A367DisEst ;
   private String[] BC01S042_A365DisDes ;
   private String[] BC01S042_A13987DisArtDsc2 ;
   private String[] BC01S042_A10888Dsc_Idtx ;
   private boolean[] BC01S042_n10888Dsc_Idtx ;
   private String[] BC01S042_A11661DisOrdComp ;
   private String[] BC01S042_A12327RevenNm ;
   private boolean[] BC01S042_n12327RevenNm ;
   private String[] BC01S042_A11660MarcaDsc ;
   private boolean[] BC01S042_n11660MarcaDsc ;
   private byte[] BC01S042_A12765DisPriorid ;
   private String[] BC01S042_A11859Nxt_modelo ;
   private String[] BC01S042_A11865CpteDsc ;
   private boolean[] BC01S042_n11865CpteDsc ;
   private String[] BC01S042_A11861Nxt_statio ;
   private String[] BC01S042_A11866DesaDsc ;
   private boolean[] BC01S042_n11866DesaDsc ;
   private String[] BC01S042_A11867DptoDsc ;
   private boolean[] BC01S042_n11867DptoDsc ;
   private String[] BC01S042_A11864Nxt_artcli ;
   private String[] BC01S042_A7739DisExp ;
   private String[] BC01S042_A396EmprCod ;
   private int[] BC01S042_A252CliCod ;
   private byte[] BC01S042_A390DisTipCol ;
   private boolean[] BC01S042_n390DisTipCol ;
   private String[] BC01S042_A10887Cod_Idtx ;
   private boolean[] BC01S042_n10887Cod_Idtx ;
   private String[] BC01S042_A13986DisIdtx2 ;
   private boolean[] BC01S042_n13986DisIdtx2 ;
   private String[] BC01S042_A11659MarcaId ;
   private boolean[] BC01S042_n11659MarcaId ;
   private short[] BC01S042_A11863DptoID ;
   private boolean[] BC01S042_n11863DptoID ;
   private short[] BC01S042_A11860CpteId ;
   private boolean[] BC01S042_n11860CpteId ;
   private short[] BC01S042_A11862DesaID ;
   private boolean[] BC01S042_n11862DesaID ;
   private String[] BC01S042_A12328RevenID ;
   private boolean[] BC01S042_n12328RevenID ;
   private short[] BC01S045_A13994E_DisCliDe ;
   private boolean[] BC01S045_n13994E_DisCliDe ;
   private short[] BC01S048_A13995E_DisArtCo ;
   private boolean[] BC01S048_n13995E_DisArtCo ;
   private String[] BC01S049_A279CliNom ;
   private String[] BC01S050_A396EmprCod ;
   private String[] BC01S051_A10888Dsc_Idtx ;
   private boolean[] BC01S051_n10888Dsc_Idtx ;
   private String[] BC01S052_A396EmprCod ;
   private String[] BC01S053_A11660MarcaDsc ;
   private boolean[] BC01S053_n11660MarcaDsc ;
   private String[] BC01S054_A11867DptoDsc ;
   private boolean[] BC01S054_n11867DptoDsc ;
   private String[] BC01S055_A11865CpteDsc ;
   private boolean[] BC01S055_n11865CpteDsc ;
   private String[] BC01S056_A11866DesaDsc ;
   private boolean[] BC01S056_n11866DesaDsc ;
   private String[] BC01S057_A12327RevenNm ;
   private boolean[] BC01S057_n12327RevenNm ;
   private short[] BC01S060_A13994E_DisCliDe ;
   private boolean[] BC01S060_n13994E_DisCliDe ;
   private short[] BC01S063_A13995E_DisArtCo ;
   private boolean[] BC01S063_n13995E_DisArtCo ;
   private String[] BC01S064_A396EmprCod ;
   private int[] BC01S064_A361DisCod ;
   private int[] BC01S065_A361DisCod ;
   private int[] BC01S065_A2310DisCliDes ;
   private String[] BC01S065_A2009DisTipDis ;
   private boolean[] BC01S065_n2009DisTipDis ;
   private String[] BC01S065_A337DisArtDsc ;
   private String[] BC01S065_A340DisArtMat ;
   private String[] BC01S065_A2835DisPle2 ;
   private String[] BC01S065_A339DisArtLar ;
   private String[] BC01S065_A351DisArtSua ;
   private String[] BC01S065_A333DisArtAca ;
   private String[] BC01S065_A343DisArtPle ;
   private short[] BC01S065_A352DisArtTip ;
   private String[] BC01S065_A338DisArtEnc ;
   private String[] BC01S065_A336DisArtCor ;
   private String[] BC01S065_A353DisArtTr1 ;
   private String[] BC01S065_A354DisArtTr2 ;
   private String[] BC01S065_A355DisArtTr3 ;
   private short[] BC01S065_A344DisArtPt1 ;
   private short[] BC01S065_A345DisArtPt2 ;
   private short[] BC01S065_A346DisArtPt3 ;
   private java.math.BigDecimal[] BC01S065_A350DisArtRdt ;
   private byte[] BC01S065_A359DisArtUrg ;
   private String[] BC01S065_A356DisArtUr1 ;
   private String[] BC01S065_A357DisArtUr2 ;
   private String[] BC01S065_A358DisArtUr3 ;
   private short[] BC01S065_A347DisArtPu1 ;
   private short[] BC01S065_A348DisArtPu2 ;
   private short[] BC01S065_A349DisArtPu3 ;
   private boolean[] BC01S065_n349DisArtPu3 ;
   private short[] BC01S065_A342DisArtPes ;
   private short[] BC01S065_A1225DisGraCru ;
   private short[] BC01S065_A334DisArtAnh ;
   private short[] BC01S065_A1231DisArtAn1 ;
   private short[] BC01S065_A1232DisArtAcb ;
   private short[] BC01S065_A1233DisArtAc2 ;
   private java.math.BigDecimal[] BC01S065_A1197DisEncCom ;
   private java.math.BigDecimal[] BC01S065_A1198DisEncAnh ;
   private short[] BC01S065_A3127DisNumCor ;
   private short[] BC01S065_A3128DisAncSal1 ;
   private short[] BC01S065_A3129DisAncSal2 ;
   private short[] BC01S065_A3130DisAncSal3 ;
   private short[] BC01S065_A3131DisGraAca2 ;
   private short[] BC01S065_A3132DisGraCru2 ;
   private short[] BC01S065_A1906DisGraAca ;
   private java.math.BigDecimal[] BC01S065_A1908DisRdoA ;
   private java.math.BigDecimal[] BC01S065_A1907DisRdoN ;
   private String[] BC01S065_A5349DisObsGrm ;
   private String[] BC01S065_A5350DisObsAnc ;
   private String[] BC01S065_A9786DisItem5 ;
   private String[] BC01S065_A392DisUniMed ;
   private String[] BC01S065_A757PriCod ;
   private String[] BC01S065_A4813DisEncCli ;
   private java.util.Date[] BC01S065_A369DisFec ;
   private java.util.Date[] BC01S065_A370DisFecCli ;
   private java.util.Date[] BC01S065_A371DisFecEnt ;
   private String[] BC01S065_A335DisArtCod ;
   private String[] BC01S065_A362DisColNom ;
   private boolean[] BC01S065_n362DisColNom ;
   private int[] BC01S065_A363DisColNum ;
   private boolean[] BC01S065_n363DisColNum ;
   private byte[] BC01S065_A367DisEst ;
   private String[] BC01S065_A365DisDes ;
   private String[] BC01S065_A13987DisArtDsc2 ;
   private String[] BC01S065_A11661DisOrdComp ;
   private byte[] BC01S065_A12765DisPriorid ;
   private String[] BC01S065_A11859Nxt_modelo ;
   private String[] BC01S065_A11861Nxt_statio ;
   private String[] BC01S065_A11864Nxt_artcli ;
   private String[] BC01S065_A7739DisExp ;
   private String[] BC01S065_A396EmprCod ;
   private int[] BC01S065_A252CliCod ;
   private byte[] BC01S065_A390DisTipCol ;
   private boolean[] BC01S065_n390DisTipCol ;
   private String[] BC01S065_A10887Cod_Idtx ;
   private boolean[] BC01S065_n10887Cod_Idtx ;
   private String[] BC01S065_A13986DisIdtx2 ;
   private boolean[] BC01S065_n13986DisIdtx2 ;
   private String[] BC01S065_A11659MarcaId ;
   private boolean[] BC01S065_n11659MarcaId ;
   private short[] BC01S065_A11863DptoID ;
   private boolean[] BC01S065_n11863DptoID ;
   private short[] BC01S065_A11860CpteId ;
   private boolean[] BC01S065_n11860CpteId ;
   private short[] BC01S065_A11862DesaID ;
   private boolean[] BC01S065_n11862DesaID ;
   private String[] BC01S065_A12328RevenID ;
   private boolean[] BC01S065_n12328RevenID ;
   private int[] BC01S066_A361DisCod ;
   private int[] BC01S066_A2310DisCliDes ;
   private String[] BC01S066_A2009DisTipDis ;
   private boolean[] BC01S066_n2009DisTipDis ;
   private String[] BC01S066_A337DisArtDsc ;
   private String[] BC01S066_A340DisArtMat ;
   private String[] BC01S066_A2835DisPle2 ;
   private String[] BC01S066_A339DisArtLar ;
   private String[] BC01S066_A351DisArtSua ;
   private String[] BC01S066_A333DisArtAca ;
   private String[] BC01S066_A343DisArtPle ;
   private short[] BC01S066_A352DisArtTip ;
   private String[] BC01S066_A338DisArtEnc ;
   private String[] BC01S066_A336DisArtCor ;
   private String[] BC01S066_A353DisArtTr1 ;
   private String[] BC01S066_A354DisArtTr2 ;
   private String[] BC01S066_A355DisArtTr3 ;
   private short[] BC01S066_A344DisArtPt1 ;
   private short[] BC01S066_A345DisArtPt2 ;
   private short[] BC01S066_A346DisArtPt3 ;
   private java.math.BigDecimal[] BC01S066_A350DisArtRdt ;
   private byte[] BC01S066_A359DisArtUrg ;
   private String[] BC01S066_A356DisArtUr1 ;
   private String[] BC01S066_A357DisArtUr2 ;
   private String[] BC01S066_A358DisArtUr3 ;
   private short[] BC01S066_A347DisArtPu1 ;
   private short[] BC01S066_A348DisArtPu2 ;
   private short[] BC01S066_A349DisArtPu3 ;
   private boolean[] BC01S066_n349DisArtPu3 ;
   private short[] BC01S066_A342DisArtPes ;
   private short[] BC01S066_A1225DisGraCru ;
   private short[] BC01S066_A334DisArtAnh ;
   private short[] BC01S066_A1231DisArtAn1 ;
   private short[] BC01S066_A1232DisArtAcb ;
   private short[] BC01S066_A1233DisArtAc2 ;
   private java.math.BigDecimal[] BC01S066_A1197DisEncCom ;
   private java.math.BigDecimal[] BC01S066_A1198DisEncAnh ;
   private short[] BC01S066_A3127DisNumCor ;
   private short[] BC01S066_A3128DisAncSal1 ;
   private short[] BC01S066_A3129DisAncSal2 ;
   private short[] BC01S066_A3130DisAncSal3 ;
   private short[] BC01S066_A3131DisGraAca2 ;
   private short[] BC01S066_A3132DisGraCru2 ;
   private short[] BC01S066_A1906DisGraAca ;
   private java.math.BigDecimal[] BC01S066_A1908DisRdoA ;
   private java.math.BigDecimal[] BC01S066_A1907DisRdoN ;
   private String[] BC01S066_A5349DisObsGrm ;
   private String[] BC01S066_A5350DisObsAnc ;
   private String[] BC01S066_A9786DisItem5 ;
   private String[] BC01S066_A392DisUniMed ;
   private String[] BC01S066_A757PriCod ;
   private String[] BC01S066_A4813DisEncCli ;
   private java.util.Date[] BC01S066_A369DisFec ;
   private java.util.Date[] BC01S066_A370DisFecCli ;
   private java.util.Date[] BC01S066_A371DisFecEnt ;
   private String[] BC01S066_A335DisArtCod ;
   private String[] BC01S066_A362DisColNom ;
   private boolean[] BC01S066_n362DisColNom ;
   private int[] BC01S066_A363DisColNum ;
   private boolean[] BC01S066_n363DisColNum ;
   private byte[] BC01S066_A367DisEst ;
   private String[] BC01S066_A365DisDes ;
   private String[] BC01S066_A13987DisArtDsc2 ;
   private String[] BC01S066_A11661DisOrdComp ;
   private byte[] BC01S066_A12765DisPriorid ;
   private String[] BC01S066_A11859Nxt_modelo ;
   private String[] BC01S066_A11861Nxt_statio ;
   private String[] BC01S066_A11864Nxt_artcli ;
   private String[] BC01S066_A7739DisExp ;
   private String[] BC01S066_A396EmprCod ;
   private int[] BC01S066_A252CliCod ;
   private byte[] BC01S066_A390DisTipCol ;
   private boolean[] BC01S066_n390DisTipCol ;
   private String[] BC01S066_A10887Cod_Idtx ;
   private boolean[] BC01S066_n10887Cod_Idtx ;
   private String[] BC01S066_A13986DisIdtx2 ;
   private boolean[] BC01S066_n13986DisIdtx2 ;
   private String[] BC01S066_A11659MarcaId ;
   private boolean[] BC01S066_n11659MarcaId ;
   private short[] BC01S066_A11863DptoID ;
   private boolean[] BC01S066_n11863DptoID ;
   private short[] BC01S066_A11860CpteId ;
   private boolean[] BC01S066_n11860CpteId ;
   private short[] BC01S066_A11862DesaID ;
   private boolean[] BC01S066_n11862DesaID ;
   private String[] BC01S066_A12328RevenID ;
   private boolean[] BC01S066_n12328RevenID ;
   private short[] BC01S072_A13994E_DisCliDe ;
   private boolean[] BC01S072_n13994E_DisCliDe ;
   private String[] BC01S073_A279CliNom ;
   private short[] BC01S076_A13995E_DisArtCo ;
   private boolean[] BC01S076_n13995E_DisArtCo ;
   private String[] BC01S077_A10888Dsc_Idtx ;
   private boolean[] BC01S077_n10888Dsc_Idtx ;
   private String[] BC01S078_A12327RevenNm ;
   private boolean[] BC01S078_n12327RevenNm ;
   private String[] BC01S079_A11660MarcaDsc ;
   private boolean[] BC01S079_n11660MarcaDsc ;
   private String[] BC01S080_A11865CpteDsc ;
   private boolean[] BC01S080_n11865CpteDsc ;
   private String[] BC01S081_A11866DesaDsc ;
   private boolean[] BC01S081_n11866DesaDsc ;
   private String[] BC01S082_A11867DptoDsc ;
   private boolean[] BC01S082_n11867DptoDsc ;
   private String[] BC01S083_A396EmprCod ;
   private int[] BC01S083_A361DisCod ;
   private String[] BC01S083_A13376DisTraID ;
   private String[] BC01S084_A396EmprCod ;
   private int[] BC01S084_A361DisCod ;
   private byte[] BC01S084_A13081DisDGLin ;
   private String[] BC01S084_A13082DisDGDibCl ;
   private int[] BC01S084_A13083DisDGDibIn ;
   private String[] BC01S084_A13084DisDGComb ;
   private String[] BC01S084_A13085DisDGFondo ;
   private String[] BC01S085_A396EmprCod ;
   private int[] BC01S085_A361DisCod ;
   private byte[] BC01S085_A7068DisNotLin ;
   private String[] BC01S086_A396EmprCod ;
   private int[] BC01S086_A361DisCod ;
   private String[] BC01S086_A10197ProEspCod ;
   private String[] BC01S087_A396EmprCod ;
   private int[] BC01S087_A361DisCod ;
   private short[] BC01S087_A4594AccCod ;
   private String[] BC01S088_A396EmprCod ;
   private int[] BC01S088_A361DisCod ;
   private byte[] BC01S088_A2524DisComLin ;
   private String[] BC01S088_A1056DisComCod ;
   private String[] BC01S088_A1032FonCod ;
   private String[] BC01S089_A396EmprCod ;
   private int[] BC01S089_A361DisCod ;
   private int[] BC01S089_A3398DisRefBarC ;
   private byte[] BC01S089_A3399DisRefBCRe ;
   private String[] BC01S089_A3400DisRefBCPa ;
   private String[] BC01S089_A3607DisRefBPie ;
   private String[] BC01S090_A396EmprCod ;
   private int[] BC01S090_A361DisCod ;
   private byte[] BC01S090_A376DisObsLin ;
   private String[] BC01S091_A396EmprCod ;
   private int[] BC01S091_A361DisCod ;
   private String[] BC01S091_A758ProCod ;
   private String[] BC01S092_A396EmprCod ;
   private int[] BC01S092_A129BarCod ;
   private byte[] BC01S092_A132BarCodReo ;
   private String[] BC01S092_A130BarCodPar ;
   private String[] BC01S093_A396EmprCod ;
   private int[] BC01S093_A361DisCod ;
   private int[] BC01S093_A44AlbRecCod ;
   private String[] BC01S093_A380DisPieCod ;
   private int[] BC01S094_A361DisCod ;
   private int[] BC01S094_A2310DisCliDes ;
   private String[] BC01S094_A2009DisTipDis ;
   private boolean[] BC01S094_n2009DisTipDis ;
   private String[] BC01S094_A337DisArtDsc ;
   private String[] BC01S094_A340DisArtMat ;
   private String[] BC01S094_A2835DisPle2 ;
   private String[] BC01S094_A339DisArtLar ;
   private String[] BC01S094_A351DisArtSua ;
   private String[] BC01S094_A333DisArtAca ;
   private String[] BC01S094_A343DisArtPle ;
   private short[] BC01S094_A352DisArtTip ;
   private String[] BC01S094_A338DisArtEnc ;
   private String[] BC01S094_A336DisArtCor ;
   private String[] BC01S094_A353DisArtTr1 ;
   private String[] BC01S094_A354DisArtTr2 ;
   private String[] BC01S094_A355DisArtTr3 ;
   private short[] BC01S094_A344DisArtPt1 ;
   private short[] BC01S094_A345DisArtPt2 ;
   private short[] BC01S094_A346DisArtPt3 ;
   private java.math.BigDecimal[] BC01S094_A350DisArtRdt ;
   private byte[] BC01S094_A359DisArtUrg ;
   private String[] BC01S094_A356DisArtUr1 ;
   private String[] BC01S094_A357DisArtUr2 ;
   private String[] BC01S094_A358DisArtUr3 ;
   private short[] BC01S094_A347DisArtPu1 ;
   private short[] BC01S094_A348DisArtPu2 ;
   private short[] BC01S094_A349DisArtPu3 ;
   private boolean[] BC01S094_n349DisArtPu3 ;
   private short[] BC01S094_A342DisArtPes ;
   private short[] BC01S094_A1225DisGraCru ;
   private short[] BC01S094_A334DisArtAnh ;
   private short[] BC01S094_A1231DisArtAn1 ;
   private short[] BC01S094_A1232DisArtAcb ;
   private short[] BC01S094_A1233DisArtAc2 ;
   private java.math.BigDecimal[] BC01S094_A1197DisEncCom ;
   private java.math.BigDecimal[] BC01S094_A1198DisEncAnh ;
   private short[] BC01S094_A3127DisNumCor ;
   private short[] BC01S094_A3128DisAncSal1 ;
   private short[] BC01S094_A3129DisAncSal2 ;
   private short[] BC01S094_A3130DisAncSal3 ;
   private short[] BC01S094_A3131DisGraAca2 ;
   private short[] BC01S094_A3132DisGraCru2 ;
   private short[] BC01S094_A1906DisGraAca ;
   private java.math.BigDecimal[] BC01S094_A1908DisRdoA ;
   private java.math.BigDecimal[] BC01S094_A1907DisRdoN ;
   private String[] BC01S094_A5349DisObsGrm ;
   private String[] BC01S094_A5350DisObsAnc ;
   private String[] BC01S094_A9786DisItem5 ;
   private String[] BC01S094_A392DisUniMed ;
   private String[] BC01S094_A407EmprNom ;
   private boolean[] BC01S094_n407EmprNom ;
   private String[] BC01S094_A757PriCod ;
   private String[] BC01S094_A4813DisEncCli ;
   private String[] BC01S094_A279CliNom ;
   private java.util.Date[] BC01S094_A369DisFec ;
   private java.util.Date[] BC01S094_A370DisFecCli ;
   private java.util.Date[] BC01S094_A371DisFecEnt ;
   private String[] BC01S094_A335DisArtCod ;
   private String[] BC01S094_A362DisColNom ;
   private boolean[] BC01S094_n362DisColNom ;
   private int[] BC01S094_A363DisColNum ;
   private boolean[] BC01S094_n363DisColNum ;
   private byte[] BC01S094_A367DisEst ;
   private String[] BC01S094_A365DisDes ;
   private String[] BC01S094_A13987DisArtDsc2 ;
   private String[] BC01S094_A10888Dsc_Idtx ;
   private boolean[] BC01S094_n10888Dsc_Idtx ;
   private String[] BC01S094_A11661DisOrdComp ;
   private String[] BC01S094_A12327RevenNm ;
   private boolean[] BC01S094_n12327RevenNm ;
   private String[] BC01S094_A11660MarcaDsc ;
   private boolean[] BC01S094_n11660MarcaDsc ;
   private byte[] BC01S094_A12765DisPriorid ;
   private String[] BC01S094_A11859Nxt_modelo ;
   private String[] BC01S094_A11865CpteDsc ;
   private boolean[] BC01S094_n11865CpteDsc ;
   private String[] BC01S094_A11861Nxt_statio ;
   private String[] BC01S094_A11866DesaDsc ;
   private boolean[] BC01S094_n11866DesaDsc ;
   private String[] BC01S094_A11867DptoDsc ;
   private boolean[] BC01S094_n11867DptoDsc ;
   private String[] BC01S094_A11864Nxt_artcli ;
   private String[] BC01S094_A7739DisExp ;
   private String[] BC01S094_A396EmprCod ;
   private int[] BC01S094_A252CliCod ;
   private byte[] BC01S094_A390DisTipCol ;
   private boolean[] BC01S094_n390DisTipCol ;
   private String[] BC01S094_A10887Cod_Idtx ;
   private boolean[] BC01S094_n10887Cod_Idtx ;
   private String[] BC01S094_A13986DisIdtx2 ;
   private boolean[] BC01S094_n13986DisIdtx2 ;
   private String[] BC01S094_A11659MarcaId ;
   private boolean[] BC01S094_n11659MarcaId ;
   private short[] BC01S094_A11863DptoID ;
   private boolean[] BC01S094_n11863DptoID ;
   private short[] BC01S094_A11860CpteId ;
   private boolean[] BC01S094_n11860CpteId ;
   private short[] BC01S094_A11862DesaID ;
   private boolean[] BC01S094_n11862DesaID ;
   private String[] BC01S094_A12328RevenID ;
   private boolean[] BC01S094_n12328RevenID ;
   private int[] BC01S095_A361DisCod ;
   private String[] BC01S095_A13216DisNormDsc ;
   private boolean[] BC01S095_n13216DisNormDsc ;
   private String[] BC01S095_A13214DisNormSt ;
   private String[] BC01S095_A13215DisNormNC ;
   private String[] BC01S095_A396EmprCod ;
   private String[] BC01S095_A13213DisNormID ;
   private String[] BC01S096_A13216DisNormDsc ;
   private boolean[] BC01S096_n13216DisNormDsc ;
   private String[] BC01S097_A396EmprCod ;
   private int[] BC01S097_A361DisCod ;
   private String[] BC01S097_A13213DisNormID ;
   private int[] BC01S098_A361DisCod ;
   private String[] BC01S098_A13214DisNormSt ;
   private String[] BC01S098_A13215DisNormNC ;
   private String[] BC01S098_A396EmprCod ;
   private String[] BC01S098_A13213DisNormID ;
   private int[] BC01S099_A361DisCod ;
   private String[] BC01S099_A13214DisNormSt ;
   private String[] BC01S099_A13215DisNormNC ;
   private String[] BC01S099_A396EmprCod ;
   private String[] BC01S099_A13213DisNormID ;
   private String[] BC01S0103_A13216DisNormDsc ;
   private boolean[] BC01S0103_n13216DisNormDsc ;
   private int[] BC01S0104_A361DisCod ;
   private String[] BC01S0104_A13216DisNormDsc ;
   private boolean[] BC01S0104_n13216DisNormDsc ;
   private String[] BC01S0104_A13214DisNormSt ;
   private String[] BC01S0104_A13215DisNormNC ;
   private String[] BC01S0104_A396EmprCod ;
   private String[] BC01S0104_A13213DisNormID ;
   private int[] BC01S0105_A361DisCod ;
   private String[] BC01S0105_A3613AlbRefDsc ;
   private String[] BC01S0105_A55AlbRReo ;
   private int[] BC01S0105_A673Piezas ;
   private java.math.BigDecimal[] BC01S0105_A595Kilos ;
   private java.math.BigDecimal[] BC01S0105_A631Metros ;
   private java.math.BigDecimal[] BC01S0105_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01S0105_A60AlbRUniUti ;
   private int[] BC01S0105_A52AlbRPieEnt ;
   private int[] BC01S0105_A54AlbRPieUti ;
   private String[] BC01S0105_A396EmprCod ;
   private int[] BC01S0105_A44AlbRecCod ;
   private String[] BC01S0106_A3613AlbRefDsc ;
   private String[] BC01S0106_A55AlbRReo ;
   private java.math.BigDecimal[] BC01S0106_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01S0106_A60AlbRUniUti ;
   private int[] BC01S0106_A52AlbRPieEnt ;
   private int[] BC01S0106_A54AlbRPieUti ;
   private String[] BC01S0107_A396EmprCod ;
   private int[] BC01S0107_A361DisCod ;
   private int[] BC01S0107_A44AlbRecCod ;
   private int[] BC01S0108_A361DisCod ;
   private int[] BC01S0108_A673Piezas ;
   private java.math.BigDecimal[] BC01S0108_A595Kilos ;
   private java.math.BigDecimal[] BC01S0108_A631Metros ;
   private String[] BC01S0108_A396EmprCod ;
   private int[] BC01S0108_A44AlbRecCod ;
   private int[] BC01S0109_A361DisCod ;
   private int[] BC01S0109_A673Piezas ;
   private java.math.BigDecimal[] BC01S0109_A595Kilos ;
   private java.math.BigDecimal[] BC01S0109_A631Metros ;
   private String[] BC01S0109_A396EmprCod ;
   private int[] BC01S0109_A44AlbRecCod ;
   private String[] BC01S0113_A3613AlbRefDsc ;
   private String[] BC01S0113_A55AlbRReo ;
   private java.math.BigDecimal[] BC01S0113_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01S0113_A60AlbRUniUti ;
   private int[] BC01S0113_A52AlbRPieEnt ;
   private int[] BC01S0113_A54AlbRPieUti ;
   private String[] BC01S0114_A396EmprCod ;
   private int[] BC01S0114_A361DisCod ;
   private int[] BC01S0114_A44AlbRecCod ;
   private String[] BC01S0114_A9756Dis_CUb ;
   private String[] BC01S0115_A396EmprCod ;
   private int[] BC01S0115_A361DisCod ;
   private int[] BC01S0115_A44AlbRecCod ;
   private String[] BC01S0115_A380DisPieCod ;
   private int[] BC01S0116_A361DisCod ;
   private String[] BC01S0116_A3613AlbRefDsc ;
   private String[] BC01S0116_A55AlbRReo ;
   private int[] BC01S0116_A673Piezas ;
   private java.math.BigDecimal[] BC01S0116_A595Kilos ;
   private java.math.BigDecimal[] BC01S0116_A631Metros ;
   private java.math.BigDecimal[] BC01S0116_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01S0116_A60AlbRUniUti ;
   private int[] BC01S0116_A52AlbRPieEnt ;
   private int[] BC01S0116_A54AlbRPieUti ;
   private String[] BC01S0116_A396EmprCod ;
   private int[] BC01S0116_A44AlbRecCod ;
   private int[] BC01S0117_A361DisCod ;
   private String[] BC01S0117_A834TipDefDsc ;
   private boolean[] BC01S0117_n834TipDefDsc ;
   private short[] BC01S0117_A319DefPor ;
   private String[] BC01S0117_A396EmprCod ;
   private short[] BC01S0117_A833TipDefCod ;
   private boolean[] BC01S0117_n833TipDefCod ;
   private String[] BC01S0118_A834TipDefDsc ;
   private boolean[] BC01S0118_n834TipDefDsc ;
   private String[] BC01S0119_A396EmprCod ;
   private int[] BC01S0119_A361DisCod ;
   private short[] BC01S0119_A833TipDefCod ;
   private boolean[] BC01S0119_n833TipDefCod ;
   private int[] BC01S0120_A361DisCod ;
   private short[] BC01S0120_A319DefPor ;
   private String[] BC01S0120_A396EmprCod ;
   private short[] BC01S0120_A833TipDefCod ;
   private boolean[] BC01S0120_n833TipDefCod ;
   private int[] BC01S0121_A361DisCod ;
   private short[] BC01S0121_A319DefPor ;
   private String[] BC01S0121_A396EmprCod ;
   private short[] BC01S0121_A833TipDefCod ;
   private boolean[] BC01S0121_n833TipDefCod ;
   private String[] BC01S0125_A834TipDefDsc ;
   private boolean[] BC01S0125_n834TipDefDsc ;
   private String[] BC01S0126_A396EmprCod ;
   private int[] BC01S0126_A129BarCod ;
   private byte[] BC01S0126_A132BarCodReo ;
   private String[] BC01S0126_A130BarCodPar ;
   private int[] BC01S0127_A361DisCod ;
   private String[] BC01S0127_A834TipDefDsc ;
   private boolean[] BC01S0127_n834TipDefDsc ;
   private short[] BC01S0127_A319DefPor ;
   private String[] BC01S0127_A396EmprCod ;
   private short[] BC01S0127_A833TipDefCod ;
   private boolean[] BC01S0127_n833TipDefCod ;
   private int[] BC01S0128_A361DisCod ;
   private String[] BC01S0128_A759ProDsc ;
   private short[] BC01S0128_A846UltFasLin ;
   private String[] BC01S0128_A396EmprCod ;
   private String[] BC01S0128_A758ProCod ;
   private String[] BC01S0129_A759ProDsc ;
   private String[] BC01S0130_A396EmprCod ;
   private int[] BC01S0130_A361DisCod ;
   private String[] BC01S0130_A758ProCod ;
   private int[] BC01S0131_A361DisCod ;
   private short[] BC01S0131_A846UltFasLin ;
   private String[] BC01S0131_A396EmprCod ;
   private String[] BC01S0131_A758ProCod ;
   private int[] BC01S0132_A361DisCod ;
   private short[] BC01S0132_A846UltFasLin ;
   private String[] BC01S0132_A396EmprCod ;
   private String[] BC01S0132_A758ProCod ;
   private String[] BC01S0136_A759ProDsc ;
   private String[] BC01S0137_A396EmprCod ;
   private int[] BC01S0137_A361DisCod ;
   private String[] BC01S0137_A758ProCod ;
   private short[] BC01S0137_A368DisFasLin ;
   private int[] BC01S0138_A361DisCod ;
   private String[] BC01S0138_A759ProDsc ;
   private short[] BC01S0138_A846UltFasLin ;
   private String[] BC01S0138_A396EmprCod ;
   private String[] BC01S0138_A758ProCod ;
   private int[] BC01S0139_A361DisCod ;
   private String[] BC01S0139_A758ProCod ;
   private short[] BC01S0139_A368DisFasLin ;
   private String[] BC01S0139_A460FasDsc ;
   private short[] BC01S0139_A5376DisQuiUl ;
   private byte[] BC01S0139_A7744FasPreObl ;
   private boolean[] BC01S0139_n7744FasPreObl ;
   private String[] BC01S0139_A396EmprCod ;
   private String[] BC01S0139_A457FasCod ;
   private String[] BC01S0140_A460FasDsc ;
   private byte[] BC01S0140_A7744FasPreObl ;
   private boolean[] BC01S0140_n7744FasPreObl ;
   private String[] BC01S0141_A396EmprCod ;
   private int[] BC01S0141_A361DisCod ;
   private String[] BC01S0141_A758ProCod ;
   private short[] BC01S0141_A368DisFasLin ;
   private int[] BC01S0142_A361DisCod ;
   private String[] BC01S0142_A758ProCod ;
   private short[] BC01S0142_A368DisFasLin ;
   private short[] BC01S0142_A5376DisQuiUl ;
   private String[] BC01S0142_A396EmprCod ;
   private String[] BC01S0142_A457FasCod ;
   private int[] BC01S0143_A361DisCod ;
   private String[] BC01S0143_A758ProCod ;
   private short[] BC01S0143_A368DisFasLin ;
   private short[] BC01S0143_A5376DisQuiUl ;
   private String[] BC01S0143_A396EmprCod ;
   private String[] BC01S0143_A457FasCod ;
   private String[] BC01S0147_A460FasDsc ;
   private byte[] BC01S0147_A7744FasPreObl ;
   private boolean[] BC01S0147_n7744FasPreObl ;
   private String[] BC01S0148_A396EmprCod ;
   private int[] BC01S0148_A361DisCod ;
   private String[] BC01S0148_A758ProCod ;
   private short[] BC01S0148_A368DisFasLin ;
   private short[] BC01S0148_A7919Dta_Ordl ;
   private String[] BC01S0149_A396EmprCod ;
   private int[] BC01S0149_A361DisCod ;
   private String[] BC01S0149_A758ProCod ;
   private short[] BC01S0149_A368DisFasLin ;
   private short[] BC01S0149_A7727ArtAdiCod ;
   private String[] BC01S0150_A396EmprCod ;
   private int[] BC01S0150_A361DisCod ;
   private String[] BC01S0150_A758ProCod ;
   private short[] BC01S0150_A368DisFasLin ;
   private int[] BC01S0150_A5035A_Discod ;
   private String[] BC01S0150_A5038A_DProcod ;
   private short[] BC01S0150_A5039A_DOrdlin ;
   private int[] BC01S0151_A361DisCod ;
   private String[] BC01S0151_A758ProCod ;
   private short[] BC01S0151_A368DisFasLin ;
   private String[] BC01S0151_A460FasDsc ;
   private short[] BC01S0151_A5376DisQuiUl ;
   private byte[] BC01S0151_A7744FasPreObl ;
   private boolean[] BC01S0151_n7744FasPreObl ;
   private String[] BC01S0151_A396EmprCod ;
   private String[] BC01S0151_A457FasCod ;
   private int[] BC01S0152_A361DisCod ;
   private String[] BC01S0152_A758ProCod ;
   private short[] BC01S0152_A368DisFasLin ;
   private short[] BC01S0152_A5377DisQuiLin ;
   private String[] BC01S0152_A766ProForDsc ;
   private String[] BC01S0152_A396EmprCod ;
   private String[] BC01S0152_A764ProForCod ;
   private String[] BC01S0153_A766ProForDsc ;
   private String[] BC01S0154_A396EmprCod ;
   private int[] BC01S0154_A361DisCod ;
   private String[] BC01S0154_A758ProCod ;
   private short[] BC01S0154_A368DisFasLin ;
   private short[] BC01S0154_A5377DisQuiLin ;
   private int[] BC01S0155_A361DisCod ;
   private String[] BC01S0155_A758ProCod ;
   private short[] BC01S0155_A368DisFasLin ;
   private short[] BC01S0155_A5377DisQuiLin ;
   private String[] BC01S0155_A396EmprCod ;
   private String[] BC01S0155_A764ProForCod ;
   private int[] BC01S0156_A361DisCod ;
   private String[] BC01S0156_A758ProCod ;
   private short[] BC01S0156_A368DisFasLin ;
   private short[] BC01S0156_A5377DisQuiLin ;
   private String[] BC01S0156_A396EmprCod ;
   private String[] BC01S0156_A764ProForCod ;
   private String[] BC01S0160_A766ProForDsc ;
   private int[] BC01S0161_A361DisCod ;
   private String[] BC01S0161_A758ProCod ;
   private short[] BC01S0161_A368DisFasLin ;
   private short[] BC01S0161_A5377DisQuiLin ;
   private String[] BC01S0161_A766ProForDsc ;
   private String[] BC01S0161_A396EmprCod ;
   private String[] BC01S0161_A764ProForCod ;
   private int[] BC01S0162_A361DisCod ;
   private String[] BC01S0162_A758ProCod ;
   private short[] BC01S0162_A368DisFasLin ;
   private String[] BC01S0162_A12672DisParVl2 ;
   private String[] BC01S0162_A3686DisParObs ;
   private String[] BC01S0162_A396EmprCod ;
   private short[] BC01S0162_A1664ParFasCod ;
   private String[] BC01S0163_A396EmprCod ;
   private String[] BC01S0164_A396EmprCod ;
   private int[] BC01S0164_A361DisCod ;
   private String[] BC01S0164_A758ProCod ;
   private short[] BC01S0164_A368DisFasLin ;
   private short[] BC01S0164_A1664ParFasCod ;
   private int[] BC01S0165_A361DisCod ;
   private String[] BC01S0165_A758ProCod ;
   private short[] BC01S0165_A368DisFasLin ;
   private String[] BC01S0165_A12672DisParVl2 ;
   private String[] BC01S0165_A3686DisParObs ;
   private String[] BC01S0165_A396EmprCod ;
   private short[] BC01S0165_A1664ParFasCod ;
   private int[] BC01S0166_A361DisCod ;
   private String[] BC01S0166_A758ProCod ;
   private short[] BC01S0166_A368DisFasLin ;
   private String[] BC01S0166_A12672DisParVl2 ;
   private String[] BC01S0166_A3686DisParObs ;
   private String[] BC01S0166_A396EmprCod ;
   private short[] BC01S0166_A1664ParFasCod ;
   private int[] BC01S0170_A361DisCod ;
   private String[] BC01S0170_A758ProCod ;
   private short[] BC01S0170_A368DisFasLin ;
   private String[] BC01S0170_A12672DisParVl2 ;
   private String[] BC01S0170_A3686DisParObs ;
   private String[] BC01S0170_A396EmprCod ;
   private short[] BC01S0170_A1664ParFasCod ;
   private String[] BC01S0171_A407EmprNom ;
   private boolean[] BC01S0171_n407EmprNom ;
   private short[] BC01S0174_A13994E_DisCliDe ;
   private boolean[] BC01S0174_n13994E_DisCliDe ;
   private String[] BC01S0175_A407EmprNom ;
   private boolean[] BC01S0175_n407EmprNom ;
   private short[] BC01S0178_A13994E_DisCliDe ;
   private boolean[] BC01S0178_n13994E_DisCliDe ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] BC01S02_A361DisCod ;
   private String[] BC01S02_A758ProCod ;
   private short[] BC01S02_A368DisFasLin ;
   private String[] BC01S02_A12672DisParVl2 ;
   private String[] BC01S02_A3686DisParObs ;
   private String[] BC01S02_A396EmprCod ;
   private short[] BC01S02_A1664ParFasCod ;
   private int[] BC01S03_A361DisCod ;
   private String[] BC01S03_A758ProCod ;
   private short[] BC01S03_A368DisFasLin ;
   private String[] BC01S03_A12672DisParVl2 ;
   private String[] BC01S03_A3686DisParObs ;
   private String[] BC01S03_A396EmprCod ;
   private short[] BC01S03_A1664ParFasCod ;
   private String[] BC01S04_A396EmprCod ;
   private int[] BC01S05_A361DisCod ;
   private String[] BC01S05_A758ProCod ;
   private short[] BC01S05_A368DisFasLin ;
   private short[] BC01S05_A5377DisQuiLin ;
   private String[] BC01S05_A396EmprCod ;
   private String[] BC01S05_A764ProForCod ;
   private int[] BC01S06_A361DisCod ;
   private String[] BC01S06_A758ProCod ;
   private short[] BC01S06_A368DisFasLin ;
   private short[] BC01S06_A5377DisQuiLin ;
   private String[] BC01S06_A396EmprCod ;
   private String[] BC01S06_A764ProForCod ;
   private String[] BC01S07_A766ProForDsc ;
   private int[] BC01S08_A361DisCod ;
   private String[] BC01S08_A758ProCod ;
   private short[] BC01S08_A368DisFasLin ;
   private short[] BC01S08_A5376DisQuiUl ;
   private String[] BC01S08_A396EmprCod ;
   private String[] BC01S08_A457FasCod ;
   private byte[] BC01S08_A7744FasPreObl ;
   private int[] BC01S09_A361DisCod ;
   private String[] BC01S09_A758ProCod ;
   private short[] BC01S09_A368DisFasLin ;
   private short[] BC01S09_A5376DisQuiUl ;
   private String[] BC01S09_A396EmprCod ;
   private String[] BC01S09_A457FasCod ;
   private byte[] BC01S09_A7744FasPreObl ;
   private String[] BC01S010_A460FasDsc ;
   private byte[] BC01S010_A7744FasPreObl ;
   private int[] BC01S011_A361DisCod ;
   private short[] BC01S011_A846UltFasLin ;
   private String[] BC01S011_A396EmprCod ;
   private String[] BC01S011_A758ProCod ;
   private int[] BC01S012_A361DisCod ;
   private short[] BC01S012_A846UltFasLin ;
   private String[] BC01S012_A396EmprCod ;
   private String[] BC01S012_A758ProCod ;
   private String[] BC01S013_A759ProDsc ;
   private int[] BC01S014_A361DisCod ;
   private short[] BC01S014_A319DefPor ;
   private String[] BC01S014_A396EmprCod ;
   private short[] BC01S014_A833TipDefCod ;
   private int[] BC01S015_A361DisCod ;
   private short[] BC01S015_A319DefPor ;
   private String[] BC01S015_A396EmprCod ;
   private short[] BC01S015_A833TipDefCod ;
   private String[] BC01S016_A834TipDefDsc ;
   private int[] BC01S017_A361DisCod ;
   private int[] BC01S017_A673Piezas ;
   private java.math.BigDecimal[] BC01S017_A595Kilos ;
   private java.math.BigDecimal[] BC01S017_A631Metros ;
   private String[] BC01S017_A396EmprCod ;
   private int[] BC01S017_A44AlbRecCod ;
   private int[] BC01S018_A361DisCod ;
   private int[] BC01S018_A673Piezas ;
   private java.math.BigDecimal[] BC01S018_A595Kilos ;
   private java.math.BigDecimal[] BC01S018_A631Metros ;
   private String[] BC01S018_A396EmprCod ;
   private int[] BC01S018_A44AlbRecCod ;
   private String[] BC01S019_A3613AlbRefDsc ;
   private String[] BC01S019_A55AlbRReo ;
   private java.math.BigDecimal[] BC01S019_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01S019_A60AlbRUniUti ;
   private int[] BC01S019_A52AlbRPieEnt ;
   private int[] BC01S019_A54AlbRPieUti ;
   private int[] BC01S020_A361DisCod ;
   private String[] BC01S020_A13214DisNormSt ;
   private String[] BC01S020_A13215DisNormNC ;
   private String[] BC01S020_A396EmprCod ;
   private String[] BC01S020_A13213DisNormID ;
   private int[] BC01S021_A361DisCod ;
   private String[] BC01S021_A13214DisNormSt ;
   private String[] BC01S021_A13215DisNormNC ;
   private String[] BC01S021_A396EmprCod ;
   private String[] BC01S021_A13213DisNormID ;
   private String[] BC01S022_A13216DisNormDsc ;
   private int[] BC01S023_A361DisCod ;
   private int[] BC01S023_A2310DisCliDes ;
   private String[] BC01S023_A2009DisTipDis ;
   private String[] BC01S023_A337DisArtDsc ;
   private String[] BC01S023_A340DisArtMat ;
   private String[] BC01S023_A2835DisPle2 ;
   private String[] BC01S023_A339DisArtLar ;
   private String[] BC01S023_A351DisArtSua ;
   private String[] BC01S023_A333DisArtAca ;
   private String[] BC01S023_A343DisArtPle ;
   private short[] BC01S023_A352DisArtTip ;
   private String[] BC01S023_A338DisArtEnc ;
   private String[] BC01S023_A336DisArtCor ;
   private String[] BC01S023_A353DisArtTr1 ;
   private String[] BC01S023_A354DisArtTr2 ;
   private String[] BC01S023_A355DisArtTr3 ;
   private short[] BC01S023_A344DisArtPt1 ;
   private short[] BC01S023_A345DisArtPt2 ;
   private short[] BC01S023_A346DisArtPt3 ;
   private java.math.BigDecimal[] BC01S023_A350DisArtRdt ;
   private byte[] BC01S023_A359DisArtUrg ;
   private String[] BC01S023_A356DisArtUr1 ;
   private String[] BC01S023_A357DisArtUr2 ;
   private String[] BC01S023_A358DisArtUr3 ;
   private short[] BC01S023_A347DisArtPu1 ;
   private short[] BC01S023_A348DisArtPu2 ;
   private short[] BC01S023_A349DisArtPu3 ;
   private short[] BC01S023_A342DisArtPes ;
   private short[] BC01S023_A1225DisGraCru ;
   private short[] BC01S023_A334DisArtAnh ;
   private short[] BC01S023_A1231DisArtAn1 ;
   private short[] BC01S023_A1232DisArtAcb ;
   private short[] BC01S023_A1233DisArtAc2 ;
   private java.math.BigDecimal[] BC01S023_A1197DisEncCom ;
   private java.math.BigDecimal[] BC01S023_A1198DisEncAnh ;
   private short[] BC01S023_A3127DisNumCor ;
   private short[] BC01S023_A3128DisAncSal1 ;
   private short[] BC01S023_A3129DisAncSal2 ;
   private short[] BC01S023_A3130DisAncSal3 ;
   private short[] BC01S023_A3131DisGraAca2 ;
   private short[] BC01S023_A3132DisGraCru2 ;
   private short[] BC01S023_A1906DisGraAca ;
   private java.math.BigDecimal[] BC01S023_A1908DisRdoA ;
   private java.math.BigDecimal[] BC01S023_A1907DisRdoN ;
   private String[] BC01S023_A5349DisObsGrm ;
   private String[] BC01S023_A5350DisObsAnc ;
   private String[] BC01S023_A9786DisItem5 ;
   private String[] BC01S023_A392DisUniMed ;
   private String[] BC01S023_A757PriCod ;
   private String[] BC01S023_A4813DisEncCli ;
   private java.util.Date[] BC01S023_A369DisFec ;
   private java.util.Date[] BC01S023_A370DisFecCli ;
   private java.util.Date[] BC01S023_A371DisFecEnt ;
   private String[] BC01S023_A335DisArtCod ;
   private String[] BC01S023_A362DisColNom ;
   private int[] BC01S023_A363DisColNum ;
   private byte[] BC01S023_A367DisEst ;
   private String[] BC01S023_A365DisDes ;
   private String[] BC01S023_A13987DisArtDsc2 ;
   private String[] BC01S023_A11661DisOrdComp ;
   private byte[] BC01S023_A12765DisPriorid ;
   private String[] BC01S023_A11859Nxt_modelo ;
   private String[] BC01S023_A11861Nxt_statio ;
   private String[] BC01S023_A11864Nxt_artcli ;
   private String[] BC01S023_A7739DisExp ;
   private String[] BC01S023_A396EmprCod ;
   private int[] BC01S023_A252CliCod ;
   private byte[] BC01S023_A390DisTipCol ;
   private String[] BC01S023_A10887Cod_Idtx ;
   private String[] BC01S023_A13986DisIdtx2 ;
   private String[] BC01S023_A11659MarcaId ;
   private short[] BC01S023_A11863DptoID ;
   private short[] BC01S023_A11860CpteId ;
   private short[] BC01S023_A11862DesaID ;
   private String[] BC01S023_A12328RevenID ;
   private int[] BC01S024_A361DisCod ;
   private int[] BC01S024_A2310DisCliDes ;
   private String[] BC01S024_A2009DisTipDis ;
   private String[] BC01S024_A337DisArtDsc ;
   private String[] BC01S024_A340DisArtMat ;
   private String[] BC01S024_A2835DisPle2 ;
   private String[] BC01S024_A339DisArtLar ;
   private String[] BC01S024_A351DisArtSua ;
   private String[] BC01S024_A333DisArtAca ;
   private String[] BC01S024_A343DisArtPle ;
   private short[] BC01S024_A352DisArtTip ;
   private String[] BC01S024_A338DisArtEnc ;
   private String[] BC01S024_A336DisArtCor ;
   private String[] BC01S024_A353DisArtTr1 ;
   private String[] BC01S024_A354DisArtTr2 ;
   private String[] BC01S024_A355DisArtTr3 ;
   private short[] BC01S024_A344DisArtPt1 ;
   private short[] BC01S024_A345DisArtPt2 ;
   private short[] BC01S024_A346DisArtPt3 ;
   private java.math.BigDecimal[] BC01S024_A350DisArtRdt ;
   private byte[] BC01S024_A359DisArtUrg ;
   private String[] BC01S024_A356DisArtUr1 ;
   private String[] BC01S024_A357DisArtUr2 ;
   private String[] BC01S024_A358DisArtUr3 ;
   private short[] BC01S024_A347DisArtPu1 ;
   private short[] BC01S024_A348DisArtPu2 ;
   private short[] BC01S024_A349DisArtPu3 ;
   private short[] BC01S024_A342DisArtPes ;
   private short[] BC01S024_A1225DisGraCru ;
   private short[] BC01S024_A334DisArtAnh ;
   private short[] BC01S024_A1231DisArtAn1 ;
   private short[] BC01S024_A1232DisArtAcb ;
   private short[] BC01S024_A1233DisArtAc2 ;
   private java.math.BigDecimal[] BC01S024_A1197DisEncCom ;
   private java.math.BigDecimal[] BC01S024_A1198DisEncAnh ;
   private short[] BC01S024_A3127DisNumCor ;
   private short[] BC01S024_A3128DisAncSal1 ;
   private short[] BC01S024_A3129DisAncSal2 ;
   private short[] BC01S024_A3130DisAncSal3 ;
   private short[] BC01S024_A3131DisGraAca2 ;
   private short[] BC01S024_A3132DisGraCru2 ;
   private short[] BC01S024_A1906DisGraAca ;
   private java.math.BigDecimal[] BC01S024_A1908DisRdoA ;
   private java.math.BigDecimal[] BC01S024_A1907DisRdoN ;
   private String[] BC01S024_A5349DisObsGrm ;
   private String[] BC01S024_A5350DisObsAnc ;
   private String[] BC01S024_A9786DisItem5 ;
   private String[] BC01S024_A392DisUniMed ;
   private String[] BC01S024_A757PriCod ;
   private String[] BC01S024_A4813DisEncCli ;
   private java.util.Date[] BC01S024_A369DisFec ;
   private java.util.Date[] BC01S024_A370DisFecCli ;
   private java.util.Date[] BC01S024_A371DisFecEnt ;
   private String[] BC01S024_A335DisArtCod ;
   private String[] BC01S024_A362DisColNom ;
   private int[] BC01S024_A363DisColNum ;
   private byte[] BC01S024_A367DisEst ;
   private String[] BC01S024_A365DisDes ;
   private String[] BC01S024_A13987DisArtDsc2 ;
   private String[] BC01S024_A11661DisOrdComp ;
   private byte[] BC01S024_A12765DisPriorid ;
   private String[] BC01S024_A11859Nxt_modelo ;
   private String[] BC01S024_A11861Nxt_statio ;
   private String[] BC01S024_A11864Nxt_artcli ;
   private String[] BC01S024_A7739DisExp ;
   private String[] BC01S024_A396EmprCod ;
   private int[] BC01S024_A252CliCod ;
   private byte[] BC01S024_A390DisTipCol ;
   private String[] BC01S024_A10887Cod_Idtx ;
   private String[] BC01S024_A13986DisIdtx2 ;
   private String[] BC01S024_A11659MarcaId ;
   private short[] BC01S024_A11863DptoID ;
   private short[] BC01S024_A11860CpteId ;
   private short[] BC01S024_A11862DesaID ;
   private String[] BC01S024_A12328RevenID ;
   private short[] BC01S027_A13994E_DisCliDe ;
   private short[] BC01S030_A13995E_DisArtCo ;
   private String[] BC01S031_A407EmprNom ;
   private String[] BC01S032_A279CliNom ;
   private String[] BC01S033_A396EmprCod ;
   private String[] BC01S034_A10888Dsc_Idtx ;
   private String[] BC01S035_A396EmprCod ;
   private String[] BC01S036_A11660MarcaDsc ;
   private String[] BC01S037_A11867DptoDsc ;
   private String[] BC01S038_A11865CpteDsc ;
   private String[] BC01S039_A11866DesaDsc ;
   private String[] BC01S040_A12327RevenNm ;
   private boolean[] BC01S08_n7744FasPreObl ;
   private boolean[] BC01S09_n7744FasPreObl ;
   private boolean[] BC01S010_n7744FasPreObl ;
   private boolean[] BC01S016_n834TipDefDsc ;
   private boolean[] BC01S022_n13216DisNormDsc ;
   private boolean[] BC01S023_n2009DisTipDis ;
   private boolean[] BC01S023_n349DisArtPu3 ;
   private boolean[] BC01S023_n362DisColNom ;
   private boolean[] BC01S023_n363DisColNum ;
   private boolean[] BC01S023_n390DisTipCol ;
   private boolean[] BC01S023_n10887Cod_Idtx ;
   private boolean[] BC01S023_n13986DisIdtx2 ;
   private boolean[] BC01S023_n11659MarcaId ;
   private boolean[] BC01S023_n11863DptoID ;
   private boolean[] BC01S023_n11860CpteId ;
   private boolean[] BC01S023_n11862DesaID ;
   private boolean[] BC01S023_n12328RevenID ;
   private boolean[] BC01S024_n2009DisTipDis ;
   private boolean[] BC01S024_n349DisArtPu3 ;
   private boolean[] BC01S024_n362DisColNom ;
   private boolean[] BC01S024_n363DisColNum ;
   private boolean[] BC01S024_n390DisTipCol ;
   private boolean[] BC01S024_n10887Cod_Idtx ;
   private boolean[] BC01S024_n13986DisIdtx2 ;
   private boolean[] BC01S024_n11659MarcaId ;
   private boolean[] BC01S024_n11863DptoID ;
   private boolean[] BC01S024_n11860CpteId ;
   private boolean[] BC01S024_n11862DesaID ;
   private boolean[] BC01S024_n12328RevenID ;
   private boolean[] BC01S027_n13994E_DisCliDe ;
   private boolean[] BC01S030_n13995E_DisArtCo ;
   private boolean[] BC01S031_n407EmprNom ;
   private boolean[] BC01S034_n10888Dsc_Idtx ;
   private boolean[] BC01S036_n11660MarcaDsc ;
   private boolean[] BC01S037_n11867DptoDsc ;
   private boolean[] BC01S038_n11865CpteDsc ;
   private boolean[] BC01S039_n11866DesaDsc ;
   private boolean[] BC01S040_n12327RevenNm ;
}

final  class pedido_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class pedido_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pedido_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pedido_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pedido_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01S02", "SELECT DisCod, ProCod, DisFasLin, DisParVl2, DisParObs, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?  FOR UPDATE OF DisParVl2, DisParObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S03", "SELECT DisCod, ProCod, DisFasLin, DisParVl2, DisParObs, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S04", "SELECT EmprCod FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S05", "SELECT DisCod, ProCod, DisFasLin, DisQuiLin, EmprCod, ProForCod FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?  FOR UPDATE OF ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S06", "SELECT DisCod, ProCod, DisFasLin, DisQuiLin, EmprCod, ProForCod FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S07", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S08", "SELECT DisCod, ProCod, DisFasLin, DisQuiUl, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF DisQuiUl, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S09", "SELECT DisCod, ProCod, DisFasLin, DisQuiUl, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S010", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S011", "SELECT DisCod, UltFasLin, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF UltFasLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S012", "SELECT DisCod, UltFasLin, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S013", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S014", "SELECT DisCod, DefPor, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?  FOR UPDATE OF DefPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S015", "SELECT DisCod, DefPor, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S016", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S017", "SELECT DisCod, Piezas, Kilos, Metros, EmprCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF Piezas, Kilos, Metros NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S018", "SELECT DisCod, Piezas, Kilos, Metros, EmprCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S019", "SELECT AlbRefDsc, AlbRReo, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S020", "SELECT DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?  FOR UPDATE OF DisNormSt, DisNormNC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S021", "SELECT DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S022", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S023", "SELECT DisCod, DisCliDes, DisTipDis, DisArtDsc, DisArtMat, DisPle2, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisArtPes, DisGraCru, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEncCom, DisEncAnh, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisGraAca, DisRdoA, DisRdoN, DisObsGrm, DisObsAnc, DisItem5, DisUniMed, PriCod, DisEncCli, DisFec, DisFecCli, DisFecEnt, DisArtCod, DisColNom, DisColNum, DisEst, DisDes, DisArtDsc2, DisOrdComp, DisPriorid, Nxt_modelo, Nxt_statio, Nxt_artcli, DisExp, EmprCod, CliCod, DisTipCol, Cod_Idtx, DisIdtx2, MarcaId, DptoID, CpteId, DesaID, RevenID FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisCliDes, DisTipDis, DisArtDsc, DisArtMat, DisPle2, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisArtPes, DisGraCru, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEncCom, DisEncAnh, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisGraAca, DisRdoA, DisRdoN, DisObsGrm, DisObsAnc, DisItem5, DisUniMed, PriCod, DisEncCli, DisFec, DisFecCli, DisFecEnt, DisArtCod, DisColNom, DisColNum, DisEst, DisDes, DisArtDsc2, DisOrdComp, DisPriorid, Nxt_modelo, Nxt_statio, Nxt_artcli, DisExp, CliCod, DisTipCol, Cod_Idtx, DisIdtx2, MarcaId, DptoID, CpteId, DesaID, RevenID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S024", "SELECT DisCod, DisCliDes, DisTipDis, DisArtDsc, DisArtMat, DisPle2, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisArtPes, DisGraCru, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEncCom, DisEncAnh, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisGraAca, DisRdoA, DisRdoN, DisObsGrm, DisObsAnc, DisItem5, DisUniMed, PriCod, DisEncCli, DisFec, DisFecCli, DisFecEnt, DisArtCod, DisColNom, DisColNum, DisEst, DisDes, DisArtDsc2, DisOrdComp, DisPriorid, Nxt_modelo, Nxt_statio, Nxt_artcli, DisExp, EmprCod, CliCod, DisTipCol, Cod_Idtx, DisIdtx2, MarcaId, DptoID, CpteId, DesaID, RevenID FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S027", "SELECT COALESCE( T1.E_DisCliDe, 0) AS E_DisCliDe FROM (SELECT COALESCE( T2.GXC1, 0) AS E_DisCliDe FROM (SELECT MIN(1) AS GXC1, DisCod FROM TXPDISPOS WHERE EmprCod = ? and CliCod = DisCliDes and DisCliDes > 0 GROUP BY DisCod ) T2 WHERE T2.DisCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S030", "SELECT COALESCE( T1.E_DisArtCo, 0) AS E_DisArtCo FROM (SELECT COALESCE( T2.GXC3, 0) AS E_DisArtCo FROM (SELECT 1 AS GXC3, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (EmprCod = ?) AND (CliCod = ?) AND (ArtCod = ?) ) T2 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S031", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S032", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S033", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S034", "SELECT Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S035", "SELECT EmprCod FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S036", "SELECT MarcaDsc FROM TXPMARCAS WHERE EmprCod = ? AND MarcaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S037", "SELECT DptoDsc FROM TXPNXT002 WHERE EmprCod = ? AND DptoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S038", "SELECT CpteDsc FROM TXPNXT000 WHERE EmprCod = ? AND CpteId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S039", "SELECT DesaDsc FROM TXPNXT001 WHERE EmprCod = ? AND DesaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S040", "SELECT RevenNm FROM TXPREVEND WHERE EmprCod = ? AND RevenID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S041", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S042", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.DisCliDes, TM1.DisTipDis, TM1.DisArtDsc, TM1.DisArtMat, TM1.DisPle2, TM1.DisArtLar, TM1.DisArtSua, TM1.DisArtAca, TM1.DisArtPle, TM1.DisArtTip, TM1.DisArtEnc, TM1.DisArtCor, TM1.DisArtTr1, TM1.DisArtTr2, TM1.DisArtTr3, TM1.DisArtPt1, TM1.DisArtPt2, TM1.DisArtPt3, TM1.DisArtRdt, TM1.DisArtUrg, TM1.DisArtUr1, TM1.DisArtUr2, TM1.DisArtUr3, TM1.DisArtPu1, TM1.DisArtPu2, TM1.DisArtPu3, TM1.DisArtPes, TM1.DisGraCru, TM1.DisArtAnh, TM1.DisArtAn1, TM1.DisArtAcb, TM1.DisArtAc2, TM1.DisEncCom, TM1.DisEncAnh, TM1.DisNumCor, TM1.DisAncSal1, TM1.DisAncSal2, TM1.DisAncSal3, TM1.DisGraAca2, TM1.DisGraCru2, TM1.DisGraAca, TM1.DisRdoA, TM1.DisRdoN, TM1.DisObsGrm, TM1.DisObsAnc, TM1.DisItem5, TM1.DisUniMed, T2.EmprNom, TM1.PriCod, TM1.DisEncCli, T3.CliNom, TM1.DisFec, TM1.DisFecCli, TM1.DisFecEnt, TM1.DisArtCod, TM1.DisColNom, TM1.DisColNum, TM1.DisEst, TM1.DisDes, TM1.DisArtDsc2, T4.Dsc_Idtx, TM1.DisOrdComp, T5.RevenNm, T6.MarcaDsc, TM1.DisPriorid, TM1.Nxt_modelo, T7.CpteDsc, TM1.Nxt_statio, T8.DesaDsc, T9.DptoDsc, TM1.Nxt_artcli, TM1.DisExp, TM1.EmprCod, TM1.CliCod, TM1.DisTipCol AS DisTipCol, TM1.Cod_Idtx, TM1.DisIdtx2 AS DisIdtx2, TM1.MarcaId, TM1.DptoID, TM1.CpteId, TM1.DesaID, TM1.RevenID FROM ((((((((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPINDITE T4 ON T4.EmprCod = TM1.EmprCod AND T4.Cod_Idtx = TM1.Cod_Idtx) LEFT JOIN TXPREVEND T5 ON T5.EmprCod = TM1.EmprCod AND T5.RevenID = TM1.RevenID) LEFT JOIN TXPMARCAS T6 ON T6.EmprCod = TM1.EmprCod AND T6.MarcaId = TM1.MarcaId) LEFT JOIN TXPNXT000 T7 ON T7.EmprCod = TM1.EmprCod AND T7.CpteId = TM1.CpteId) LEFT JOIN TXPNXT001 T8 ON T8.EmprCod = TM1.EmprCod AND T8.DesaID = TM1.DesaID) LEFT JOIN TXPNXT002 T9 ON T9.EmprCod = TM1.EmprCod AND T9.DptoID = TM1.DptoID) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S045", "SELECT COALESCE( T1.E_DisCliDe, 0) AS E_DisCliDe FROM (SELECT COALESCE( T2.GXC1, 0) AS E_DisCliDe FROM (SELECT MIN(1) AS GXC1, DisCod FROM TXPDISPOS WHERE EmprCod = ? and CliCod = DisCliDes and DisCliDes > 0 GROUP BY DisCod ) T2 WHERE T2.DisCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S048", "SELECT COALESCE( T1.E_DisArtCo, 0) AS E_DisArtCo FROM (SELECT COALESCE( T2.GXC3, 0) AS E_DisArtCo FROM (SELECT 1 AS GXC3, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (EmprCod = ?) AND (CliCod = ?) AND (ArtCod = ?) ) T2 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S049", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S050", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S051", "SELECT Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S052", "SELECT EmprCod FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S053", "SELECT MarcaDsc FROM TXPMARCAS WHERE EmprCod = ? AND MarcaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S054", "SELECT DptoDsc FROM TXPNXT002 WHERE EmprCod = ? AND DptoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S055", "SELECT CpteDsc FROM TXPNXT000 WHERE EmprCod = ? AND CpteId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S056", "SELECT DesaDsc FROM TXPNXT001 WHERE EmprCod = ? AND DesaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S057", "SELECT RevenNm FROM TXPREVEND WHERE EmprCod = ? AND RevenID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S060", "SELECT COALESCE( T1.E_DisCliDe, 0) AS E_DisCliDe FROM (SELECT COALESCE( T2.GXC1, 0) AS E_DisCliDe FROM (SELECT MIN(1) AS GXC1, DisCod FROM TXPDISPOS WHERE EmprCod = ? and CliCod = DisCliDes and DisCliDes > 0 GROUP BY DisCod ) T2 WHERE T2.DisCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S063", "SELECT COALESCE( T1.E_DisArtCo, 0) AS E_DisArtCo FROM (SELECT COALESCE( T2.GXC3, 0) AS E_DisArtCo FROM (SELECT 1 AS GXC3, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (EmprCod = ?) AND (CliCod = ?) AND (ArtCod = ?) ) T2 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S064", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S065", "SELECT DisCod, DisCliDes, DisTipDis, DisArtDsc, DisArtMat, DisPle2, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisArtPes, DisGraCru, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEncCom, DisEncAnh, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisGraAca, DisRdoA, DisRdoN, DisObsGrm, DisObsAnc, DisItem5, DisUniMed, PriCod, DisEncCli, DisFec, DisFecCli, DisFecEnt, DisArtCod, DisColNom, DisColNum, DisEst, DisDes, DisArtDsc2, DisOrdComp, DisPriorid, Nxt_modelo, Nxt_statio, Nxt_artcli, DisExp, EmprCod, CliCod, DisTipCol, Cod_Idtx, DisIdtx2, MarcaId, DptoID, CpteId, DesaID, RevenID FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S066", "SELECT DisCod, DisCliDes, DisTipDis, DisArtDsc, DisArtMat, DisPle2, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisArtPes, DisGraCru, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEncCom, DisEncAnh, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisGraAca, DisRdoA, DisRdoN, DisObsGrm, DisObsAnc, DisItem5, DisUniMed, PriCod, DisEncCli, DisFec, DisFecCli, DisFecEnt, DisArtCod, DisColNom, DisColNum, DisEst, DisDes, DisArtDsc2, DisOrdComp, DisPriorid, Nxt_modelo, Nxt_statio, Nxt_artcli, DisExp, EmprCod, CliCod, DisTipCol, Cod_Idtx, DisIdtx2, MarcaId, DptoID, CpteId, DesaID, RevenID FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisCliDes, DisTipDis, DisArtDsc, DisArtMat, DisPle2, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisArtPes, DisGraCru, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEncCom, DisEncAnh, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisGraAca, DisRdoA, DisRdoN, DisObsGrm, DisObsAnc, DisItem5, DisUniMed, PriCod, DisEncCli, DisFec, DisFecCli, DisFecEnt, DisArtCod, DisColNom, DisColNum, DisEst, DisDes, DisArtDsc2, DisOrdComp, DisPriorid, Nxt_modelo, Nxt_statio, Nxt_artcli, DisExp, CliCod, DisTipCol, Cod_Idtx, DisIdtx2, MarcaId, DptoID, CpteId, DesaID, RevenID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S067", "INSERT INTO TXPDISPOS(DisCod, DisCliDes, DisTipDis, DisArtDsc, DisArtMat, DisPle2, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtTr2, DisArtTr3, DisArtPt1, DisArtPt2, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtUr2, DisArtUr3, DisArtPu1, DisArtPu2, DisArtPu3, DisArtPes, DisGraCru, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEncCom, DisEncAnh, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisGraAca, DisRdoA, DisRdoN, DisObsGrm, DisObsAnc, DisItem5, DisUniMed, PriCod, DisEncCli, DisFec, DisFecCli, DisFecEnt, DisArtCod, DisColNom, DisColNum, DisEst, DisDes, DisArtDsc2, DisOrdComp, DisPriorid, Nxt_modelo, Nxt_statio, Nxt_artcli, DisExp, EmprCod, CliCod, DisTipCol, Cod_Idtx, DisIdtx2, MarcaId, DptoID, CpteId, DesaID, RevenID, DisNumPie, DisNumUni, DisCliNum, DisEnt, DisObsULin, DisArtOpe, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, TipConCod, DisNomCli, DisNumCli, DisLoc, DisPart, DisRes, DisNumBas, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem6, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, DisCnoEncO, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("BC01S068", "UPDATE TXPDISPOS SET DisCliDes=?, DisTipDis=?, DisArtDsc=?, DisArtMat=?, DisPle2=?, DisArtLar=?, DisArtSua=?, DisArtAca=?, DisArtPle=?, DisArtTip=?, DisArtEnc=?, DisArtCor=?, DisArtTr1=?, DisArtTr2=?, DisArtTr3=?, DisArtPt1=?, DisArtPt2=?, DisArtPt3=?, DisArtRdt=?, DisArtUrg=?, DisArtUr1=?, DisArtUr2=?, DisArtUr3=?, DisArtPu1=?, DisArtPu2=?, DisArtPu3=?, DisArtPes=?, DisGraCru=?, DisArtAnh=?, DisArtAn1=?, DisArtAcb=?, DisArtAc2=?, DisEncCom=?, DisEncAnh=?, DisNumCor=?, DisAncSal1=?, DisAncSal2=?, DisAncSal3=?, DisGraAca2=?, DisGraCru2=?, DisGraAca=?, DisRdoA=?, DisRdoN=?, DisObsGrm=?, DisObsAnc=?, DisItem5=?, DisUniMed=?, PriCod=?, DisEncCli=?, DisFec=?, DisFecCli=?, DisFecEnt=?, DisArtCod=?, DisColNom=?, DisColNum=?, DisEst=?, DisDes=?, DisArtDsc2=?, DisOrdComp=?, DisPriorid=?, Nxt_modelo=?, Nxt_statio=?, Nxt_artcli=?, DisExp=?, CliCod=?, DisTipCol=?, Cod_Idtx=?, DisIdtx2=?, MarcaId=?, DptoID=?, CpteId=?, DesaID=?, RevenID=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("BC01S069", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("BC01S072", "SELECT COALESCE( T1.E_DisCliDe, 0) AS E_DisCliDe FROM (SELECT COALESCE( T2.GXC1, 0) AS E_DisCliDe FROM (SELECT MIN(1) AS GXC1, DisCod FROM TXPDISPOS WHERE EmprCod = ? and CliCod = DisCliDes and DisCliDes > 0 GROUP BY DisCod ) T2 WHERE T2.DisCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S073", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S076", "SELECT COALESCE( T1.E_DisArtCo, 0) AS E_DisArtCo FROM (SELECT COALESCE( T2.GXC3, 0) AS E_DisArtCo FROM (SELECT 1 AS GXC3, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (EmprCod = ?) AND (CliCod = ?) AND (ArtCod = ?) ) T2 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S077", "SELECT Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S078", "SELECT RevenNm FROM TXPREVEND WHERE EmprCod = ? AND RevenID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S079", "SELECT MarcaDsc FROM TXPMARCAS WHERE EmprCod = ? AND MarcaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S080", "SELECT CpteDsc FROM TXPNXT000 WHERE EmprCod = ? AND CpteId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S081", "SELECT DesaDsc FROM TXPNXT001 WHERE EmprCod = ? AND DesaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S082", "SELECT DptoDsc FROM TXPNXT002 WHERE EmprCod = ? AND DptoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S083", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S084", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S085", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S086", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S087", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S088", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S089", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S090", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S091", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S092", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S093", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S094", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.DisCliDes, TM1.DisTipDis, TM1.DisArtDsc, TM1.DisArtMat, TM1.DisPle2, TM1.DisArtLar, TM1.DisArtSua, TM1.DisArtAca, TM1.DisArtPle, TM1.DisArtTip, TM1.DisArtEnc, TM1.DisArtCor, TM1.DisArtTr1, TM1.DisArtTr2, TM1.DisArtTr3, TM1.DisArtPt1, TM1.DisArtPt2, TM1.DisArtPt3, TM1.DisArtRdt, TM1.DisArtUrg, TM1.DisArtUr1, TM1.DisArtUr2, TM1.DisArtUr3, TM1.DisArtPu1, TM1.DisArtPu2, TM1.DisArtPu3, TM1.DisArtPes, TM1.DisGraCru, TM1.DisArtAnh, TM1.DisArtAn1, TM1.DisArtAcb, TM1.DisArtAc2, TM1.DisEncCom, TM1.DisEncAnh, TM1.DisNumCor, TM1.DisAncSal1, TM1.DisAncSal2, TM1.DisAncSal3, TM1.DisGraAca2, TM1.DisGraCru2, TM1.DisGraAca, TM1.DisRdoA, TM1.DisRdoN, TM1.DisObsGrm, TM1.DisObsAnc, TM1.DisItem5, TM1.DisUniMed, T2.EmprNom, TM1.PriCod, TM1.DisEncCli, T3.CliNom, TM1.DisFec, TM1.DisFecCli, TM1.DisFecEnt, TM1.DisArtCod, TM1.DisColNom, TM1.DisColNum, TM1.DisEst, TM1.DisDes, TM1.DisArtDsc2, T4.Dsc_Idtx, TM1.DisOrdComp, T5.RevenNm, T6.MarcaDsc, TM1.DisPriorid, TM1.Nxt_modelo, T7.CpteDsc, TM1.Nxt_statio, T8.DesaDsc, T9.DptoDsc, TM1.Nxt_artcli, TM1.DisExp, TM1.EmprCod, TM1.CliCod, TM1.DisTipCol AS DisTipCol, TM1.Cod_Idtx, TM1.DisIdtx2 AS DisIdtx2, TM1.MarcaId, TM1.DptoID, TM1.CpteId, TM1.DesaID, TM1.RevenID FROM ((((((((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPINDITE T4 ON T4.EmprCod = TM1.EmprCod AND T4.Cod_Idtx = TM1.Cod_Idtx) LEFT JOIN TXPREVEND T5 ON T5.EmprCod = TM1.EmprCod AND T5.RevenID = TM1.RevenID) LEFT JOIN TXPMARCAS T6 ON T6.EmprCod = TM1.EmprCod AND T6.MarcaId = TM1.MarcaId) LEFT JOIN TXPNXT000 T7 ON T7.EmprCod = TM1.EmprCod AND T7.CpteId = TM1.CpteId) LEFT JOIN TXPNXT001 T8 ON T8.EmprCod = TM1.EmprCod AND T8.DesaID = TM1.DesaID) LEFT JOIN TXPNXT002 T9 ON T9.EmprCod = TM1.EmprCod AND T9.DptoID = TM1.DptoID) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S095", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormSt, T1.DisNormNC, T1.EmprCod, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.DisNormID = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S096", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S097", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S098", "SELECT DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S099", "SELECT DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?  FOR UPDATE OF DisNormSt, DisNormNC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S0100", "INSERT INTO TXPDISNOR(DisCod, DisNormSt, DisNormNC, EmprCod, DisNormID) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDISNOR")
         ,new UpdateCursor("BC01S0101", "UPDATE TXPDISNOR SET DisNormSt=?, DisNormNC=?  WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?", GX_NOMASK, "TXPDISNOR")
         ,new UpdateCursor("BC01S0102", "DELETE FROM TXPDISNOR  WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?", GX_NOMASK, "TXPDISNOR")
         ,new ForEachCursor("BC01S0103", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0104", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormSt, T1.DisNormNC, T1.EmprCod, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0105", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.AlbRefDsc, T2.AlbRReo, T1.Piezas, T1.Kilos, T1.Metros, T2.AlbRUniEnt, T2.AlbRUniUti, T2.AlbRPieEnt, T2.AlbRPieUti, T1.EmprCod, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0106", "SELECT AlbRefDsc, AlbRReo, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0107", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0108", "SELECT DisCod, Piezas, Kilos, Metros, EmprCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0109", "SELECT DisCod, Piezas, Kilos, Metros, EmprCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF Piezas, Kilos, Metros NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S0110", "INSERT INTO TXPDISALB(DisCod, Piezas, Kilos, Metros, EmprCod, AlbRecCod, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("BC01S0111", "UPDATE TXPDISALB SET Piezas=?, Kilos=?, Metros=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("BC01S0112", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new ForEachCursor("BC01S0113", "SELECT AlbRefDsc, AlbRReo, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0114", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S0115", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S0116", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.AlbRefDsc, T2.AlbRReo, T1.Piezas, T1.Kilos, T1.Metros, T2.AlbRUniEnt, T2.AlbRUniUti, T2.AlbRPieEnt, T2.AlbRPieUti, T1.EmprCod, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0117", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.TipDefDsc, T1.DefPor, T1.EmprCod, T1.TipDefCod FROM (TXPDISDEF T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.TipDefCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.TipDefCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0118", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0119", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0120", "SELECT DisCod, DefPor, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0121", "SELECT DisCod, DefPor, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?  FOR UPDATE OF DefPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S0122", "INSERT INTO TXPDISDEF(DisCod, DefPor, EmprCod, TipDefCod, DefMaqcod, DefCausa, DefResp) VALUES(?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("BC01S0123", "UPDATE TXPDISDEF SET DefPor=?  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("BC01S0124", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new ForEachCursor("BC01S0125", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0126", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S0127", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.TipDefDsc, T1.DefPor, T1.EmprCod, T1.TipDefCod FROM (TXPDISDEF T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.TipDefCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0128", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.ProDsc, T1.UltFasLin, T1.EmprCod, T1.ProCod FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0129", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0130", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0131", "SELECT DisCod, UltFasLin, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0132", "SELECT DisCod, UltFasLin, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF UltFasLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S0133", "INSERT INTO TXPDISLIN(DisCod, UltFasLin, EmprCod, ProCod, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("BC01S0134", "UPDATE TXPDISLIN SET UltFasLin=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("BC01S0135", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("BC01S0136", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0137", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S0138", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T2.ProDsc, T1.UltFasLin, T1.EmprCod, T1.ProCod FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0139", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T1.ProCod, T1.DisFasLin, T2.FasDsc, T1.DisQuiUl, T1.FasPreObl, T1.EmprCod, T1.FasCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0140", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0141", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0142", "SELECT DisCod, ProCod, DisFasLin, DisQuiUl, EmprCod, FasCod FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0143", "SELECT DisCod, ProCod, DisFasLin, DisQuiUl, EmprCod, FasCod FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF DisQuiUl, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S0144", "INSERT INTO TXPDISFAS(FasPreObl, DisCod, ProCod, DisFasLin, DisQuiUl, EmprCod, FasCod, FasApr, DisMaqPru, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("BC01S0145", "UPDATE TXPDISFAS SET FasPreObl=?, DisQuiUl=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("BC01S0146", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("BC01S0147", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0148", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S0149", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S0150", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01S0151", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T1.ProCod, T1.DisFasLin, T2.FasDsc, T1.DisQuiUl, T1.FasPreObl, T1.EmprCod, T1.FasCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0152", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin, T2.ProForDsc, T1.EmprCod, T1.ProForCod FROM (TXPDISQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? and T1.DisQuiLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0153", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0154", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0155", "SELECT DisCod, ProCod, DisFasLin, DisQuiLin, EmprCod, ProForCod FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0156", "SELECT DisCod, ProCod, DisFasLin, DisQuiLin, EmprCod, ProForCod FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?  FOR UPDATE OF ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S0157", "INSERT INTO TXPDISQUI(DisCod, ProCod, DisFasLin, DisQuiLin, EmprCod, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, ' ')", GX_NOMASK, "TXPDISQUI")
         ,new UpdateCursor("BC01S0158", "UPDATE TXPDISQUI SET ProForCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?", GX_NOMASK, "TXPDISQUI")
         ,new UpdateCursor("BC01S0159", "DELETE FROM TXPDISQUI  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?", GX_NOMASK, "TXPDISQUI")
         ,new ForEachCursor("BC01S0160", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0161", "SELECT /*+ FIRST_ROWS(11) */ T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin, T2.ProForDsc, T1.EmprCod, T1.ProForCod FROM (TXPDISQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0162", "SELECT /*+ FIRST_ROWS(11) */ DisCod, ProCod, DisFasLin, DisParVl2, DisParObs, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and ParFasCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0163", "SELECT EmprCod FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0164", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0165", "SELECT DisCod, ProCod, DisFasLin, DisParVl2, DisParObs, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0166", "SELECT DisCod, ProCod, DisFasLin, DisParVl2, DisParObs, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?  FOR UPDATE OF DisParVl2, DisParObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01S0167", "INSERT INTO TXPDISPAR(DisCod, ProCod, DisFasLin, DisParVl2, DisParObs, EmprCod, ParFasCod, DisParVal, DisParTxt, DisParOrd, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPDISPAR")
         ,new UpdateCursor("BC01S0168", "UPDATE TXPDISPAR SET DisParVl2=?, DisParObs=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?", GX_NOMASK, "TXPDISPAR")
         ,new UpdateCursor("BC01S0169", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?", GX_NOMASK, "TXPDISPAR")
         ,new ForEachCursor("BC01S0170", "SELECT /*+ FIRST_ROWS(11) */ DisCod, ProCod, DisFasLin, DisParVl2, DisParObs, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0171", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0174", "SELECT COALESCE( T1.E_DisCliDe, 0) AS E_DisCliDe FROM (SELECT COALESCE( T2.GXC1, 0) AS E_DisCliDe FROM (SELECT MIN(1) AS GXC1, DisCod FROM TXPDISPOS WHERE EmprCod = ? and CliCod = DisCliDes and DisCliDes > 0 GROUP BY DisCod ) T2 WHERE T2.DisCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0175", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01S0178", "SELECT COALESCE( T1.E_DisCliDe, 0) AS E_DisCliDe FROM (SELECT COALESCE( T2.GXC1, 0) AS E_DisCliDe FROM (SELECT MIN(1) AS GXC1, DisCod FROM TXPDISPOS WHERE EmprCod = ? and CliCod = DisCliDes and DisCliDes > 0 GROUP BY DisCod ) T2 WHERE T2.DisCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((String[]) buf[16])[0] = rslt.getString(16, 4);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((String[]) buf[23])[0] = rslt.getString(23, 4);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((short[]) buf[39])[0] = rslt.getShort(38);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((short[]) buf[41])[0] = rslt.getShort(40);
               ((short[]) buf[42])[0] = rslt.getShort(41);
               ((short[]) buf[43])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[46])[0] = rslt.getString(45, 20);
               ((String[]) buf[47])[0] = rslt.getString(46, 20);
               ((String[]) buf[48])[0] = rslt.getString(47, 20);
               ((String[]) buf[49])[0] = rslt.getString(48, 1);
               ((String[]) buf[50])[0] = rslt.getString(49, 1);
               ((String[]) buf[51])[0] = rslt.getString(50, 20);
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(51);
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDate(52);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(53);
               ((String[]) buf[55])[0] = rslt.getString(54, 16);
               ((String[]) buf[56])[0] = rslt.getString(55, 13);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(56);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(57);
               ((String[]) buf[61])[0] = rslt.getString(58, 1);
               ((String[]) buf[62])[0] = rslt.getVarchar(59);
               ((String[]) buf[63])[0] = rslt.getVarchar(60);
               ((byte[]) buf[64])[0] = rslt.getByte(61);
               ((String[]) buf[65])[0] = rslt.getString(62, 30);
               ((String[]) buf[66])[0] = rslt.getString(63, 4);
               ((String[]) buf[67])[0] = rslt.getString(64, 30);
               ((String[]) buf[68])[0] = rslt.getString(65, 1);
               ((String[]) buf[69])[0] = rslt.getString(66, 3);
               ((int[]) buf[70])[0] = rslt.getInt(67);
               ((byte[]) buf[71])[0] = rslt.getByte(68);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(69, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(70, 4);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(71, 6);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(72);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(73);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(74);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(75, 10);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((String[]) buf[16])[0] = rslt.getString(16, 4);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((String[]) buf[23])[0] = rslt.getString(23, 4);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((short[]) buf[39])[0] = rslt.getShort(38);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((short[]) buf[41])[0] = rslt.getShort(40);
               ((short[]) buf[42])[0] = rslt.getShort(41);
               ((short[]) buf[43])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[46])[0] = rslt.getString(45, 20);
               ((String[]) buf[47])[0] = rslt.getString(46, 20);
               ((String[]) buf[48])[0] = rslt.getString(47, 20);
               ((String[]) buf[49])[0] = rslt.getString(48, 1);
               ((String[]) buf[50])[0] = rslt.getString(49, 1);
               ((String[]) buf[51])[0] = rslt.getString(50, 20);
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(51);
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDate(52);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(53);
               ((String[]) buf[55])[0] = rslt.getString(54, 16);
               ((String[]) buf[56])[0] = rslt.getString(55, 13);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(56);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(57);
               ((String[]) buf[61])[0] = rslt.getString(58, 1);
               ((String[]) buf[62])[0] = rslt.getVarchar(59);
               ((String[]) buf[63])[0] = rslt.getVarchar(60);
               ((byte[]) buf[64])[0] = rslt.getByte(61);
               ((String[]) buf[65])[0] = rslt.getString(62, 30);
               ((String[]) buf[66])[0] = rslt.getString(63, 4);
               ((String[]) buf[67])[0] = rslt.getString(64, 30);
               ((String[]) buf[68])[0] = rslt.getString(65, 1);
               ((String[]) buf[69])[0] = rslt.getString(66, 3);
               ((int[]) buf[70])[0] = rslt.getInt(67);
               ((byte[]) buf[71])[0] = rslt.getByte(68);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(69, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(70, 4);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(71, 6);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(72);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(73);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(74);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(75, 10);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               return;
            case 23 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((String[]) buf[16])[0] = rslt.getString(16, 4);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((String[]) buf[23])[0] = rslt.getString(23, 4);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((short[]) buf[39])[0] = rslt.getShort(38);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((short[]) buf[41])[0] = rslt.getShort(40);
               ((short[]) buf[42])[0] = rslt.getShort(41);
               ((short[]) buf[43])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[46])[0] = rslt.getString(45, 20);
               ((String[]) buf[47])[0] = rslt.getString(46, 20);
               ((String[]) buf[48])[0] = rslt.getString(47, 20);
               ((String[]) buf[49])[0] = rslt.getString(48, 1);
               ((String[]) buf[50])[0] = rslt.getString(49, 30);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(50, 1);
               ((String[]) buf[53])[0] = rslt.getString(51, 20);
               ((String[]) buf[54])[0] = rslt.getString(52, 30);
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDate(53);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(54);
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(55);
               ((String[]) buf[58])[0] = rslt.getString(56, 16);
               ((String[]) buf[59])[0] = rslt.getString(57, 13);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((int[]) buf[61])[0] = rslt.getInt(58);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(59);
               ((String[]) buf[64])[0] = rslt.getString(60, 1);
               ((String[]) buf[65])[0] = rslt.getVarchar(61);
               ((String[]) buf[66])[0] = rslt.getString(62, 60);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(63);
               ((String[]) buf[69])[0] = rslt.getString(64, 40);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(65, 60);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((byte[]) buf[73])[0] = rslt.getByte(66);
               ((String[]) buf[74])[0] = rslt.getString(67, 30);
               ((String[]) buf[75])[0] = rslt.getString(68, 30);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(69, 4);
               ((String[]) buf[78])[0] = rslt.getString(70, 30);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(71, 30);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(72, 30);
               ((String[]) buf[83])[0] = rslt.getString(73, 1);
               ((String[]) buf[84])[0] = rslt.getString(74, 3);
               ((int[]) buf[85])[0] = rslt.getInt(75);
               ((byte[]) buf[86])[0] = rslt.getByte(76);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(77, 4);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(78, 4);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(79, 6);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(80);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(81);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(82);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(83, 10);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               return;
            case 37 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 48 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 49 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((String[]) buf[16])[0] = rslt.getString(16, 4);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((String[]) buf[23])[0] = rslt.getString(23, 4);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((short[]) buf[39])[0] = rslt.getShort(38);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((short[]) buf[41])[0] = rslt.getShort(40);
               ((short[]) buf[42])[0] = rslt.getShort(41);
               ((short[]) buf[43])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[46])[0] = rslt.getString(45, 20);
               ((String[]) buf[47])[0] = rslt.getString(46, 20);
               ((String[]) buf[48])[0] = rslt.getString(47, 20);
               ((String[]) buf[49])[0] = rslt.getString(48, 1);
               ((String[]) buf[50])[0] = rslt.getString(49, 1);
               ((String[]) buf[51])[0] = rslt.getString(50, 20);
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(51);
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDate(52);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(53);
               ((String[]) buf[55])[0] = rslt.getString(54, 16);
               ((String[]) buf[56])[0] = rslt.getString(55, 13);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(56);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(57);
               ((String[]) buf[61])[0] = rslt.getString(58, 1);
               ((String[]) buf[62])[0] = rslt.getVarchar(59);
               ((String[]) buf[63])[0] = rslt.getVarchar(60);
               ((byte[]) buf[64])[0] = rslt.getByte(61);
               ((String[]) buf[65])[0] = rslt.getString(62, 30);
               ((String[]) buf[66])[0] = rslt.getString(63, 4);
               ((String[]) buf[67])[0] = rslt.getString(64, 30);
               ((String[]) buf[68])[0] = rslt.getString(65, 1);
               ((String[]) buf[69])[0] = rslt.getString(66, 3);
               ((int[]) buf[70])[0] = rslt.getInt(67);
               ((byte[]) buf[71])[0] = rslt.getByte(68);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(69, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(70, 4);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(71, 6);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(72);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(73);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(74);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(75, 10);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               return;
            case 52 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((String[]) buf[16])[0] = rslt.getString(16, 4);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((String[]) buf[23])[0] = rslt.getString(23, 4);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((short[]) buf[39])[0] = rslt.getShort(38);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((short[]) buf[41])[0] = rslt.getShort(40);
               ((short[]) buf[42])[0] = rslt.getShort(41);
               ((short[]) buf[43])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[46])[0] = rslt.getString(45, 20);
               ((String[]) buf[47])[0] = rslt.getString(46, 20);
               ((String[]) buf[48])[0] = rslt.getString(47, 20);
               ((String[]) buf[49])[0] = rslt.getString(48, 1);
               ((String[]) buf[50])[0] = rslt.getString(49, 1);
               ((String[]) buf[51])[0] = rslt.getString(50, 20);
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(51);
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDate(52);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(53);
               ((String[]) buf[55])[0] = rslt.getString(54, 16);
               ((String[]) buf[56])[0] = rslt.getString(55, 13);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(56);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(57);
               ((String[]) buf[61])[0] = rslt.getString(58, 1);
               ((String[]) buf[62])[0] = rslt.getVarchar(59);
               ((String[]) buf[63])[0] = rslt.getVarchar(60);
               ((byte[]) buf[64])[0] = rslt.getByte(61);
               ((String[]) buf[65])[0] = rslt.getString(62, 30);
               ((String[]) buf[66])[0] = rslt.getString(63, 4);
               ((String[]) buf[67])[0] = rslt.getString(64, 30);
               ((String[]) buf[68])[0] = rslt.getString(65, 1);
               ((String[]) buf[69])[0] = rslt.getString(66, 3);
               ((int[]) buf[70])[0] = rslt.getInt(67);
               ((byte[]) buf[71])[0] = rslt.getByte(68);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(69, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(70, 4);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(71, 6);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(72);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(73);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(74);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(75, 10);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               return;
            case 56 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 58 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 76 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((String[]) buf[16])[0] = rslt.getString(16, 4);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((String[]) buf[23])[0] = rslt.getString(23, 4);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((short[]) buf[39])[0] = rslt.getShort(38);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((short[]) buf[41])[0] = rslt.getShort(40);
               ((short[]) buf[42])[0] = rslt.getShort(41);
               ((short[]) buf[43])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[46])[0] = rslt.getString(45, 20);
               ((String[]) buf[47])[0] = rslt.getString(46, 20);
               ((String[]) buf[48])[0] = rslt.getString(47, 20);
               ((String[]) buf[49])[0] = rslt.getString(48, 1);
               ((String[]) buf[50])[0] = rslt.getString(49, 30);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(50, 1);
               ((String[]) buf[53])[0] = rslt.getString(51, 20);
               ((String[]) buf[54])[0] = rslt.getString(52, 30);
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDate(53);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(54);
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(55);
               ((String[]) buf[58])[0] = rslt.getString(56, 16);
               ((String[]) buf[59])[0] = rslt.getString(57, 13);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((int[]) buf[61])[0] = rslt.getInt(58);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(59);
               ((String[]) buf[64])[0] = rslt.getString(60, 1);
               ((String[]) buf[65])[0] = rslt.getVarchar(61);
               ((String[]) buf[66])[0] = rslt.getString(62, 60);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(63);
               ((String[]) buf[69])[0] = rslt.getString(64, 40);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(65, 60);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((byte[]) buf[73])[0] = rslt.getByte(66);
               ((String[]) buf[74])[0] = rslt.getString(67, 30);
               ((String[]) buf[75])[0] = rslt.getString(68, 30);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(69, 4);
               ((String[]) buf[78])[0] = rslt.getString(70, 30);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(71, 30);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(72, 30);
               ((String[]) buf[83])[0] = rslt.getString(73, 1);
               ((String[]) buf[84])[0] = rslt.getString(74, 3);
               ((int[]) buf[85])[0] = rslt.getInt(75);
               ((byte[]) buf[86])[0] = rslt.getByte(76);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(77, 4);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(78, 4);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(79, 6);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(80);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(81);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(82);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(83, 10);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               return;
            case 77 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 80 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 81 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 86 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 87 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 91 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 98 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 99 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 102 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 103 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 109 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 110 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 113 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 114 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 121 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 124 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 125 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 129 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 130 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 131 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 132 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 133 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 134 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 135 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 136 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 137 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 138 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 142 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 143 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 144 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 145 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 146 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 147 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 148 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 152 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 153 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 154 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 155 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 156 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 10);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 10);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 53 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               stmt.setString(4, (String)parms[4], 26);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setString(6, (String)parms[6], 30);
               stmt.setString(7, (String)parms[7], 10);
               stmt.setString(8, (String)parms[8], 6);
               stmt.setString(9, (String)parms[9], 6);
               stmt.setString(10, (String)parms[10], 10);
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setString(12, (String)parms[12], 1);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setString(14, (String)parms[14], 4);
               stmt.setString(15, (String)parms[15], 4);
               stmt.setString(16, (String)parms[16], 4);
               stmt.setShort(17, ((Number) parms[17]).shortValue());
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               stmt.setByte(21, ((Number) parms[21]).byteValue());
               stmt.setString(22, (String)parms[22], 4);
               stmt.setString(23, (String)parms[23], 4);
               stmt.setString(24, (String)parms[24], 4);
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               stmt.setShort(26, ((Number) parms[26]).shortValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[28]).shortValue());
               }
               stmt.setShort(28, ((Number) parms[29]).shortValue());
               stmt.setShort(29, ((Number) parms[30]).shortValue());
               stmt.setShort(30, ((Number) parms[31]).shortValue());
               stmt.setShort(31, ((Number) parms[32]).shortValue());
               stmt.setShort(32, ((Number) parms[33]).shortValue());
               stmt.setShort(33, ((Number) parms[34]).shortValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[35], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[36], 2);
               stmt.setShort(36, ((Number) parms[37]).shortValue());
               stmt.setShort(37, ((Number) parms[38]).shortValue());
               stmt.setShort(38, ((Number) parms[39]).shortValue());
               stmt.setShort(39, ((Number) parms[40]).shortValue());
               stmt.setShort(40, ((Number) parms[41]).shortValue());
               stmt.setShort(41, ((Number) parms[42]).shortValue());
               stmt.setShort(42, ((Number) parms[43]).shortValue());
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[44], 2);
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[45], 2);
               stmt.setString(45, (String)parms[46], 20);
               stmt.setString(46, (String)parms[47], 20);
               stmt.setString(47, (String)parms[48], 20);
               stmt.setString(48, (String)parms[49], 1);
               stmt.setString(49, (String)parms[50], 1);
               stmt.setString(50, (String)parms[51], 20);
               stmt.setDate(51, (java.util.Date)parms[52]);
               stmt.setDate(52, (java.util.Date)parms[53]);
               stmt.setDate(53, (java.util.Date)parms[54]);
               stmt.setString(54, (String)parms[55], 16);
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[57], 13);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(56, ((Number) parms[59]).intValue());
               }
               stmt.setByte(57, ((Number) parms[60]).byteValue());
               stmt.setString(58, (String)parms[61], 1);
               stmt.setVarchar(59, (String)parms[62], 60, false);
               stmt.setVarchar(60, (String)parms[63], 200, false);
               stmt.setByte(61, ((Number) parms[64]).byteValue());
               stmt.setString(62, (String)parms[65], 30);
               stmt.setString(63, (String)parms[66], 4);
               stmt.setString(64, (String)parms[67], 30);
               stmt.setString(65, (String)parms[68], 1);
               stmt.setString(66, (String)parms[69], 3);
               stmt.setInt(67, ((Number) parms[70]).intValue());
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(68, ((Number) parms[72]).byteValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[74], 4);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[76], 4);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[78], 6);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[80]).shortValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(73, ((Number) parms[82]).shortValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(74, ((Number) parms[84]).shortValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[86], 10);
               }
               return;
            case 54 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               stmt.setString(3, (String)parms[3], 26);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 30);
               stmt.setString(6, (String)parms[6], 10);
               stmt.setString(7, (String)parms[7], 6);
               stmt.setString(8, (String)parms[8], 6);
               stmt.setString(9, (String)parms[9], 10);
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               stmt.setString(11, (String)parms[11], 1);
               stmt.setString(12, (String)parms[12], 1);
               stmt.setString(13, (String)parms[13], 4);
               stmt.setString(14, (String)parms[14], 4);
               stmt.setString(15, (String)parms[15], 4);
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setShort(17, ((Number) parms[17]).shortValue());
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 2);
               stmt.setByte(20, ((Number) parms[20]).byteValue());
               stmt.setString(21, (String)parms[21], 4);
               stmt.setString(22, (String)parms[22], 4);
               stmt.setString(23, (String)parms[23], 4);
               stmt.setShort(24, ((Number) parms[24]).shortValue());
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[27]).shortValue());
               }
               stmt.setShort(27, ((Number) parms[28]).shortValue());
               stmt.setShort(28, ((Number) parms[29]).shortValue());
               stmt.setShort(29, ((Number) parms[30]).shortValue());
               stmt.setShort(30, ((Number) parms[31]).shortValue());
               stmt.setShort(31, ((Number) parms[32]).shortValue());
               stmt.setShort(32, ((Number) parms[33]).shortValue());
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[35], 2);
               stmt.setShort(35, ((Number) parms[36]).shortValue());
               stmt.setShort(36, ((Number) parms[37]).shortValue());
               stmt.setShort(37, ((Number) parms[38]).shortValue());
               stmt.setShort(38, ((Number) parms[39]).shortValue());
               stmt.setShort(39, ((Number) parms[40]).shortValue());
               stmt.setShort(40, ((Number) parms[41]).shortValue());
               stmt.setShort(41, ((Number) parms[42]).shortValue());
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[43], 2);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[44], 2);
               stmt.setString(44, (String)parms[45], 20);
               stmt.setString(45, (String)parms[46], 20);
               stmt.setString(46, (String)parms[47], 20);
               stmt.setString(47, (String)parms[48], 1);
               stmt.setString(48, (String)parms[49], 1);
               stmt.setString(49, (String)parms[50], 20);
               stmt.setDate(50, (java.util.Date)parms[51]);
               stmt.setDate(51, (java.util.Date)parms[52]);
               stmt.setDate(52, (java.util.Date)parms[53]);
               stmt.setString(53, (String)parms[54], 16);
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[56], 13);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(55, ((Number) parms[58]).intValue());
               }
               stmt.setByte(56, ((Number) parms[59]).byteValue());
               stmt.setString(57, (String)parms[60], 1);
               stmt.setVarchar(58, (String)parms[61], 60, false);
               stmt.setVarchar(59, (String)parms[62], 200, false);
               stmt.setByte(60, ((Number) parms[63]).byteValue());
               stmt.setString(61, (String)parms[64], 30);
               stmt.setString(62, (String)parms[65], 4);
               stmt.setString(63, (String)parms[66], 30);
               stmt.setString(64, (String)parms[67], 1);
               stmt.setInt(65, ((Number) parms[68]).intValue());
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(66, ((Number) parms[70]).byteValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[72], 4);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[74], 4);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[76], 6);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[78]).shortValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[80]).shortValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[82]).shortValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[84], 10);
               }
               stmt.setString(74, (String)parms[85], 3);
               stmt.setInt(75, ((Number) parms[86]).intValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 10);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 82 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 4);
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 4);
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 92 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 93 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 102 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 103 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 104 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
            case 105 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 107 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 110 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 111 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 112 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 113 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 115 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 116 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 117 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 119 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 121 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 122 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 123 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 124 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 125 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 126 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setString(7, (String)parms[7], 8);
               return;
            case 127 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 128 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 129 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 130 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 131 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 132 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 133 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 134 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 135 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 136 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 137 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 138 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 139 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 140 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 141 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 142 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 143 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 144 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 145 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 146 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 147 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 148 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 149 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 60);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
      setparameters150( cursor, stmt, parms) ;
   }

   public void setparameters150( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 150 :
               stmt.setString(1, (String)parms[0], 12);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 151 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 152 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 153 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 154 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 155 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 156 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

