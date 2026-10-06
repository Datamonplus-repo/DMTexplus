package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipartww", "/app.ttipartww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipartww extends GXWebObjectStub
{
   public ttipartww( )
   {
   }

   public ttipartww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipartww.class ));
   }

   public ttipartww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipartww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipartww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TIPOS DE ARTICULOS";
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

