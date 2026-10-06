package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial_manual_at", "/app.documentotransportecomercial_manual_at"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransportecomercial_manual_at extends GXWebObjectStub
{
   public documentotransportecomercial_manual_at( )
   {
   }

   public documentotransportecomercial_manual_at( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransportecomercial_manual_at.class ));
   }

   public documentotransportecomercial_manual_at( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransportecomercial_manual_at_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransportecomercial_manual_at_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada codigo de AT MANUAL";
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

