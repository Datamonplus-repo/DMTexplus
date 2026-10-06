package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tplanri", "/app.tplanri"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tplanri extends GXWebObjectStub
{
   public tplanri( )
   {
   }

   public tplanri( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tplanri.class ));
   }

   public tplanri( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tplanri_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tplanri_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PLANING RITEX PARTIDAS";
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

