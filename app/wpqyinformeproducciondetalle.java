package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpqyinformeproducciondetalle", "/app.wpqyinformeproducciondetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpqyinformeproducciondetalle extends GXWebObjectStub
{
   public wpqyinformeproducciondetalle( )
   {
   }

   public wpqyinformeproducciondetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpqyinformeproducciondetalle.class ));
   }

   public wpqyinformeproducciondetalle( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpqyinformeproducciondetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpqyinformeproducciondetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WPQy Informe Produccion Detalle";
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

