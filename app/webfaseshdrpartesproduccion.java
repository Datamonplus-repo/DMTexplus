package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webfaseshdrpartesproduccion", "/app.webfaseshdrpartesproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webfaseshdrpartesproduccion extends GXWebObjectStub
{
   public webfaseshdrpartesproduccion( )
   {
   }

   public webfaseshdrpartesproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webfaseshdrpartesproduccion.class ));
   }

   public webfaseshdrpartesproduccion( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webfaseshdrpartesproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webfaseshdrpartesproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases Hdr";
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

