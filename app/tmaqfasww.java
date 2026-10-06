package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqfasww", "/app.tmaqfasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqfasww extends GXWebObjectStub
{
   public tmaqfasww( )
   {
   }

   public tmaqfasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqfasww.class ));
   }

   public tmaqfasww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqfasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqfasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Maquinas por Fase";
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

