package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentocomercialv01documentocomercialv02", "/app.documentocomercialv01documentocomercialv02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercialv01documentocomercialv02 extends GXWebObjectStub
{
   public documentocomercialv01documentocomercialv02( )
   {
   }

   public documentocomercialv01documentocomercialv02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercialv01documentocomercialv02.class ));
   }

   public documentocomercialv01documentocomercialv02( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercialv01documentocomercialv02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercialv01documentocomercialv02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Comercialv01 Documento Comercialv02";
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

