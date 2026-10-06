package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentocomercialv01general", "/app.documentocomercialv01general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercialv01general extends GXWebObjectStub
{
   public documentocomercialv01general( )
   {
   }

   public documentocomercialv01general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercialv01general.class ));
   }

   public documentocomercialv01general( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercialv01general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercialv01general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Comercialv01 General";
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

