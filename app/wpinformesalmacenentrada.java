package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpinformesalmacenentrada", "/app.wpinformesalmacenentrada"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpinformesalmacenentrada extends GXWebObjectStub
{
   public wpinformesalmacenentrada( )
   {
   }

   public wpinformesalmacenentrada( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpinformesalmacenentrada.class ));
   }

   public wpinformesalmacenentrada( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpinformesalmacenentrada_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpinformesalmacenentrada_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WPInformes Almacen Entrada";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

