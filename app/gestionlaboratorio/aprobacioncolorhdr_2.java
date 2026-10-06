package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.aprobacioncolorhdr_2", "/app.gestionlaboratorio.aprobacioncolorhdr_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aprobacioncolorhdr_2 extends GXWebObjectStub
{
   public aprobacioncolorhdr_2( )
   {
   }

   public aprobacioncolorhdr_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aprobacioncolorhdr_2.class ));
   }

   public aprobacioncolorhdr_2( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aprobacioncolorhdr_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aprobacioncolorhdr_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aprobacion Color Hdr";
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

