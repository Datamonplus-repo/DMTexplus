package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentocomercialv01ww", "/app.documentocomercialv01ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercialv01ww extends GXWebObjectStub
{
   public documentocomercialv01ww( )
   {
   }

   public documentocomercialv01ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercialv01ww.class ));
   }

   public documentocomercialv01ww( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercialv01ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercialv01ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Documento Comercial (v01)";
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

