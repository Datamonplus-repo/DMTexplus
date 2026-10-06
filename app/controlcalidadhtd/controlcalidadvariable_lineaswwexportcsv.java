package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadvariable_lineaswwexportcsv", "/app.controlcalidadhtd.controlcalidadvariable_lineaswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadvariable_lineaswwexportcsv extends GXWebObjectStub
{
   public controlcalidadvariable_lineaswwexportcsv( )
   {
   }

   public controlcalidadvariable_lineaswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadvariable_lineaswwexportcsv.class ));
   }

   public controlcalidadvariable_lineaswwexportcsv( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadvariable_lineaswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadvariable_lineaswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad Variable_lineas WWExport CSV";
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

