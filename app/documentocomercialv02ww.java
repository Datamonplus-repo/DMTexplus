package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentocomercialv02ww", "/app.documentocomercialv02ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercialv02ww extends GXWebObjectStub
{
   public documentocomercialv02ww( )
   {
   }

   public documentocomercialv02ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercialv02ww.class ));
   }

   public documentocomercialv02ww( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercialv02ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercialv02ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Documento Comercial (v02)";
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

