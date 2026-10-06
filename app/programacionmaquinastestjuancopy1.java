package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.programacionmaquinastestjuancopy1", "/app.programacionmaquinastestjuancopy1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class programacionmaquinastestjuancopy1 extends GXWebObjectStub
{
   public programacionmaquinastestjuancopy1( )
   {
   }

   public programacionmaquinastestjuancopy1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( programacionmaquinastestjuancopy1.class ));
   }

   public programacionmaquinastestjuancopy1( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new programacionmaquinastestjuancopy1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new programacionmaquinastestjuancopy1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programacion Maquinas Test Juan Copy1";
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

