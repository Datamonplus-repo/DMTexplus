package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisvariantes", "/app.tdisvariantes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisvariantes extends GXWebObjectStub
{
   public tdisvariantes( )
   {
   }

   public tdisvariantes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisvariantes.class ));
   }

   public tdisvariantes( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisvariantes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisvariantes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cominaciones / Variantes /Pintas";
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

