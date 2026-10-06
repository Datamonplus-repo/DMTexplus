package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmcomentww", "/app.tmcomentww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcomentww extends GXWebObjectStub
{
   public tmcomentww( )
   {
   }

   public tmcomentww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcomentww.class ));
   }

   public tmcomentww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcomentww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcomentww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entradas de Repuestos";
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

